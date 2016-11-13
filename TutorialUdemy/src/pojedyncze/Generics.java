package pojedyncze;

import java.util.ArrayList;
import java.util.HashMap;

public class Generics {

	public static void main(String[] args) {	
		//generyczna klasa (genric class) to klasa któr¹ mo¿e dzia³aæ z innymi obiektami wybranych przez nas klas
		
		///////////////////////przed Java5
		ArrayList lista = new ArrayList();///array(ci¹g znaków) o nieokreœlonej d³ugoœci, moze przechowywac obiekty
		
		lista.add("Apple");
		lista.add("Banana");
		lista.add("Orange");
		
		String friut = (String) lista.get(0);//trzeba downcast zrobiæ z typu Object na String
		System.out.println(friut);
		
		///////////////////////po Javie5
		ArrayList<String> strings = new ArrayList<String>();//ArrayList to klasa genryczna
		
		strings.add("Cat");
		strings.add("Dog");
		strings.add("Pig");
		
		//nie trzeba robiæ downcast (rzutu) bo definiuj¹c strings - klase genryczna u¿yliœmy konstruktora przyjmuj¹cego String, mówi¹c tym samym, ¿e
		//ArrayList bêdzie przyjmowa³ Stringi
		String animal = strings.get(0);
		System.out.println(animal);
		
		
		///////////////////////do klasy genrycznej moze wchodziæ wiêcej ni¿ jedna klasa jako argument np
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		
		///////////////////////po Java7
		ArrayList<String> jakasListaStr = new ArrayList<>();//ArrayList to klasa genryczna, mo¿na u¿yæ <> i nie trzeba powtarz¹c typu klasy
		ArrayList<Animal> jakasLista = new ArrayList<>();//ArrayList to klasa genryczna, mo¿na u¿yæ <> i nie trzeba powtarz¹c typu klasy
		
	}
}

class Animal{
	
}
