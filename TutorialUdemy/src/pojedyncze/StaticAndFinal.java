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
		
		//thing1.description = "Opis";//to jest nieprawid³owe u¿ycie, pokazuje warning
		Thing.description = "Opis";
		System.out.println(Thing.description);
		
		thing1.showName();
		thing2.showName();
		
		//thing1.showInfo();//to jest nieprawid³owe u¿ycie, pokazuje warning
		Thing.showInfo();//metody static wywo³ujemy prze klasê a nie obiekt
		
		System.out.println(Math.PI);//PI jest constantem i u¿ywamy statica równie¿ do constantów/sta³ych, nie mo¿na jej zmieniæ
		//Math.PI = 3;//wywali b³¹d
		
		System.out.println(Thing.LUCKY_NUMBER);//u¿ycie sta³ej
		
		System.out.println("ID of thing1: " + thing1.id);//pokazuje 0
		System.out.println("ID of thing2: " + thing2.id);//pokazuje 1
		
		
	}
}

class Thing {
	//constant/sta³e piszemy z du¿ych liter (snake_case), static=sta³e dla klasy, final=niezmienne, nie da siê zmieniæ jej wartoœci
	//maj¹c final trzeba od razu nadaæ jej jak¹œ wartoœæ
	public final static int LUCKY_NUMBER = 7;
	
	//w³aœnie dlatego, ¿e jakaœ zmienna nie jest static, jest ona nazywa instance variable, bo za ka¿dym wyst¹pieniem obiektu
	//tworzony jest nowy "przypadek" (instance) tej zmiennej
	public String name;
	
	public int id;//chemy mieæ unikalny numer(id) obiektu, wiêc mo¿emy u¿yæ statycznej zmiennej count
	
	public static int count = 0;//static u¿yæ mo¿na równie¿ do okreslenia liczby obiektów danej klasy wtedy w konstruktorze/rach musimy zliczaæ kolejne u¿ycia(nowe obiekty)
	
	public Thing(){
		id = count;//nadajemy unikalny numer ka¿demu obiektowi
		count++;//by móc obliczyæ iloœæ obiektów danej klasy
	}
	
	//dla static ka¿dy obiekt nie ma swojej kopii/wersji tej zmiennej, jest ona jednakowa dla wszystkich obiektów tej klasy
	//odnosimy siê do niej nie: thing1.description = "coœ", tylko do ca³ej klasy: Thing.description = "coœ"
	//zmienne static nazywa s¹ class variable bo nale¿¹ do klasy a nie do poszczególnych przypadków/obiektów (instance)
	public static String description;
	
	//niestatyczne metody maj¹ dostêp dostêp do statycznych zmiennych
	public void showName(){
		System.out.println(name + " : " + description);//to bêdzie dzia³a³o
	}
	
	//metody static wywo³ujemy prze klasê a nie obiekt
	//metoda statyczna "istanieje" zanim nawet utworzymy obiekt tej klasy, wiêc nie mo¿e wiedzieæ jakie wartoœci maj¹
	//niestetyczne zmienne - instance variables
	//statyczne metody u¿ywamy gdy metoda nigdy nie u¿ywa/nie potrzebuje statycznych zmiennych - instance variable
	public static void showInfo(){
		System.out.println(description);//metody statyczne mog¹ korzystaæ tylko ze zmiennych statycznych - class variable
		//System.out.println(name);//statyczna metoda nie mo¿na odnosiæ siê do niestatycznej zmiennej, pokazuje b³¹d
	}

}