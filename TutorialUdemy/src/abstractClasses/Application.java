package abstractClasses;

public class Application {

	public static void main(String[] args) {
		
		Camera kamera = new Camera();
		kamera.setId(5);
		
		Car samochod = new Car();
		samochod.setId(4);
		
		//to jest bez sensu bo Machine sama w sobie nic nie wnosi, nie chcemy by mozna by³o tworzyæ boiektów tej klasy, wiêc robimy Machine jako klase abstrakcyjn¹
		//Machine maszyna = new Machine();//nie zadzia³a jak Machie bêdzie klasa abstrakcyjn¹
		
		//Abstract class jest "mocniejsze" ni¿ tworzenie interfejsu bo mówimy ¿e np. klasa Car jest (rozszerza) klas¹ Machine (jest maszyn¹)
		//klasa mo¿e mieæ (dziedziczyæ) tylko po jednej klasie abstrakcyjnej, natomiast klasa mo¿e implementowac wiele interfejsów
		
		//w interfejsie implementacja metody le¿y ca³kowicie po stronie klasy implementuj¹cej, w klasie abstrakcyjnej mo¿emy definiowaæ metodê np run();
		
		samochod.run();
	}
}
