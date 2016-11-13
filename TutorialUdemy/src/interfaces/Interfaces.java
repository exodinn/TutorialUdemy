package interfaces;

//import interfaces.*;

public class Interfaces {

	public static void main(String[] args) {	
		Machine maszyna = new Machine();
		maszyna.start();
		
		Person osoba = new Person("Mietek");
		osoba.greet();
		
		//mo�emy tak zrobi� bo Machine implementuje interfejs Info
		//tylko tu musimy my�le� jaka klasa ma implementowa� interfejs, p�niej tylko korzystamy z metod, kt�re ten interfejs ma
		//nie musimy p�niej przejmowa� jakiej klasy by� ten obiekt, tylko wywo�ujemy metod� interfejsu
		Info info1 = new Machine();
		info1.showInfo();
		
		//info2 mo�e wskazywa� na osoba, bo osoba jest klasy Person, kt�ra implementuje interfejs Info
		//info2 wskazuje na to same mmiejsce w pami�ci kt�re wskazuje osoba
		Info info2 = osoba;
		info2.showInfo();
		
		//mo�na redefiniowac info2 by wskazywa�o na inny obiekt - to jest poprawne
		info2 = maszyna;
		info2.showInfo();
		
		info2 = osoba;//spowrotem info2 wskazuje na osoba
		
		//mo�emy do output info wrzuci� jakikolwiek obiekt implementuj�cy interfejs Info i wywo�a� metod� zadeklarowan� w Info
		outputInfo(info1);
		outputInfo(info2);
	}
	
	//tworzymy metod� klasy Application. Klas� Application u�ywalismy dotychczas jedynie jako przechowalni� dla metody main
	//nie tworzyli�my obiekt�w klasy Application
	//dzi�ki temu do tej metody mo�emy wrzuca� r�ne obiekty, o ile implementuj� ten sam interfejs i chemy u�y� metod danego interfejsu
	private static void outputInfo(Info info){
		
		info.showInfo();
	}
}