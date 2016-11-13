package pojedyncze;

import java.util.ArrayList;

public class GenericsAndWidlcards {

	public static void main(String[] args) {	
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("one");
		lista.add("two");
		
		showListString(lista);
		
		ArrayList<Machineeee> listaMaszyn = new ArrayList<>();
		listaMaszyn.add(new Machineeee());
		listaMaszyn.add(new Machineeee());
		
		showListMaszyn(listaMaszyn);
		
		ArrayList<Cameraaaa> listaKamer = new ArrayList<>();
		listaKamer.add(new Cameraaaa());
		listaKamer.add(new Cameraaaa());
		//to nie zadzia�a bo klasa ArrayList<Camera> nie jest podklas� (nie dziedziczy po) ArrayList<Machine>; mino, �e Camera dziedziczy po Machine
		//showListMaszyn(listaKamer);
		//te obie metody zadzia�aj� bo u�yli�my metody z dzik� kart� jako parametru klasy ArrayList
		showList(listaKamer);
		showList(listaMaszyn);
		
		showListExtendsMachine(listaKamer);
		showListExtendsMachine(listaMaszyn);
		
		showListSuperCamera(listaKamer);
		showListSuperCamera(listaMaszyn);
		
	}
	
	//metoda do kt�rej jako parametr wchodzi klasa genryczna (klas� sparametryzowan�) ArrayList przechowuj�ca warto�ci typu String
	public static void showListString(ArrayList<String> lista){
		for(String value : lista){
			System.out.println(value);
		}
	}
	
	public static void showListMaszyn(ArrayList<Machineeee> lista){
		for(Machineeee value : lista){
			System.out.println(value);
		}
	}
	
	//? oznacza dzik� kart� (wild card) - czyli klasa nieznanego typu
	public static void showList(ArrayList<?> lista){//ArrayList<?> to ArrayList nieznanego typu/parametru
		for(Object value : lista){//musi by� Object bo nie wiemy obiekt jakiej klasy tu b�dzie, a wszystkie okiekty musz� dziedziczy� po klasie Object
			System.out.println(value);
		}
	}
	
	//u�ywamy dzikiej karty, teraz metoda przyjmie wszystkie metody, kt�re rozszerzaj� (dziedzicz� po) Machine
	public static void showListExtendsMachine(ArrayList<? extends Machineeee> lista){//dodajemy tzw doln� granic� (lower bound)
		for(Machineeee value : lista){//teraz mog� tu u�y� Machine i wszystkich metod, zmiennych klasy Machine
			System.out.println(value);
			value.start();
			//value.snap();//to nie zadzia�a bo Machine nie ma metody snap()
		}
	}
	//teraz metoda przyjmie klas� Camera lub klasy-rodzice/nadklasy (super classes) dla Camera
	public static void showListSuperCamera(ArrayList<? super Cameraaaa> lista){//dodajemy tzw g�rn� granic� (upper bound)
		for(Object value : lista){//ale wtedy mo�na u�ywac tylko metod klasy Object bo nie wiemy jakie metody maj� poszceg�lne klasy-rodzice klasy Camera
			System.out.println(value);	
		}
	}
}

class Machineeee{
	@Override
	public String toString() {
		return "I am a Machine";
	} 	
	
	public void start(){
		System.out.println("Machine started.");
	}
}

class Cameraaaa extends Machineeee{
	@Override
	public String toString() {
		return "I am a Camera";
	} 	
	
	public void snap(){
		System.out.println("Snap!");
	}
}
