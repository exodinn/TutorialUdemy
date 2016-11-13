package pojedyncze;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {
	public static void main(String[] args) {
		//tworzymy nowy arrayList - rozszerzalny array (ci¹g) obiektów, nie mo¿na wrzucaæ typów prymitywnych
		ArrayList<Integer> numbers = new ArrayList<>();	
		//ArrayList<Integer> numbers = new ArrayList<>(20);	mo¿na zdefiniowaæ pocz¹tkow¹ wielkoœæ arrayList, ale nie trzeba, default to chyba 10
		
		//dodawanie
		numbers.add(10);
		numbers.add (4);
		numbers.add(100);
		
		//pozyskiwanie(retrieving) konkretnego obiektu listy
		System.out.println(numbers.get(0));//poka¿e 10
		
		//iterowanie po ca³ej liœcie obiektów
		System.out.println("Iterowanie #1");
		for(int i = 0; i < numbers.size(); i++){
			System.out.println(numbers.get(i));
		}
		
		//usuwanie elementu listy - trzeba uwa¿aæ - bo usuwanie ostatniego elementu jest szybkie, a usuwanie pierwego elementu bardzo wolne,bo
		//usuwa element pierwszy, kopiuje element drugi na miejsce pierwszego, kopiuje element trzeci w miejsce pierwszego i tak ca³a listê
		//a usuwaj¹c ostatni element po prostu skraca listê o jeden element
		//jak chcemy usun¹æ któryœ w pierwszych elementów lub œrodkowych w du¿ej liœcie lepiej u¿yæ linked list do tego
		numbers.remove(0);
		
		//iterowanie po ca³ej liœcie obiektów - inna metoda
		System.out.println("Iterowanie #2");
		for(Integer value : numbers){
			System.out.println(value);
		}
		
		//tak te¿ mo¿emy zrobiæ, bo List jest tylko interfejsem - ArrayList implementuje interfejs List, dopiero new ArrayList<>() okreœla jakiego typu 
		//ma to byæ List (jaka klasa ma implementowaæ interfejs List), values mo¿e wskazywac na cokolwiek co implementuje interfejs List!!
		List<String> values = new ArrayList<>();
		
	}
}

