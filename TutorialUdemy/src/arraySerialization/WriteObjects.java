package arraySerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
	//PATRZ SERIALIZATION
	public static void main(String[] args) {
		System.out.println("Writting objects...");
		//tworzymy array(ci¹g) obiektów
		Person[] people = {new Person(1, "Mietek"), new Person(2, "Debil"), new Person(2, "Kretyn")};
		
		ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));//tworzymy listê ci¹gów(wektorów, obiektów) - z ci¹gów robimy listê
		
		
		//try(FileOutputStream fs = new FileOutputStream("person.bin"); ObjectOutputStream os = new ObjectOutputStream(fs);){//mo¿na te¿ tak - kilka obiektów autoclosable, wtedy nie trzeba os.close();
		try(FileOutputStream fs = new FileOutputStream("person.bin")){//mo¿e byæ .bin lub cokolwiek innego np .debil
			ObjectOutputStream os = new ObjectOutputStream(fs);
			//zapisujemy ci¹g obiektów do pliku
			os.writeObject(people);
			
			os.writeObject(peopleList);
			//tu okreœlamy z góry ile tych obiektów ma byæ i tyle obiektów zapisujemy
			os.writeInt(peopleList.size()); 
			//teraz zapisujemy te obiekty po kolei
			for(Person person : peopleList){
				os.writeObject(person);
			}
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

