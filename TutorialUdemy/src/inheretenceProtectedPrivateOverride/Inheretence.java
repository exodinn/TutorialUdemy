package inheretenceProtectedPrivateOverride;

public class Inheretence {

	public static void main(String[] args) {	
		
		//gdy klasy nale¿¹ do jednego pakietu nie trzeba u¿ywaæ import, wszystkie klasy wewn¹trz pakietu sa dla siebie widoczne
		
		Machine maszyna = new Machine();
		maszyna.start();
		maszyna.stop();
		
		Car samochod = new Car();
		samochod.start();//dzia³a bo Car dziedziczy metody po Machine
		//Car ma metode wipieWindShield, której nie ma klasa Machine, klasa Car to rozszerzenie kasy Machine o np metodê wipieWindShield
		samochod.wipieWindShield();
		//maszyna.wipieWindShield();//nie zadzia³a
		samochod.stop();//wyœwietli Car stoppped bo nadpisaliœmy (override) metodê stop klasy od której dziedziczylismy czyli Machine
		samochod.showInfo();
		samochod.showModel();
		
		
		
		//jeœli klasa jest typu final jak np String to nie mozna zbudowac klasy rozszerzaj¹cej/dziedzicz¹cej po String
		
		//nie powinno siê nadpisywac zmiennych (instance ani class variables)
		
	}
}