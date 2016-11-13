package interfaces;

//import interfaces.*;

public class Interfaces {

	public static void main(String[] args) {	
		Machine maszyna = new Machine();
		maszyna.start();
		
		Person osoba = new Person("Mietek");
		osoba.greet();
		
		//mo¿emy tak zrobiæ bo Machine implementuje interfejs Info
		//tylko tu musimy myœleæ jaka klasa ma implementowaæ interfejs, póŸniej tylko korzystamy z metod, które ten interfejs ma
		//nie musimy póŸniej przejmowaæ jakiej klasy by³ ten obiekt, tylko wywo³ujemy metodê interfejsu
		Info info1 = new Machine();
		info1.showInfo();
		
		//info2 mo¿e wskazywaæ na osoba, bo osoba jest klasy Person, która implementuje interfejs Info
		//info2 wskazuje na to same mmiejsce w pamiêci które wskazuje osoba
		Info info2 = osoba;
		info2.showInfo();
		
		//mo¿na redefiniowac info2 by wskazywa³o na inny obiekt - to jest poprawne
		info2 = maszyna;
		info2.showInfo();
		
		info2 = osoba;//spowrotem info2 wskazuje na osoba
		
		//mo¿emy do output info wrzuciæ jakikolwiek obiekt implementuj¹cy interfejs Info i wywo³aæ metodê zadeklarowan¹ w Info
		outputInfo(info1);
		outputInfo(info2);
	}
	
	//tworzymy metodê klasy Application. Klasê Application u¿ywalismy dotychczas jedynie jako przechowalniê dla metody main
	//nie tworzyliœmy obiektów klasy Application
	//dziêki temu do tej metody mo¿emy wrzucaæ ró¿ne obiekty, o ile implementuj¹ ten sam interfejs i chemy u¿yæ metod danego interfejsu
	private static void outputInfo(Info info){
		
		info.showInfo();
	}
}