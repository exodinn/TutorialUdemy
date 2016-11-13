package pojedyncze;

import java.util.ArrayList;
import java.util.HashMap;

public class Generics {

	public static void main(String[] args) {	
		//generyczna klasa (genric class) to klasa kt�r� mo�e dzia�a� z innymi obiektami wybranych przez nas klas
		
		///////////////////////przed Java5
		ArrayList lista = new ArrayList();///array(ci�g znak�w) o nieokre�lonej d�ugo�ci, moze przechowywac obiekty
		
		lista.add("Apple");
		lista.add("Banana");
		lista.add("Orange");
		
		String friut = (String) lista.get(0);//trzeba downcast zrobi� z typu Object na String
		System.out.println(friut);
		
		///////////////////////po Javie5
		ArrayList<String> strings = new ArrayList<String>();//ArrayList to klasa genryczna
		
		strings.add("Cat");
		strings.add("Dog");
		strings.add("Pig");
		
		//nie trzeba robi� downcast (rzutu) bo definiuj�c strings - klase genryczna u�yli�my konstruktora przyjmuj�cego String, m�wi�c tym samym, �e
		//ArrayList b�dzie przyjmowa� Stringi
		String animal = strings.get(0);
		System.out.println(animal);
		
		
		///////////////////////do klasy genrycznej moze wchodzi� wi�cej ni� jedna klasa jako argument np
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		
		///////////////////////po Java7
		ArrayList<String> jakasListaStr = new ArrayList<>();//ArrayList to klasa genryczna, mo�na u�y� <> i nie trzeba powtarz�c typu klasy
		ArrayList<Animal> jakasLista = new ArrayList<>();//ArrayList to klasa genryczna, mo�na u�y� <> i nie trzeba powtarz�c typu klasy
		
	}
}

class Animal{
	
}
