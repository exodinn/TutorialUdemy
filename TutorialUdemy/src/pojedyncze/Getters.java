package pojedyncze;

public class Getters {

	public static void main(String[] args) {

		Osoba osoba1 = new Osoba();
		osoba1.imie = "Jan Kowalski";//instance variable jest publiczna wiêc mamy do niej bezpoœredni dostêp
		osoba1.wiek = 21;
		osoba1.przemow();
		
		Osoba osoba2 = new Osoba();
		osoba2.imie = "Mieciu Malinowski";
		osoba2.wiek = 55;
		osoba2.przemow();
		
		osoba1.ileLatDoEmeryturyNieZwraca();
		
		int lata = osoba2.ileLatDoEmeryturyZwraca();
		System.out.println("Lat do emerytury: " + lata);
		
		int wiek = osoba1.getWiek();
		System.out.println(wiek);//wyœwietli 21
		
		String imie = osoba2.getImie();
		System.out.println(imie);//wyœwietli Mieciu Malinowski

	}
}

class Osoba {
	//int, double s¹ typami prymitywnymi, natomiast String nie jest, bo jest to klasa (String jest pisany z du¿ej litery, a int z ma³ej)
	//Obiekt reprezentuj¹cy int(typ prymitywny) to Integer (klasa)
	//wiek to wartoœæ, imie to referencja/odnoœnik do obszaru pamiêci przechowuj¹cego Stringa
	String imie;//obie instance variable s¹ publiczne i jest do nich dostêp spoza klasy
	int wiek;

	void przemow() {
		System.out.println("Hejka, nazywam siê " + imie + " i mam " + wiek + " lat");
	}
	
	void ileLatDoEmeryturyNieZwraca(){//metoda nic nie zwraca
		int lataDoEmerytury = 65 - wiek;
		
		System.out.println("Ja mam " + lataDoEmerytury + " lat do emerytury");
	}
	
	int ileLatDoEmeryturyZwraca(){//metoda zwraca wiek do emerytury typu int
		int lataDoEmerytury = 65 - wiek;
		
		return lataDoEmerytury;
	}
	
	int getWiek(){//zwraca wiek danej osoby
		return wiek;
	}
	
	String getImie(){//zwraca imie
		return imie;
	}

}