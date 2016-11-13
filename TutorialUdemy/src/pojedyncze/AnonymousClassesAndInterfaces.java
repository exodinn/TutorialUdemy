package pojedyncze;

public class AnonymousClassesAndInterfaces {

	public static void main(String[] args) {	
		
		//klasa anonimowa (anonymous class) - po new <NazwaKlasy> otwieram nawias klamrowy i mogê nadpisaæ jednorazowo metody
		//to tak naprawde nie jest ju¿ obiekt klasy Machine tylko obiekt dziecko dziedzicz¹cy po Machine, ta nowa klasa nie ma nazwy
		Maszynka maszyna = new Maszynka(){
			@Override
			public void start(){
				System.out.println("Machine starts in different was.");
			}
		};
		
		maszyna.start();
		
		//to nie zadzia³a bo Plantt to interfejs wiêc nie mo¿na zrobiæ jego instacji (nie mo¿na go instantialize)
		//Plant roslina = new Plantt();
		
		//mo¿emy u¿yæ klasy anonimowej do zaimplementowania metod interfejsu, inaczej byœmy musieli swtorzyæ now¹ klasê implementuj¹ca ten interfejs
		//a nastêpnie zaimplementowac metody interfejsu w tej nowej klasie
		Plantt roslina = new Plantt(){
			@Override
			public void grow(){
				System.out.println("Plant is growing.");
			}
		};
		roslina.grow();
	}
}

class Maszynka{
	public void start(){
		System.out.println("Machine starts.");
	}
}

interface Plantt{
	public void grow();
}