package handlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {

		File file = new File("test.txt");

		FileReader fr;
		// PPM + Surround with try/catch (wtedy wyrzuci b��d bezpo�rednio z
		// miejsca jego wyst�pienia, ale nie przerwie programu) lub Add throw declaration (wtedy wyrzuci b��d z main)
		try {
			fr = new FileReader(file);
			System.out.println("Continuing...");//nie poka�e tego je�li b�dzie b��d wczytywania pliku, gdy jest b��d od razu wywala b��d
		} catch (FileNotFoundException e) {
			//e.printStackTrace();//standardowe powiedomienie
			//gdy b�dzie b��d wy�wietli ten tekst, lepiej tego u�ywac ni� standardowy StackTrace bo cz�sto to nic nie m�wi i demotywuje u�ytkownik�w/innych develoeper�w
			System.out.println("File not found: " + file.toString());
			
		}
	}
}
