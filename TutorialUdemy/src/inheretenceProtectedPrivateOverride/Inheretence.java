package inheretenceProtectedPrivateOverride;

public class Inheretence {

	public static void main(String[] args) {	
		
		//gdy klasy nale�� do jednego pakietu nie trzeba u�ywa� import, wszystkie klasy wewn�trz pakietu sa dla siebie widoczne
		
		Machine maszyna = new Machine();
		maszyna.start();
		maszyna.stop();
		
		Car samochod = new Car();
		samochod.start();//dzia�a bo Car dziedziczy metody po Machine
		//Car ma metode wipieWindShield, kt�rej nie ma klasa Machine, klasa Car to rozszerzenie kasy Machine o np metod� wipieWindShield
		samochod.wipieWindShield();
		//maszyna.wipieWindShield();//nie zadzia�a
		samochod.stop();//wy�wietli Car stoppped bo nadpisali�my (override) metod� stop klasy od kt�rej dziedziczylismy czyli Machine
		samochod.showInfo();
		samochod.showModel();
		
		
		
		//je�li klasa jest typu final jak np String to nie mozna zbudowac klasy rozszerzaj�cej/dziedzicz�cej po String
		
		//nie powinno si� nadpisywac zmiennych (instance ani class variables)
		
	}
}