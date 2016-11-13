package pojedyncze;

public class Methods {

	public static void main(String[] args) {

		Person osoba1 = new Person();
		osoba1.imie = "Jan Kowalski";
		osoba1.wiek = 21;
		
		osoba1.przemow();//u�ycie/przywo�anie metody przez obiekt osoba1 - wy�wietli Hejka, nazywam si� Jan Kowalski i mam 21 lat

		Person osoba2 = new Person();
		osoba2.imie = "Mieciu Malinowski";
		osoba2.wiek = 55;
		
		osoba2.przemow();//u�ycie/przywo�anie metody przez obiekt osoba2 - wy�wietli Hejka, nazywam si� Mieciu Malinowski i mam 55 lat

		osoba1.powiedzSiemka();
		System.out.println(osoba1.imie);
	}
}

class Person {// klasa niepubliczna
	// klasy moga zawiera�:
	// 1. dane (stany) - instance variables
	String imie;
	int wiek;

	// 2. sub-routine'y / metody
	void przemow() {// przyk��dowa metoda
		System.out.println("Hejka, nazywam si� " + imie + " i mam " + wiek + " lat");
	}
	
	void powiedzSiemka(){
		System.out.println("Siemka");
	}

}