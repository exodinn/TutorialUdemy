package serliazation;

import java.io.Serializable;

public class Person implements Serializable{
	//czasami poakzuje b³¹d "The serilizale class <nazwa klasy> does not declares a static final serialVersionUID field of type log
	//wtedy mo¿na zrobic PPM na b³¹d "Add generated/default serial version ID"
	
	//jakiœ randomowy numer, jeœli zmienimy to readObject przestanie dzia³aæ, numer który wykorzystywany jest do serializacji i równie¿ deserializacji pliku
	//jak zaserializujemy innym numerem niz chcemy zdeserializowaæ to bêdzie b³¹d, jednym s³owem: program musi stwierdziæ, ¿e bêdzie deserializowaæ
	//ten sam obiekt (sposób kodowania obiektów) jak by³ serilizowany, okreœla "wersjê" obiektu - jeœli chcemy zaznaczyæ ¿e jakaœ nowa wersj¹ obiektu
	//nie powinna byæ odczytywana przez star¹ wersjê programu to zmieniamy numer i wtedy nie odzyta i nie bêdzie b³êdu - "wersjonowanie obiektu"
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
