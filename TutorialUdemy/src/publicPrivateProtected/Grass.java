package publicPrivateProtected;

public class Grass extends Plant {
	
	public Grass(){
		//wywali b³¹d bo height nie jest ani private, public ani protected wiêc jest widoczny tylko wewn¹trz pakietu
		//(A OBECNIE GRASS NIE JEST W TYM SAMYM PAKIECIE CO PLANT), mimo ¿e dziedziczy po Plant!!!!!!!!!!
		//System.out.println(height);
	}
}
