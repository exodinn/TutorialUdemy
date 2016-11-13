package publicPrivateProtected;

public class Plant {
	//nie powinno siê deklarowaæ instance variable jako public, to z³a praktyka, powinno siê je enkapsulowaæ - robiæ 
	//jako private i dodawac get i set
	public String name;
	
	//to jest OK, jak chcemy by sta³a by³a dostêpna z zewn¹trz
	public final static int ID = 7;
	
	//to nie jest dostepne spoza klasy, niewidoczne np dla klasy Oak
	private String type;
	
	protected String size;
	
	//jeœli nie zdefiniujemy czy jest public, private
	// czy protected to zmienna jest widoczna TYLKO wewn¹trz pakietu!! - niewidoczna dla klas dziedzicz¹cych!!!
	int height;
	
	public Plant(){
		this.name = "I am a plant";//mo¿e byæ this. ale nie musi
		type = "plant";
		size = "medium";
		height = 5;
	}
	
}

//to nie zadzia³a - mo¿e byæ tylko jedna klasa z modyfikatorem (public, private czy protected)
/*private class Species{
	
}*/

//ale mo¿e byæ klasa bez modifukatora, w jakiejklowiek iloœci
class Species{

}
