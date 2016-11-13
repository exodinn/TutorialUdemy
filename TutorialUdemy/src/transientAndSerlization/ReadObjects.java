package transientAndSerlization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");
		
		//try (FileInputStream fi = new FileInputStream("person.bin"); ObjectInputStream oi = new ObjectInputStream(fi)){//lepiej zrobi� jak poni�ej:
		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("person.bin"))){
			
			//tu �aden konstruktor nie jest wywo�ywany, bo tylko deserializujemy obiekt a nie tworzymy nowego - to jest jedyny przyk�ad kiedy nie wywow�ujemy konstruktora tworz�c obiekt
			Person person = (Person)oi.readObject();
			System.out.println(person);//je�li damy id jako transient - nie b�dzie serializowane to wy�wietli id jako 0;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
