package interfaces;

public class Person implements Info{//Person r�wnie� implementuje (definiuje) metody interfejsu Info
	//klasa mo�e implementowa� dowaln� liczb� interfejs�w, s� one oddzielone przecinkami
	
	private String name;
	
	//mo�na stworzy� konstruktor klikaj�c PPM->Source->Genreate Contructor Method Using Fields
	//automatycznie w konstruktorze s� jako parametry instance variables
	public Person(String name) {
		//super();//nie jest potrzebne jak nie rozszerza/dziedziczy po �adnej klasie
		this.name = name;
	}



	public void greet(){
		System.out.println("Hello there.");
	}



	@Override
	public void showInfo() {//implementujemy metod� zdefiniowan� w interfejsie Info/nadpisujemy bo w Info tylko zadeklarowalismy metod�
		System.out.println("Person name is: " + name);
		
	}

}
