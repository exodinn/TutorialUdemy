package pojedyncze;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsLinkedHashSetHashSetTreeSet {
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();//hashset nie zapami�tuje porz�dku, elementy s� nieposegregowane
		
		Set<String> set2 = new LinkedHashSet<>();//LinkedHashSet zapami�tuje kolejno�� dodawania element�w
		
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
		
		System.out.println(set1);//wy�wietli wszystkie elementy kolekcji(set): [Mouse, Snake, Cat, Bear, Dog]
		
		set1.add("Dog");
		System.out.println(set1);//wy�wietli to samo co wy�ej): [Mouse, Snake, Cat, Bear, Dog]
		
		System.out.println(set2);//wy�wietli [Dog, Cat, Mouse, Snake, Bear] - elementy w kolejno�ci dodawania
		
		System.out.println(set3);//wy�wietli [Bear, Cat, Dog, Mouse, Snake], czyli w netural order - w tym przypadku alfabetycznie bo mamy String
		
		//iterowanie przez set
		for(String element : set1){
			System.out.println(element);
		}
		
		//przeszukiwanie setu w celu znalezienia konkretnego elementu
		if(set1.contains("Lol")){//szukamy elementu kt�rego nie ma
			System.out.println("Znalaz�em 'Lola'");
		}
		
		if(set1.contains("Cat")){//szukamy elementu "Cat" - powinien znale��
			System.out.println("Znalaz�em 'Kota'");
		}
		
		if(set1.isEmpty()){//sprawdzamy czy set (zbi�r) jest pusty
			System.out.println("Zbi�r jest pusty");
		}
		
		if(!set1.isEmpty()){//sprawdzamy czy set (zbi�r) jest nie pusty
			System.out.println("Zbi�r NIE jest pusty");
		}
		
		//Intersekction - krzy�owanie (elementy wsp�lne)
		Set<String> set4 = new LinkedHashSet<>();//tworzymy nowy set maj�cy tylko kilka wsp�lnych element�w co set1-set3 i kilka nowych
		set4.add("Dog");
		set4.add("Cat");
		set4.add("Pig");
		set4.add("Monkey");
		set4.add("Ant");
		
		Set<String> intersection = new LinkedHashSet<>(set1);//nowy set kt�ry b�dzie przechowywa� elementy wsp�lne, na pocz�tek kopiujemy do niego dane z set1
		System.out.println(intersection);//poka�e to samo co w set1
		
		intersection.retainAll(set4);//pobiera do nowej kolekcji tylko elementy kt�re s� w intersection oraz set4
		System.out.println(intersection);//poka�e tylko [Cat, Dog] - czyli cz�� wsp�ln� dla intersection(kopia set1) i set4
		
		
		//R�nice mi�dzy dwoma setami - elementy znajduj�ce si� w jednym secie i nieznajduj�ce si� w drugim
		//nowy set kt�ry b�dzie przechowywa� elementy unikalne (nie b�d�ce w set4, a  b�d�ce w set1), na pocz�tek kopiujemy do niego dane z set1
		Set<String> difference = new LinkedHashSet<>(set1);
		difference.removeAll(set4);//usuwa elementy kt�re sa w set
		System.out.println(difference);//wy�wietli [Mouse, Snake, Bear] - czyli elementy kt�re s� w set1 ale nie w set4
		
	}
}
