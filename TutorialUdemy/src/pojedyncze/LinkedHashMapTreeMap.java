package pojedyncze;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTreeMap {
	public static void main(String[] args) {
		
		//mo¿e te¿ byæ tak:
		//Map<Integer,String> hashmap = new HashMap<>();
		//Map<Integer,String> linkedHashmap = new LinkedHashMap<>();
		//Map<Integer,String> treemap = new TreeMap<>();
		
		HashMap<Integer,String> hashmap = new HashMap<>();//przetwrzymywane pary s¹ niepostortowane 
		//przetwrzymywane pary posortowane w kolejnoœci dodawania - ka¿dy element ma odnoœnik do elementu poprzedniego i nastêpnego
		LinkedHashMap<Integer,String> linkedHashmap = new LinkedHashMap<>();
		//przetwrzymywane pary posortowane w naturalnym porz¹dku (nautural order) - czyli np dla int to 1,2,3..., dla String a,b,c,d...
		TreeMap<Integer,String> treemap = new TreeMap<>();
		
		//testMap(hashmap);//poka¿e nieposortowane pary - w tym przypadku sa posortowane w kolejnoœci numerycznej po intach, ale nie koniecznie musi tak byæ
		//testMap(linkedHashmap);//poka¿e posortowane pary - po kolejnosci dodawania
		testMap(treemap);//poka¿e  posortowane pary - w naturalnym porz¹dku - tu numeryczne po intach
	}
	public static void testMap(Map<Integer,String> map){
		map.put(9, "lis");
		map.put(4, "kot");
		map.put(8, "pies");
		map.put(1, "œwiania");
		map.put(0, "w¹¿");
		map.put(15, "miœ");
		map.put(6, "¿yrafa");
		
		//iterowanie po mapie - inna metoda
		for(Integer key : map.keySet()){
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}
}
