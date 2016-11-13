package pojedyncze;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTreeMap {
	public static void main(String[] args) {
		
		//mo�e te� by� tak:
		//Map<Integer,String> hashmap = new HashMap<>();
		//Map<Integer,String> linkedHashmap = new LinkedHashMap<>();
		//Map<Integer,String> treemap = new TreeMap<>();
		
		HashMap<Integer,String> hashmap = new HashMap<>();//przetwrzymywane pary s� niepostortowane 
		//przetwrzymywane pary posortowane w kolejno�ci dodawania - ka�dy element ma odno�nik do elementu poprzedniego i nast�pnego
		LinkedHashMap<Integer,String> linkedHashmap = new LinkedHashMap<>();
		//przetwrzymywane pary posortowane w naturalnym porz�dku (nautural order) - czyli np dla int to 1,2,3..., dla String a,b,c,d...
		TreeMap<Integer,String> treemap = new TreeMap<>();
		
		//testMap(hashmap);//poka�e nieposortowane pary - w tym przypadku sa posortowane w kolejno�ci numerycznej po intach, ale nie koniecznie musi tak by�
		//testMap(linkedHashmap);//poka�e posortowane pary - po kolejnosci dodawania
		testMap(treemap);//poka�e  posortowane pary - w naturalnym porz�dku - tu numeryczne po intach
	}
	public static void testMap(Map<Integer,String> map){
		map.put(9, "lis");
		map.put(4, "kot");
		map.put(8, "pies");
		map.put(1, "�wiania");
		map.put(0, "w��");
		map.put(15, "mi�");
		map.put(6, "�yrafa");
		
		//iterowanie po mapie - inna metoda
		for(Integer key : map.keySet()){
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}
}
