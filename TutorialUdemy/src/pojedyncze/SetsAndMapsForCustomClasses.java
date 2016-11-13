package pojedyncze;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SetsAndMapsForCustomClasses {
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		Map<String,Integer> map2 = new LinkedHashMap<>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);
		
		map2.put("one", 1);
		map2.put("two", 2);
		map2.put("three", 3);
		map2.put("one", 1);
		
		for(String key : map.keySet()){
			System.out.println(key + ": " + map.get(key));//poka¿e tylko dla 1,2,3 - usunie dodatkowy/nieunikalny element
		}
		
		for(String key : map2.keySet()){
			System.out.println(key + ": " + map2.get(key));//poka¿e te¿ tylko dla 1,2,3 - usunie dodatkowy/nieunikalny element
		}
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("dog");
		set.add("cat");
		set.add("maouse");
		set.add("dog");
		
		System.out.println(set);//poka¿e [dog, cat, maouse] - usunie powtarz¹cy siê, nieunikalny element
		
		
		//dla customowej klasy
		Perrson osoba1 = new Perrson(0, "Mietek");
		Perrson osoba2 = new Perrson(1, "Zdzichu");
		Perrson osoba3 = new Perrson(2, "Waldek");
		Perrson osoba4 = new Perrson(0, "Mietek");
		
		Map<Perrson,Integer> map3 = new LinkedHashMap<>();
		
		map3.put(osoba1, 1);
		map3.put(osoba2, 2);
		map3.put(osoba3, 3);
		map3.put(osoba4, 1);
		
		for(Perrson key : map3.keySet()){
			System.out.println(key + ": " + map3.get(key));//poka¿e wszystkie elementy 0,1,2,0; mamy powtórzenia - gdy nie ma metod equals i hashCode
		}
		
		Set<Perrson> set2 = new LinkedHashSet<>();
		
		set2.add(osoba1);
		set2.add(osoba2);
		set2.add(osoba3);
		set2.add(osoba4);
		
		System.out.println(set2);//poka¿e wyszystkie elementy [0: Mietek, 1: Zdzichu, 2: Waldek, 0: Mietek]; mamy powtórzenia - gdy nie ma metod equals i hashCode
		//potwórzone elementy znikaj¹ gdy dodamy metody equals i hashCode dla klasy Perrson!!!!!!!!!!!!
	}
}

class Perrson{
	private int id;
	private String name;
	
	public Perrson(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "[ID is: " + id + " and name is: " + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perrson other = (Perrson) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
