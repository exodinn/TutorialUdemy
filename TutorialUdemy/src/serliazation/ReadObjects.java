package serliazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");
		
		try {
			//otwieramy stream do odczytywania danych z person.bin
			FileInputStream fi = new FileInputStream("person.bin");
			//stream do odczytywania obiekt�w z wcze�niej zainicjowanego FileInputStream
			ObjectInputStream oi = new ObjectInputStream(fi);
			//zapisujemy 2 obiekty i robimy rzut (cast) tych obiekt�w na obiekty klasy Pesron
			Person ludzik1 = (Person)oi.readObject();
			Person ludzik2 = (Person)oi.readObject();
			
			System.out.println("Ludzik pierwszy nazywa si�: " + ludzik1);
			System.out.println("Ludzik drugi nazywa si�: " + ludzik2);
			
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
