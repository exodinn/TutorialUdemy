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
			FileInputStream fi = new FileInputStream("person.bin");//mo�e by� .bin lub cokolwiek innego np .debil
			ObjectInputStream oi = new ObjectInputStream(fi);
			//wczytujemy ci�g obiekt�w i rzucamy na ci�g obikt�w klasy Person 
			Person[] people = (Person[])oi.readObject();
			//wczytujemy list� obiekt�w i rzucamy na ci�g obikt�w klasy Person, tu jest warning bo ArrayList jest klas� przyjmuj�c� generic
			//i podczas kompilacji infomacja jaka klasa wesz�a jako generic jest niedostepna, wi�c readObject nie wie obiekt jakiego typu odczytuje
			//ale mozna pozby� si� b��du u�ywaj�c @SuppressWarnings("unchecked"), taki jest problem z ArrayList
			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>)oi.readObject();
			//wy�wietlamy ci�g obiekt�w klasy Person
			for(Person person : people){
				System.out.println(person);
			}
			//wy�wietlamy list� obiekt�w klasy Person - poka�e to samo co wy�ej
			for(Person person : peopleList){
				System.out.println(person);
			}
			//odczytujemy ile obiekt�w zapisa�o zapisanych
			int num = oi.readInt();
			//i odczytujemy tak� ilo�� obiekt�w, u�ywaj�c rzutu
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
