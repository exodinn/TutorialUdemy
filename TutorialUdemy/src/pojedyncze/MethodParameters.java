package pojedyncze;

public class MethodParameters {

	public static void main(String[] args) {

		Robot robocik = new Robot();
		robocik.przemow();
		robocik.powiedz("Jestem debilem");//wywyo³ujemy metodê przekazuj¹c konkretn¹ wartoœæ parametru
		robocik.skocz(10);//wywyo³ujemy metodê przekazuj¹c konkretn¹ wartoœæ parametru
		robocik.ruszaj("zachód", 7.2);//wywyo³ujemy metodê przekazuj¹c konkretne wartoœci parametrów
		
		String jakisTekst = "Coœ powiedzia³em";
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
		System.out.println("Skoczy³em na wysokoœæ " + wysokosc + " metrów");
	}
	
	public void ruszaj(String kierunek, double odleglosc){//przekazujemy do metody 2 parametry typu String i typu int
		System.out.println("Poruszy³em siê w kierunku " + kierunek + " o odelg³oœæ " + odleglosc + " metrów");
	}

}