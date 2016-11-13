package publicPrivateProtected;

/*
 * private - dostêpny tylko wewn¹trz klasy
 * public - dostêpny wszêdzie
 * protected - dostêpny tylko dla klas dziedzicz¹cych (subclasses) lub w tym samym pakiecie
 * bez niczego/bez modyfikatora (modifier) - dostepny tylko dla klas w tym samym pakiecie
 */

import publicPrivateProtected.Plant;

public class PublicPrivateProtected {

	public static void main(String[] args) {	
		Plant roslina = new Plant();
		System.out.println(roslina.name);
		System.out.println(roslina.ID);
		//System.out.println(roslina.type);//to nie zadzia³a, type jest typu private, nie jest widoczny z zewn¹trz klasy
		//System.out.println(roslina.size);//to nie zadzia³a, type jest typu pritected, jest wdoczny tylko dla klas dziedzicz¹cych lub klas bêd¹cych w tym samym pakiecie (obecnie Application i Plant sa w innych pakietach)
		//System.out.println(roslina.height);//nie dzia³a bo Application i Plant nie sa w tym samym pakiecie (obecnie Application i Plant sa w innych pakietach)
	}
}
