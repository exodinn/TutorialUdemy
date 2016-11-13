package transientAndSerlization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	//PATRZ SERIALIZATION
	public static void main(String[] args) {
		System.out.println("Writting objects...");
		
		//try(FileOutputStream fs = new FileOutputStream("person.bin"); ObjectOutputStream os = new ObjectOutputStream(fs)){//lepiej zrobiæ jak poni¿ej:
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("person.bin"))){
			
			Person person = new Person(7, "Ziutek");
			Person.setCount(88);
			os.writeObject(person);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

