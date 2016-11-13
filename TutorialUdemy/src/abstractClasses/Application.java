package abstractClasses;

public class Application {

	public static void main(String[] args) {
		
		Camera kamera = new Camera();
		kamera.setId(5);
		
		Car samochod = new Car();
		samochod.setId(4);
		
		//to jest bez sensu bo Machine sama w sobie nic nie wnosi, nie chcemy by mozna by�o tworzy� boiekt�w tej klasy, wi�c robimy Machine jako klase abstrakcyjn�
		//Machine maszyna = new Machine();//nie zadzia�a jak Machie b�dzie klasa abstrakcyjn�
		
		//Abstract class jest "mocniejsze" ni� tworzenie interfejsu bo m�wimy �e np. klasa Car jest (rozszerza) klas� Machine (jest maszyn�)
		//klasa mo�e mie� (dziedziczy�) tylko po jednej klasie abstrakcyjnej, natomiast klasa mo�e implementowac wiele interfejs�w
		
		//w interfejsie implementacja metody le�y ca�kowicie po stronie klasy implementuj�cej, w klasie abstrakcyjnej mo�emy definiowa� metod� np run();
		
		samochod.run();
	}
}
