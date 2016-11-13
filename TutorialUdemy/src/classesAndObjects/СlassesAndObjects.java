package classesAndObjects;

//import pakiet.NewClass;//wczytujemy/importujemy klasę NewClass by była widoczna w klasie Application - nie potrzebne jak są w jednym pakiecie

public class СlassesAndObjects {

	public static void main(String[] args) {//main to sub-routine, wykonywaną w kółko, jest to główna metoda klasy
		
		NonPublicClass nonPublicClass1 = new NonPublicClass();//tworzymy nowy obiekt klasy NonPublicClass
		//przypisujemy wartości do instance variables
		nonPublicClass1.nazwa = "nazwa klasy"; 
		nonPublicClass1.liczba = 7;
		
		NonPublicClass nonPublicClass2 = new NonPublicClass();
		nonPublicClass2.nazwa = "inna nazwa klasy"; 
		nonPublicClass2.liczba = 5;
		
		System.out.println(nonPublicClass1.nazwa);//wyświetli "nazwa klasy"
	}
}