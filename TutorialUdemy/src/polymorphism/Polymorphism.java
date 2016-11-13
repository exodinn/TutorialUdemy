package polymorphism;

import polymorphism.Plant;
import polymorphism.Tree;

public class Polymorphism {

	public static void main(String[] args) {	
		Plant roslina1 = new Plant();
		Tree drzewo = new Tree();
		
		/*//roslina2 wskazuje na ten sam obiekt na kt�ry wskazuje roslina1
		Plant roslina2 = roslina1;*/
		
		//w zwi�zku z polimorfizmem i �e tree jest obiektem podklasy klasy Plant, mo�na u�y� drzewo w ka�dym miejscu,
		//w kt�ry chcielibysmy u�yc ro�lina
		//rosilna2 wskazuje teraz na obiekt tree
		Plant roslina2 = drzewo;
		
		roslina2.grow();//wyswietli Tree is growing
		
		drzewo.leaves();//to zadzia�a, bo metoda leaves() znajduje si� w klasie Tree
		
		//to nie zadzia�a, b��d, bo roslina2 jest klasy Plant i mimo tego, �e wskazuje na klas� Tree
		//to nie  mo�e wywo�ywac metody, nie ma dost�p�w do zmiennych, kt�rych nie ma w klasie Plant
		//roslina2.leaves();	
		
		//podobnie jak w przypadku - "Plant roslina2 = drzewo" - mo�emy u�y� klasy nadrz�dnej wszedzie gdzie chcemy u�y� 
		//klasy podrz�dnej 
		doGrow(drzewo);
	}
	
	public static void doGrow(Plant roslina){
		roslina.grow();
	}
}
