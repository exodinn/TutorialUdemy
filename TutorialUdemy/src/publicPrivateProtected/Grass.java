package publicPrivateProtected;

public class Grass extends Plant {
	
	public Grass(){
		//wywali b��d bo height nie jest ani private, public ani protected wi�c jest widoczny tylko wewn�trz pakietu
		//(A OBECNIE GRASS NIE JEST W TYM SAMYM PAKIECIE CO PLANT), mimo �e dziedziczy po Plant!!!!!!!!!!
		//System.out.println(height);
	}
}
