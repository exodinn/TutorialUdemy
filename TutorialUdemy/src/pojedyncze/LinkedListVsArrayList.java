package pojedyncze;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {
	public static void main(String[] args) {
		//jeœli nie definiujemy na pocz¹tku rozmiaru Arraylisty to defaultowo jest chyba 10, jak chcemy dodac 11ty element to tworzy nowy array 
		//dwukrotnie wiêkszy ni¿ poprzedni i przepisuje do niego wartoœci ze starego czyli 20
		
		//jeœli chcemy usuwaæ/dodawac elementy tylko na koñcu listy lepiej u¿yæ ArrayList, w innym przypadku lepiej LinkedList
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		//równie dobrze móg³bym zrobiæ tak:
		//List<Integer> arrayList = new ArrayList<>();
		//List<Integer> linkedList = new LinkedList<>();
		
		//mo¿na zarówno ArrayList jak i LinkedList wrzuciæ do metody bo ArrayList oraz LinkedList implementuj¹ interfejs List
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	//metoda, która pozwoli by zarówno mo¿na by³o wrzuciæ do niej ArrayList jak i LinkedList
	private static void doTimings(String type, List<Integer> list){
		for(int i = 0; i < 1E5; i++){//1E5 oznacza 10 do potêgi 50 czyli 100 000
			list.add(i);
		}
		
		long start = System.currentTimeMillis();//pobieramy czas rozpoczêcia - do obliczania szybkosci dzia³ania
		
		/*{//dodajemy nowe elementy do koñca linii, dla ArrayList wynosi 6 ms, dla LinkedList 12 ms
		for(int i = 0; i < 1E5; i++)
			list.add(i);
		}*/
		
		//dodajemy nowe elementy ale na pocz¹tek listy, dla ArrayList wynios³o 2751 ms a dla LinkedList 11 ms
		//dla LinkedList nie ma znaczenia gdzie dodajemy nowe elementy - czas bêdzie taki sam
		/*for(int i = 0; i < 1E5; i++){
			list.add(0, i);//pierwszy parametr okreœla gdzie mamy dodaæ nowy element - w jakim miejscu (indeks dodawanego elementu)
		}*/
		
		//dodajemy nowe elementy prawie na koñcu listy - arrayList 9 ms, LinkedList 29 ms 
		//arrayList jest szybszy jak dodajemy nowe/usuwamy stare elementy na koñcu lub blisko koñca listy
		for(int i = 0; i < 1E5; i++){
			list.add(list.size() - 100, i);//dodajemy nowe elementy 100 miejsc przed koñcem listy
		}
		
		long end = System.currentTimeMillis();//pobieramy czas zakoñczenia  do obliczania szybkosci dzia³ania
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);//pokazujemy ile czasu zajê³o w ms
		
		/**
		 * ArrayList zarz¹dza list¹ wewn¹trznie - [0][1][2][3] ...
		 * wiêc jeœli chcemy pobraæ jakiœ obiekt to jest szybko bo bezpoœrednio odnosimy siê do konkretnego elementu wykorzystuj¹c jego indeks.
		 * Jak dodajemy do koñca lista to dodajemy po prostu do listy kolejny array, tylko czasem musi przepisaæ istniej¹c¹ listê do nowej listy
		 * jak przekroczymy rozmiar listy.
		 * Jak usuwamy z koñca to po prostu skaraca listê o jeden element
		 * Jak dodajemy/usuwamy nie z koñca to musi wszystkie elementy poprzesuwaæ do przodu lub do ty³u. A to trochê zajmuje.
		 * Jak dodajemy/usuwamy blisko koñca to tak du¿o nie trzeba przesuwaæ wiêc jest w miarê szybko.
		 * 
		 * 
		 * LinkedList sk¹³da siê z elementów, z których ka¿dy przechowuje odnoœnik do poprzedniego i kolejnego elementu.
		 * [0]->[1]->[2] ...
		 * 	  <-   <-
		 * Jak chcemy dotrzeæ do okreœlonego elementu to musi przejœæ do pierwszego elementu, przez odnoœnik w pierwszym elemencie do koeljnego elementu 
		 * i tak dopóki nie dotrze do docelowego elementu.
		 * Jak dodajemy nowy element to wystarczy wtedy do elementu, który ma byæ poprzednikiem daæ odnoœnik do nowego elementu, do elementu który ma
		 * byæ nastêpnikiem te¿ daæ odnoœnik do nowego elementu i nowemu elementowi daæ wskaŸniki do poprzednika i nastepnika. I to jest du¿o szybsze
		 * ni¿ przesuwanie po kolei wszystkich elementów listy.
		 * 
		 * Usuwaj¹c dzieje siê analogicznie, nastêpnik usuwanego elementu dostaje odnoœnik do poprzednika usuwanego elementu i na owdrót, wtedy ani
		 * poprzednik ani nastepnik nie maj¹ ju¿ odnoœnika do suswanego elementu wiêc nie jest on ju¿ czêœci¹ listy.
		 */
	}
}

