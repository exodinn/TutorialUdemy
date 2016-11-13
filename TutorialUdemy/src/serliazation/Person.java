package serliazation;

import java.io.Serializable;

public class Person implements Serializable{
	//czasami poakzuje b��d "The serilizale class <nazwa klasy> does not declares a static final serialVersionUID field of type log
	//wtedy mo�na zrobic PPM na b��d "Add generated/default serial version ID"
	
	//jaki� randomowy numer, je�li zmienimy to readObject przestanie dzia�a�, numer kt�ry wykorzystywany jest do serializacji i r�wnie� deserializacji pliku
	//jak zaserializujemy innym numerem niz chcemy zdeserializowa� to b�dzie b��d, jednym s�owem: program musi stwierdzi�, �e b�dzie deserializowa�
	//ten sam obiekt (spos�b kodowania obiekt�w) jak by� serilizowany, okre�la "wersj�" obiektu - je�li chcemy zaznaczy� �e jaka� nowa wersj� obiektu
	//nie powinna by� odczytywana przez star� wersj� programu to zmieniamy numer i wtedy nie odzyta i nie b�dzie b��du - "wersjonowanie obiektu"
	private static final long serialVersionUID = 6463599313965871632L;
	private int id;
	private String name;
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "Person [id=" + id + " name= " + name + "]";
	}
}
