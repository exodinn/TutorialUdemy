package inheretenceProtectedPrivateOverride;

//Car dziedziczy po Machine, Machine jest klas� rodzicem (Parent class), a Car klas� dzieckiem (Child class)
//mo�na dziedziczy� tylko po jednej klasie
public class Car extends Machine {
	
	public void wipieWindShield(){
		System.out.println("Wiping Windshield");
	}

	/*//nadpisujemy (override) metod� stop nale��c� do klasy nadrz�dnej (od kt�rej dziedziczymy) Machine
	public void stop(){
		System.out.println("Car stopped.");
	}*/
	
	//nadpisa� mo�emy �atwiej - klikamybprawym przyciskiem myszy gdziekolwiek w klasie gdzie chcemy nadpisa� metod�
	//klikamy na source->override/implement methods i wybieramy metode kt�r� chcemy nadpisa� i wy�wietli nam to:x	
	/*@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();//to wywy�oj� nam metod� nadrz�dn� (superimplementacj� metody)
	}*/
	
	//anotacja override nie jest niezb�dna jak wida� w poprzednim przyk�adzie, anotacja to r�wnie� klasa (jest pisana z du�ej litery)
	//override dodaj� si� po to, �e gdyby w przypadku gdy chcemy nadpisac metod�, ale nazwiemy j� inaczej ni� metod�
	//klasy nadrz�dnej (np czeski b��d) to kompilator poka�e nam b��d
	@Override
	public void stop() {
		System.out.println("Car stopped.");
	}
	
	
	/*@Override//poka�e b��d - nie ma w klasie nadrz�dnej metody stob - b��d
	public void stob() {
		System.out.println("Car stopped.");
	}*/
	
	
	/*
	//poka�e b��d bo instance variable name jest prywatna dla klasy Machine i nie jest widoczna dla klasy Car
	//Machine.name is not visible
	public void showName(){
		System.out.println("Car name: " + name);
	}*/
	
	//info jest public wi�c jest widoczne dla Car, nie dodajemy importu bo jest jest wewn�trz pakietu
	public void showInfo(){
		System.out.println(info);
	}
	
	//model jest protected wi�c jest widoczne dla klas dzieci (dziedzicz�cych po Machine) oraz klas znajduj�cych si� w tym samym pakiecie
	public void showModel(){
		System.out.println(model);
	}
}
