package pojedyncze;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {
	public static void main(String[] args) {
		//tworzymy nowy arrayList - rozszerzalny array (ci�g) obiekt�w, nie mo�na wrzuca� typ�w prymitywnych
		ArrayList<Integer> numbers = new ArrayList<>();	
		//ArrayList<Integer> numbers = new ArrayList<>(20);	mo�na zdefiniowa� pocz�tkow� wielko�� arrayList, ale nie trzeba, default to chyba 10
		
		//dodawanie
		numbers.add(10);
		numbers.add (4);
		numbers.add(100);
		
		//pozyskiwanie(retrieving) konkretnego obiektu listy
		System.out.println(numbers.get(0));//poka�e 10
		
		//iterowanie po ca�ej li�cie obiekt�w
		System.out.println("Iterowanie #1");
		for(int i = 0; i < numbers.size(); i++){
			System.out.println(numbers.get(i));
		}
		
		//usuwanie elementu listy - trzeba uwa�a� - bo usuwanie ostatniego elementu jest szybkie, a usuwanie pierwego elementu bardzo wolne,bo
		//usuwa element pierwszy, kopiuje element drugi na miejsce pierwszego, kopiuje element trzeci w miejsce pierwszego i tak ca�a list�
		//a usuwaj�c ostatni element po prostu skraca list� o jeden element
		//jak chcemy usun�� kt�ry� w pierwszych element�w lub �rodkowych w du�ej li�cie lepiej u�y� linked list do tego
		numbers.remove(0);
		
		//iterowanie po ca�ej li�cie obiekt�w - inna metoda
		System.out.println("Iterowanie #2");
		for(Integer value : numbers){
			System.out.println(value);
		}
		
		//tak te� mo�emy zrobi�, bo List jest tylko interfejsem - ArrayList implementuje interfejs List, dopiero new ArrayList<>() okre�la jakiego typu 
		//ma to by� List (jaka klasa ma implementowa� interfejs List), values mo�e wskazywac na cokolwiek co implementuje interfejs List!!
		List<String> values = new ArrayList<>();
		
	}
}

