package inheretenceProtectedPrivateOverride;

//Car dziedziczy po Machine, Machine jest klas¹ rodzicem (Parent class), a Car klas¹ dzieckiem (Child class)
//mo¿na dziedziczyæ tylko po jednej klasie
public class Car extends Machine {
	
	public void wipieWindShield(){
		System.out.println("Wiping Windshield");
	}

	/*//nadpisujemy (override) metodê stop nale¿¹c¹ do klasy nadrzêdnej (od której dziedziczymy) Machine
	public void stop(){
		System.out.println("Car stopped.");
	}*/
	
	//nadpisaæ mo¿emy ³atwiej - klikamybprawym przyciskiem myszy gdziekolwiek w klasie gdzie chcemy nadpisaæ metodê
	//klikamy na source->override/implement methods i wybieramy metode któr¹ chcemy nadpisaæ i wyœwietli nam to:x	
	/*@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();//to wywy³ojê nam metodê nadrzêdn¹ (superimplementacjê metody)
	}*/
	
	//anotacja override nie jest niezbêdna jak widaæ w poprzednim przyk³adzie, anotacja to równie¿ klasa (jest pisana z du¿ej litery)
	//override dodajê siê po to, ¿e gdyby w przypadku gdy chcemy nadpisac metodê, ale nazwiemy j¹ inaczej ni¿ metodê
	//klasy nadrzêdnej (np czeski b³¹d) to kompilator poka¿e nam b³¹d
	@Override
	public void stop() {
		System.out.println("Car stopped.");
	}
	
	
	/*@Override//poka¿e b³¹d - nie ma w klasie nadrzêdnej metody stob - b³¹d
	public void stob() {
		System.out.println("Car stopped.");
	}*/
	
	
	/*
	//poka¿e b³¹d bo instance variable name jest prywatna dla klasy Machine i nie jest widoczna dla klasy Car
	//Machine.name is not visible
	public void showName(){
		System.out.println("Car name: " + name);
	}*/
	
	//info jest public wiêc jest widoczne dla Car, nie dodajemy importu bo jest jest wewn¹trz pakietu
	public void showInfo(){
		System.out.println(info);
	}
	
	//model jest protected wiêc jest widoczne dla klas dzieci (dziedzicz¹cych po Machine) oraz klas znajduj¹cych siê w tym samym pakiecie
	public void showModel(){
		System.out.println(model);
	}
}
