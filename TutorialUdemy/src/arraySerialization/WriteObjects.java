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
		//tworzymy array(ci�g) obiekt�w
		Person[] people = {new Person(1, "Mietek"), new Person(2, "Debil"), new Person(2, "Kretyn")};
		
		ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));//tworzymy list� ci�g�w(wektor�w, obiekt�w) - z ci�g�w robimy list�
		
		
		//try(FileOutputStream fs = new FileOutputStream("person.bin"); ObjectOutputStream os = new ObjectOutputStream(fs);){//mo�na te� tak - kilka obiekt�w autoclosable, wtedy nie trzeba os.close();
		try(FileOutputStream fs = new FileOutputStream("person.bin")){//mo�e by� .bin lub cokolwiek innego np .debil
			ObjectOutputStream os = new ObjectOutputStream(fs);
			//zapisujemy ci�g obiekt�w do pliku
			os.writeObject(people);
			
			os.writeObject(peopleList);
			//tu okre�lamy z g�ry ile tych obiekt�w ma by� i tyle obiekt�w zapisujemy
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

