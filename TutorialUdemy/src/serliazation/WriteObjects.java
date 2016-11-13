package serliazation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	//serializacja to konwersja obiektu do binarnej formy/danych
	//jak zrobic by klasa by�a Serializable?? ta klasa musi implementowa� klase o nazwie Serializable
	public static void main(String[] args) {
		System.out.println("Writting objects...");
		
		Person osoba = new Person(123, "Mietek");
		Person osoba2 = new Person(321, "Zdzichu");
		
		System.out.println(osoba);
		System.out.println(osoba2);
		
		//otwieramy stream do zapisywania danych do person.bin
		try(FileOutputStream fs = new FileOutputStream("person.bin")){
			//stream do zapisywania obiekt�w do wcze�niej zainicjowanego FileOutputStream
			ObjectOutputStream os = new ObjectOutputStream(fs);
			//zapisujemy 2 obiekty typu Person
			os.writeObject(osoba);//tutaj wywali b��d jak klasa nie implementuje klasy Serializable
			os.writeObject(osoba2);
			
			os.close();//musimy zakmn�� ObjectOutputStream
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//je�li wszystko jest ok stworzymy nowy plik o nazwie person.bin przechowujacy nasze dane
		
	}
}

