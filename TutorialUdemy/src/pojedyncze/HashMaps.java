package pojedyncze;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	public static void main(String[] args) {
		//mapy maja pary, z których jedna nazywa siê key(klucz) a druga value(wartoœæ)
		
		//HashMap mozna robiæ dla jakichkolwiek obiektów,ale nale¿y pamiêtaæ, ¿e jeœli robimy dla obiektów
		//jakieœ naszej customowej klasy, któr¹ stworzyliœmy to klasa ta musi implementowaæ metody equals oraz hashCode
		
		//HashMap nie jest w ¿aden sposób posortowana, wiêc iteruj¹c po liœcie mo¿emy mieæ za ka¿dym razem inn¹ kolejnoœæ par
		
		//String to value, Integer to key, Stringi sa trzymane pod Integerami (numerami), to jest rodzaj lookup table
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(5, "Five");//dodajemy pary do mapy
		map.put(2, "Two");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(10, "Ten-ish");
		map.put(10, "Ten");//gdy u¿ywamy tego samego klucza drugi raz to po prostu nadpisze poprzedni klucz
		
		String text = map.get(10);//pobieramy wartoœæ przechowywan¹ w mapie podaj¹c klucz do tej wartoœci
		System.out.println(text);//wyœwietli Ten
		
		text = map.get(1);//jesli próbujemy pobraæ wartoœæ za pomoc¹ klucza, który nie istanieje to wartoœæ bêdzie wynosiæ null
		System.out.println(text);//wyœwietli null
		
		//tak iterujemy przez ca³¹ mapê
		for(Map.Entry<Integer,String> entry : map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key is: " + key + " and Value is: " + value);
		}
	}
}