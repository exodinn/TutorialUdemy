package arraySerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");
		
		try {
			FileInputStream fi = new FileInputStream("person.bin");//mo¿e byæ .bin lub cokolwiek innego np .debil
			ObjectInputStream oi = new ObjectInputStream(fi);
			//wczytujemy ci¹g obiektów i rzucamy na ci¹g obiktów klasy Person 
			Person[] people = (Person[])oi.readObject();
			//wczytujemy listê obiektów i rzucamy na ci¹g obiktów klasy Person, tu jest warning bo ArrayList jest klas¹ przyjmuj¹c¹ generic
			//i podczas kompilacji infomacja jaka klasa wesz³a jako generic jest niedostepna, wiêc readObject nie wie obiekt jakiego typu odczytuje
			//ale mozna pozbyæ siê b³êdu u¿ywaj¹c @SuppressWarnings("unchecked"), taki jest problem z ArrayList
			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>)oi.readObject();
			//wyœwietlamy ci¹g obiektów klasy Person
			for(Person person : people){
				System.out.println(person);
			}
			//wyœwietlamy listê obiektów klasy Person - poka¿e to samo co wy¿ej
			for(Person person : peopleList){
				System.out.println(person);
			}
			//odczytujemy ile obiektów zapisa³o zapisanych
			int num = oi.readInt();
			//i odczytujemy tak¹ iloœæ obiektów, u¿ywaj¹c rzutu
			for(int i = 0; i < num; i++){
				Person person = (Person)oi.readObject();
				System.out.println(person);
			}
					
			oi.close();
			
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
