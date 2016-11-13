package pojedyncze;

public class StaticAndFinal {

	public static void main(String[] args) {
		System.out.println("Before creation of 1st object count is: " + Thing.count);//pokazuje 0
		Thing thing1 = new Thing();
		System.out.println("After creation of 1st object count is: " + Thing.count);//pokazuje 1
		Thing thing2 = new Thing();		
		thing1.name = "Krzeslo";
		thing2.name = "Drzewo";
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		
		//thing1.description = "Opis";//to jest nieprawid�owe u�ycie, pokazuje warning
		Thing.description = "Opis";
		System.out.println(Thing.description);
		
		thing1.showName();
		thing2.showName();
		
		//thing1.showInfo();//to jest nieprawid�owe u�ycie, pokazuje warning
		Thing.showInfo();//metody static wywo�ujemy prze klas� a nie obiekt
		
		System.out.println(Math.PI);//PI jest constantem i u�ywamy statica r�wnie� do constant�w/sta�ych, nie mo�na jej zmieni�
		//Math.PI = 3;//wywali b��d
		
		System.out.println(Thing.LUCKY_NUMBER);//u�ycie sta�ej
		
		System.out.println("ID of thing1: " + thing1.id);//pokazuje 0
		System.out.println("ID of thing2: " + thing2.id);//pokazuje 1
		
		
	}
}

class Thing {
	//constant/sta�e piszemy z du�ych liter (snake_case), static=sta�e dla klasy, final=niezmienne, nie da si� zmieni� jej warto�ci
	//maj�c final trzeba od razu nada� jej jak�� warto��
	public final static int LUCKY_NUMBER = 7;
	
	//w�a�nie dlatego, �e jaka� zmienna nie jest static, jest ona nazywa instance variable, bo za ka�dym wyst�pieniem obiektu
	//tworzony jest nowy "przypadek" (instance) tej zmiennej
	public String name;
	
	public int id;//chemy mie� unikalny numer(id) obiektu, wi�c mo�emy u�y� statycznej zmiennej count
	
	public static int count = 0;//static u�y� mo�na r�wnie� do okreslenia liczby obiekt�w danej klasy wtedy w konstruktorze/rach musimy zlicza� kolejne u�ycia(nowe obiekty)
	
	public Thing(){
		id = count;//nadajemy unikalny numer ka�demu obiektowi
		count++;//by m�c obliczy� ilo�� obiekt�w danej klasy
	}
	
	//dla static ka�dy obiekt nie ma swojej kopii/wersji tej zmiennej, jest ona jednakowa dla wszystkich obiekt�w tej klasy
	//odnosimy si� do niej nie: thing1.description = "co�", tylko do ca�ej klasy: Thing.description = "co�"
	//zmienne static nazywa s� class variable bo nale�� do klasy a nie do poszczeg�lnych przypadk�w/obiekt�w (instance)
	public static String description;
	
	//niestatyczne metody maj� dost�p dost�p do statycznych zmiennych
	public void showName(){
		System.out.println(name + " : " + description);//to b�dzie dzia�a�o
	}
	
	//metody static wywo�ujemy prze klas� a nie obiekt
	//metoda statyczna "istanieje" zanim nawet utworzymy obiekt tej klasy, wi�c nie mo�e wiedzie� jakie warto�ci maj�
	//niestetyczne zmienne - instance variables
	//statyczne metody u�ywamy gdy metoda nigdy nie u�ywa/nie potrzebuje statycznych zmiennych - instance variable
	public static void showInfo(){
		System.out.println(description);//metody statyczne mog� korzysta� tylko ze zmiennych statycznych - class variable
		//System.out.println(name);//statyczna metoda nie mo�na odnosi� si� do niestatycznej zmiennej, pokazuje b��d
	}

}