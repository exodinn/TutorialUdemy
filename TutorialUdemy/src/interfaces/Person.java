package interfaces;

public class Person implements Info{//Person równie¿ implementuje (definiuje) metody interfejsu Info
	//klasa mo¿e implementowaæ dowaln¹ liczbê interfejsów, s¹ one oddzielone przecinkami
	
	private String name;
	
	//mo¿na stworzyæ konstruktor klikaj¹c PPM->Source->Genreate Contructor Method Using Fields
	//automatycznie w konstruktorze s¹ jako parametry instance variables
	public Person(String name) {
		//super();//nie jest potrzebne jak nie rozszerza/dziedziczy po ¿adnej klasie
		this.name = name;
	}



	public void greet(){
		System.out.println("Hello there.");
	}



	@Override
	public void showInfo() {//implementujemy metodê zdefiniowan¹ w interfejsie Info/nadpisujemy bo w Info tylko zadeklarowalismy metodê
		System.out.println("Person name is: " + name);
		
	}

}
