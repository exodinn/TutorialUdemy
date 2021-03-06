package passingByValueVsPassingByReference;

public class PassingByValue {
	public static void main(String[] args) {
		//tworzymy obiekt klasy PassingByValue, teraz mo�emy u�y� wewn�trz klasy niestatyczne metody klasy PassingByValue
		PassingByValue app = new PassingByValue();
		
	
		int value = 7;
		System.out.println("1. Value is: " + value);//pokaze 1.Value is: 7
		//pokaze 2.Value is: 7, kopiujemy warto�� ze zmiennej value z main do metody (a dok�adniej do zmiennej value w metodzie) tej metody, to si� nazywa passing by value
		app.show(value);
		
		System.out.println("4. Value is: " + value);//poka�e 7,	do metodzy przekazali�my jedynie kopi� zmiennej value a nie odno�nik (reference) do value
		
		//----------------------------------------------------------
		System.out.println();
		//wy�ej by�o passing by value, dla obiekt�w te� mamy passing by value, tylko, �e do metod nie kopujemy warto�ci, tylko adresy zmiennych
		//w Javie nie ma passing by reference bo to by oznacza�o, �e gdybysmy zmienili co� w obiekcie w metodzie to poza metod� widoczna by by�a
		//ta zmiana - a jak wida� dla 4. Person is: Person [name = Mietek] - metoda nie zmieni�a (na sta�e) warto�ci name dla osoba - zmiana nast�pi�a
		//tylko wewn�trz metody, bo wrzucili�my do niej tylko kopi� adresu, a nie adres
		
		//osoba tylko przechowuje adres miejsca przechowywania obiektu Person; dopiero new Person("Mietek") alokuje pami�� dla obiektu Person
		Person osoba = new Person("Mietek");
		
		System.out.println("1. Person is: " + osoba);//wy�wietli 1. Person is: Person [name = Mietek]
		app.show(osoba);//przekazuje kopi� adresu obiektu osoba do metody
		
		System.out.println("4. Person is: " + osoba);//wy�wietli 4. Person is: Person [name = Mietek], chyba, �e dodamy osoba.setName("Waldek") w metodzie
		
	}
	
	public void show(int value) {
		System.out.println("2. Value is: " + value);//poka�e 7
		//zmieniamy warto�� value, ale tylko kopii value przekazanej jako parametr metody, kt�ra jest widoczna tylko w tej metodzie, a niewidoczna poza ni�
		value = 8;
		System.out.println("3. Value is: " + value);//poka�e 8
	}
	//prze�adowanie metody (method overloading), jako parametr wchodzi adres do obiektu Person
	public void show(Person osoba){
		System.out.println("2. Person is: " + osoba);//wy�wietli 2. Person is: Person [name = Mietek]
		
		//tu na sta�e zmienimy warto�� osoba, bo metoda ma kopi� adresu osoba z maina i adres ten wskazuje na obiket osoba z maina
		osoba.setName("Waldek");
		
		osoba = new Person("Zdzichu");//tu przypisujemy osoba nowy adres pami�ci do nowego obiektu Person, osoba w metodzie i osoba w main to dwie r�ne zmienne
		osoba.setName("Wlodek");//tu nie zmienimy warto�ci osoba z main bo osoba z metody przechowuje juz adres do innego obiektu ni� osoba z main
		System.out.println("3. Person is: " + osoba);//wy�wietli 3. Person is: Person [name = Zdzochu]
	}
}

