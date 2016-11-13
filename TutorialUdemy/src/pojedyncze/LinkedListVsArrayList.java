package pojedyncze;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {
	public static void main(String[] args) {
		//je�li nie definiujemy na pocz�tku rozmiaru Arraylisty to defaultowo jest chyba 10, jak chcemy dodac 11ty element to tworzy nowy array 
		//dwukrotnie wi�kszy ni� poprzedni i przepisuje do niego warto�ci ze starego czyli 20
		
		//je�li chcemy usuwa�/dodawac elementy tylko na ko�cu listy lepiej u�y� ArrayList, w innym przypadku lepiej LinkedList
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		//r�wnie dobrze m�g�bym zrobi� tak:
		//List<Integer> arrayList = new ArrayList<>();
		//List<Integer> linkedList = new LinkedList<>();
		
		//mo�na zar�wno ArrayList jak i LinkedList wrzuci� do metody bo ArrayList oraz LinkedList implementuj� interfejs List
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	//metoda, kt�ra pozwoli by zar�wno mo�na by�o wrzuci� do niej ArrayList jak i LinkedList
	private static void doTimings(String type, List<Integer> list){
		for(int i = 0; i < 1E5; i++){//1E5 oznacza 10 do pot�gi 50 czyli 100 000
			list.add(i);
		}
		
		long start = System.currentTimeMillis();//pobieramy czas rozpocz�cia - do obliczania szybkosci dzia�ania
		
		/*{//dodajemy nowe elementy do ko�ca linii, dla ArrayList wynosi 6 ms, dla LinkedList 12 ms
		for(int i = 0; i < 1E5; i++)
			list.add(i);
		}*/
		
		//dodajemy nowe elementy ale na pocz�tek listy, dla ArrayList wynios�o 2751 ms a dla LinkedList 11 ms
		//dla LinkedList nie ma znaczenia gdzie dodajemy nowe elementy - czas b�dzie taki sam
		/*for(int i = 0; i < 1E5; i++){
			list.add(0, i);//pierwszy parametr okre�la gdzie mamy doda� nowy element - w jakim miejscu (indeks dodawanego elementu)
		}*/
		
		//dodajemy nowe elementy prawie na ko�cu listy - arrayList 9 ms, LinkedList 29 ms 
		//arrayList jest szybszy jak dodajemy nowe/usuwamy stare elementy na ko�cu lub blisko ko�ca listy
		for(int i = 0; i < 1E5; i++){
			list.add(list.size() - 100, i);//dodajemy nowe elementy 100 miejsc przed ko�cem listy
		}
		
		long end = System.currentTimeMillis();//pobieramy czas zako�czenia  do obliczania szybkosci dzia�ania
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);//pokazujemy ile czasu zaj�o w ms
		
		/**
		 * ArrayList zarz�dza list� wewn�trznie - [0][1][2][3] ...
		 * wi�c je�li chcemy pobra� jaki� obiekt to jest szybko bo bezpo�rednio odnosimy si� do konkretnego elementu wykorzystuj�c jego indeks.
		 * Jak dodajemy do ko�ca lista to dodajemy po prostu do listy kolejny array, tylko czasem musi przepisa� istniej�c� list� do nowej listy
		 * jak przekroczymy rozmiar listy.
		 * Jak usuwamy z ko�ca to po prostu skaraca list� o jeden element
		 * Jak dodajemy/usuwamy nie z ko�ca to musi wszystkie elementy poprzesuwa� do przodu lub do ty�u. A to troch� zajmuje.
		 * Jak dodajemy/usuwamy blisko ko�ca to tak du�o nie trzeba przesuwa� wi�c jest w miar� szybko.
		 * 
		 * 
		 * LinkedList sk��da si� z element�w, z kt�rych ka�dy przechowuje odno�nik do poprzedniego i kolejnego elementu.
		 * [0]->[1]->[2] ...
		 * 	  <-   <-
		 * Jak chcemy dotrze� do okre�lonego elementu to musi przej�� do pierwszego elementu, przez odno�nik w pierwszym elemencie do koeljnego elementu 
		 * i tak dop�ki nie dotrze do docelowego elementu.
		 * Jak dodajemy nowy element to wystarczy wtedy do elementu, kt�ry ma by� poprzednikiem da� odno�nik do nowego elementu, do elementu kt�ry ma
		 * by� nast�pnikiem te� da� odno�nik do nowego elementu i nowemu elementowi da� wska�niki do poprzednika i nastepnika. I to jest du�o szybsze
		 * ni� przesuwanie po kolei wszystkich element�w listy.
		 * 
		 * Usuwaj�c dzieje si� analogicznie, nast�pnik usuwanego elementu dostaje odno�nik do poprzednika usuwanego elementu i na owdr�t, wtedy ani
		 * poprzednik ani nastepnik nie maj� ju� odno�nika do suswanego elementu wi�c nie jest on ju� cz�ci� listy.
		 */
	}
}

