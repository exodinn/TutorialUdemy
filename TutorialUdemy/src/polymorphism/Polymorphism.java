package polymorphism;

import polymorphism.Plant;
import polymorphism.Tree;

public class Polymorphism {

	public static void main(String[] args) {	
		Plant roslina1 = new Plant();
		Tree drzewo = new Tree();
		
		/*//roslina2 wskazuje na ten sam obiekt na który wskazuje roslina1
		Plant roslina2 = roslina1;*/
		
		//w zwi¹zku z polimorfizmem i ¿e tree jest obiektem podklasy klasy Plant, mo¿na u¿yæ drzewo w ka¿dym miejscu,
		//w który chcielibysmy u¿yc roœlina
		//rosilna2 wskazuje teraz na obiekt tree
		Plant roslina2 = drzewo;
		
		roslina2.grow();//wyswietli Tree is growing
		
		drzewo.leaves();//to zadzia³a, bo metoda leaves() znajduje siê w klasie Tree
		
		//to nie zadzia³a, b³¹d, bo roslina2 jest klasy Plant i mimo tego, ¿e wskazuje na klasê Tree
		//to nie  mo¿e wywo³ywac metody, nie ma dostêpów do zmiennych, których nie ma w klasie Plant
		//roslina2.leaves();	
		
		//podobnie jak w przypadku - "Plant roslina2 = drzewo" - mo¿emy u¿yæ klasy nadrzêdnej wszedzie gdzie chcemy u¿yæ 
		//klasy podrzêdnej 
		doGrow(drzewo);
	}
	
	public static void doGrow(Plant roslina){
		roslina.grow();
	}
}
