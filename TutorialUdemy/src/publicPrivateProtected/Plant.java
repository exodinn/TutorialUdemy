package publicPrivateProtected;

public class Plant {
	//nie powinno si� deklarowa� instance variable jako public, to z�a praktyka, powinno si� je enkapsulowa� - robi� 
	//jako private i dodawac get i set
	public String name;
	
	//to jest OK, jak chcemy by sta�a by�a dost�pna z zewn�trz
	public final static int ID = 7;
	
	//to nie jest dostepne spoza klasy, niewidoczne np dla klasy Oak
	private String type;
	
	protected String size;
	
	//je�li nie zdefiniujemy czy jest public, private
	// czy protected to zmienna jest widoczna TYLKO wewn�trz pakietu!! - niewidoczna dla klas dziedzicz�cych!!!
	int height;
	
	public Plant(){
		this.name = "I am a plant";//mo�e by� this. ale nie musi
		type = "plant";
		size = "medium";
		height = 5;
	}
	
}

//to nie zadzia�a - mo�e by� tylko jedna klasa z modyfikatorem (public, private czy protected)
/*private class Species{
	
}*/

//ale mo�e by� klasa bez modifukatora, w jakiejklowiek ilo�ci
class Species{

}
