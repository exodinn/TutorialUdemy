package interfaces;

//zamiast tworzenia klasy dajemy PPM na Package Explorer->New->Interface
//Narazie Person i Machine nie s� w �aden spos�b powi�zane ze sob� - nie dziedzicz� od siebie czy wsp�lnej klasy
//ale chcemy stworzy� metod� showInfo pokazuj�c�/wy�wietlaj�c� warto�� instance variable dla poszczeg�lnych klas
//instance variable dla tych klas maj� r�n� nazw� i nawet typ

//!!!!!!!!!!!!!!!!!!!!!Nazwy interfejs�w powinny zaczynac si� od "I" (taka konwencja) np ICont, wi�c raczej Info to s�aba nazwa

//!!! cz�� ludzi zaczyna pisac program od definiowania/pisania interfejs�w i definicji ich metod 


//nie mo�na u�ywa� new je�li chodzi o interfejsy
public interface Info {
	
	public void showInfo();//interfejsy nie maj� nawet {}, maj� tylko headery metod, tylko deklaracja

}
