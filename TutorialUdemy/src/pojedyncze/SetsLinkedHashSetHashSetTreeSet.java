package pojedyncze;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsLinkedHashSetHashSetTreeSet {
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();//hashset nie zapamiêtuje porz¹dku, elementy s¹ nieposegregowane
		
		Set<String> set2 = new LinkedHashSet<>();//LinkedHashSet zapamiêtuje kolejnoœæ dodawania elementów
		
		Set<String> set3 = new TreeSet<>();
		
		set1.add("Dog");
		set1.add("Cat");
		set1.add("Mouse");
		set1.add("Snake");
		set1.add("Bear");
		
		set2.add("Dog");
		set2.add("Cat");
		set2.add("Mouse");
		set2.add("Snake");
		set2.add("Bear");
		
		set3.add("Dog");
		set3.add("Cat");
		set3.add("Mouse");
		set3.add("Snake");
		set3.add("Bear");
		
		System.out.println(set1);//wyœwietli wszystkie elementy kolekcji(set): [Mouse, Snake, Cat, Bear, Dog]
		
		set1.add("Dog");
		System.out.println(set1);//wyœwietli to samo co wy¿ej): [Mouse, Snake, Cat, Bear, Dog]
		
		System.out.println(set2);//wyœwietli [Dog, Cat, Mouse, Snake, Bear] - elementy w kolejnoœci dodawania
		
		System.out.println(set3);//wyœwietli [Bear, Cat, Dog, Mouse, Snake], czyli w netural order - w tym przypadku alfabetycznie bo mamy String
		
		//iterowanie przez set
		for(String element : set1){
			System.out.println(element);
		}
		
		//przeszukiwanie setu w celu znalezienia konkretnego elementu
		if(set1.contains("Lol")){//szukamy elementu którego nie ma
			System.out.println("Znalaz³em 'Lola'");
		}
		
		if(set1.contains("Cat")){//szukamy elementu "Cat" - powinien znaleŸæ
			System.out.println("Znalaz³em 'Kota'");
		}
		
		if(set1.isEmpty()){//sprawdzamy czy set (zbiór) jest pusty
			System.out.println("Zbiór jest pusty");
		}
		
		if(!set1.isEmpty()){//sprawdzamy czy set (zbiór) jest nie pusty
			System.out.println("Zbiór NIE jest pusty");
		}
		
		//Intersekction - krzy¿owanie (elementy wspólne)
		Set<String> set4 = new LinkedHashSet<>();//tworzymy nowy set maj¹cy tylko kilka wspólnych elementów co set1-set3 i kilka nowych
		set4.add("Dog");
		set4.add("Cat");
		set4.add("Pig");
		set4.add("Monkey");
		set4.add("Ant");
		
		Set<String> intersection = new LinkedHashSet<>(set1);//nowy set który bêdzie przechowywa³ elementy wspólne, na pocz¹tek kopiujemy do niego dane z set1
		System.out.println(intersection);//poka¿e to samo co w set1
		
		intersection.retainAll(set4);//pobiera do nowej kolekcji tylko elementy które s¹ w intersection oraz set4
		System.out.println(intersection);//poka¿e tylko [Cat, Dog] - czyli czêœæ wspóln¹ dla intersection(kopia set1) i set4
		
		
		//Ró¿nice miêdzy dwoma setami - elementy znajduj¹ce siê w jednym secie i nieznajduj¹ce siê w drugim
		//nowy set który bêdzie przechowywa³ elementy unikalne (nie bêd¹ce w set4, a  bêd¹ce w set1), na pocz¹tek kopiujemy do niego dane z set1
		Set<String> difference = new LinkedHashSet<>(set1);
		difference.removeAll(set4);//usuwa elementy które sa w set
		System.out.println(difference);//wyœwietli [Mouse, Snake, Bear] - czyli elementy które s¹ w set1 ale nie w set4
		
	}
}
