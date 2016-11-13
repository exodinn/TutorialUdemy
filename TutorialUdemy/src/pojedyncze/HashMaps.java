package pojedyncze;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	public static void main(String[] args) {
		//mapy maja pary, z kt�rych jedna nazywa si� key(klucz) a druga value(warto��)
		
		//HashMap mozna robi� dla jakichkolwiek obiekt�w,ale nale�y pami�ta�, �e je�li robimy dla obiekt�w
		//jakie� naszej customowej klasy, kt�r� stworzyli�my to klasa ta musi implementowa� metody equals oraz hashCode
		
		//HashMap nie jest w �aden spos�b posortowana, wi�c iteruj�c po li�cie mo�emy mie� za ka�dym razem inn� kolejno�� par
		
		//String to value, Integer to key, Stringi sa trzymane pod Integerami (numerami), to jest rodzaj lookup table
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(5, "Five");//dodajemy pary do mapy
		map.put(2, "Two");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(10, "Ten-ish");
		map.put(10, "Ten");//gdy u�ywamy tego samego klucza drugi raz to po prostu nadpisze poprzedni klucz
		
		String text = map.get(10);//pobieramy warto�� przechowywan� w mapie podaj�c klucz do tej warto�ci
		System.out.println(text);//wy�wietli Ten
		
		text = map.get(1);//jesli pr�bujemy pobra� warto�� za pomoc� klucza, kt�ry nie istanieje to warto�� b�dzie wynosi� null
		System.out.println(text);//wy�wietli null
		
		//tak iterujemy przez ca�� map�
		for(Map.Entry<Integer,String> entry : map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key is: " + key + " and Value is: " + value);
		}
	}
}