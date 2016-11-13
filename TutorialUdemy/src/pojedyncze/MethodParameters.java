package pojedyncze;

public class MethodParameters {

	public static void main(String[] args) {

		Robot robocik = new Robot();
		robocik.przemow();
		robocik.powiedz("Jestem debilem");//wywyo�ujemy metod� przekazuj�c konkretn� warto�� parametru
		robocik.skocz(10);//wywyo�ujemy metod� przekazuj�c konkretn� warto�� parametru
		robocik.ruszaj("zach�d", 7.2);//wywyo�ujemy metod� przekazuj�c konkretne warto�ci parametr�w
		
		String jakisTekst = "Co� powiedzia�em";
		robocik.powiedz(jakisTekst);
	}
}

class Robot {

	public void przemow() {
		System.out.println("Hejka");
	}
	
	public void powiedz(String tekst) {//przekazujemy do metody parametr typu String
		System.out.println(tekst);
	}
	
	public void skocz(int wysokosc){//przekazujemy do metody parametr typu int
		System.out.println("Skoczy�em na wysoko�� " + wysokosc + " metr�w");
	}
	
	public void ruszaj(String kierunek, double odleglosc){//przekazujemy do metody 2 parametry typu String i typu int
		System.out.println("Poruszy�em si� w kierunku " + kierunek + " o odelg�o�� " + odleglosc + " metr�w");
	}

}