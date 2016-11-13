package handlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {

		File file = new File("test.txt");

		FileReader fr;
		// PPM + Surround with try/catch (wtedy wyrzuci b³¹d bezpoœrednio z
		// miejsca jego wyst¹pienia, ale nie przerwie programu) lub Add throw declaration (wtedy wyrzuci b³¹d z main)
		try {
			fr = new FileReader(file);
			System.out.println("Continuing...");//nie poka¿e tego jeœli bêdzie b³¹d wczytywania pliku, gdy jest b³¹d od razu wywala b³¹d
		} catch (FileNotFoundException e) {
			//e.printStackTrace();//standardowe powiedomienie
			//gdy bêdzie b³¹d wyœwietli ten tekst, lepiej tego u¿ywac ni¿ standardowy StackTrace bo czêsto to nic nie mówi i demotywuje u¿ytkowników/innych develoeperów
			System.out.println("File not found: " + file.toString());
			
		}
	}
}
