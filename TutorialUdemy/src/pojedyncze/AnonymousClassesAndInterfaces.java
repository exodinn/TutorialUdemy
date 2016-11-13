package pojedyncze;

public class AnonymousClassesAndInterfaces {

	public static void main(String[] args) {	
		
		//klasa anonimowa (anonymous class) - po new <NazwaKlasy> otwieram nawias klamrowy i mog� nadpisa� jednorazowo metody
		//to tak naprawde nie jest ju� obiekt klasy Machine tylko obiekt dziecko dziedzicz�cy po Machine, ta nowa klasa nie ma nazwy
		Maszynka maszyna = new Maszynka(){
			@Override
			public void start(){
				System.out.println("Machine starts in different was.");
			}
		};
		
		maszyna.start();
		
		//to nie zadzia�a bo Plantt to interfejs wi�c nie mo�na zrobi� jego instacji (nie mo�na go instantialize)
		//Plant roslina = new Plantt();
		
		//mo�emy u�y� klasy anonimowej do zaimplementowania metod interfejsu, inaczej by�my musieli swtorzy� now� klas� implementuj�ca ten interfejs
		//a nast�pnie zaimplementowac metody interfejsu w tej nowej klasie
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