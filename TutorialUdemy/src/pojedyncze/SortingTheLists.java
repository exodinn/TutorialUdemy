package pojedyncze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTheLists {
	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Pig");
		animals.add("Elephant");
		animals.add("Lion");
		
		Collections.sort(animals);//sortowanie alfabetyczne kolekcji
		
		for(String animal : animals){
			System.out.println(animal);//wyœwietli ci¹g (array) w porz¹dku alfabetycznym - natural order
		}
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(88);
		numbers.add(134);
		numbers.add(40);
		numbers.add(2);
		
		Collections.sort(numbers);//sortowanie numeryczne kolekcji - natural order
		
		for(int liczba : numbers){
			System.out.println(liczba);//wyœwietli ci¹g (array) w porz¹dku numerycznym: 1,2,5...
		}
		
		
		//nasz w³asny sposób porównywania - sortowania
		Collections.sort(animals, new StringLengthComparator());//sortowanie kolekcji po d³ugoœci Stringa - nasza w³asna metoda porównania
		
		for(String animal : animals){
			System.out.println(animal);//wyœwietli ci¹g (array) w porz¹dku który sami stworzylismy - po d³ugoœci Stringa
		}
		
		
		//porównujemy po kolejnoœci alfabetycznej - czyli to samo co robi natural order
		Collections.sort(animals, new Alphabethicalomparator());
		
		for(String animal : animals){
			System.out.println(animal);//wyœwietli ci¹g (array) w porz¹dku alfabetycznym
		}
		
		//porównujemy po kolejnoœci odwrotnej do alfabetycznej
		Collections.sort(animals, new ReverseAlphabethicalomparator());
				
		for(String animal : animals){
			System.out.println(animal);//wyœwietli ci¹g (array) w porz¹dku odwrotnym do alfabetycznego
		}
		
		//mo¿emy tez u¿yæ anonymous class do stworzenia nowej metody porównania elementów
		Collections.sort(numbers, new Comparator<Integer>() {//to bêdzie odwrotna kolejnoœæ numeryczna

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return -o1.compareTo(o2);
				//return o2.compareTo(o1);//lub to
			}
		});
		
		for(int liczba : numbers){
			System.out.println(liczba);//wyœwietli ci¹g (array) w odwrotnym porz¹dku numerycznym: 134,88,40...
		}	
		
		/////////////////////Sotrowanie klas customowych
		List<Persssson> people = new ArrayList<>();
		people.add(new Persssson(3,"Waldek"));
		people.add(new Persssson(1,"Mietek"));
		people.add(new Persssson(4,"W³odek"));
		people.add(new Persssson(2,"Zdzichu"));
		
		for(Persssson person : people){
			System.out.println(person);//wyœwietli po kolejnoœci dodawania
		}
		
		//Collections.sort(people);//to bnie zadzia³a bo nie ma natural order dla klasy Persssson
		Collections.sort(people, new Comparator<Persssson>() {//tworzymy anonymous class - sortowanie po id

			@Override
			public int compare(Persssson o1, Persssson o2) {
				
				if(o1.getId() > o2.getId()){
					return 1;
				}
				else if (o1.getId() < o2.getId()){
					return -1;
				}
				return 0;
			}
		});
		
		for(Persssson person : people){
			System.out.println(person);//wyœwietli po kolejnoœci id - numerycznie
		}
		
		
		
		Collections.sort(people, new Comparator<Persssson>() {//tworzymy anonymous class - sortowanie po name

			@Override
			public int compare(Persssson o1, Persssson o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(Persssson person : people){
			System.out.println(person);//wyœwietli po kolejnoœci name - alfabetycznie
		}
	}
}

//tworzymy klasê która bêdzie nam sortowa³a innym sposobem niz natural order, dajemy add unimplemented methods
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int length1 = s1.length();
		int length2 = s2.length();
		if(length1 > length2){
			return 1;//1 jak obiekt pierwszy w metodzie ma byæ pierwszy
		}
		else if (length1 < length2){
			return -1;//-1 jak obiekt drugi w metodzie ma byæ pierwszy
		}
		return 0;//0 jak sa równe
			
	}
	
}

//sortowanie po kolejnoœci alfabetycznej - czyli to samo co robi natural order
class Alphabethicalomparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);	
			
	}
	
}

//sortowanie w kolejnoœci odwrotnej do alfabetycznej
class ReverseAlphabethicalomparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s2.compareTo(s1);	
		//return -s1.compareTo(s2);//lub to
			
	}
	
}

class Persssson{
	private int id;
	private String name;
	
	public Persssson(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
	
}
