package pojedyncze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesUsingScanner {

	public static void main(String[] args) throws FileNotFoundException{//wtedy program przestanie dzia³aæ jak wyst¹pi b³¹d FileNotFoundException
		//œcie¿ka do pliku, na którym chcemy pracowaæ
		String filename = "F:/Projekty/Java/TutorialUdemy/TutorialUdemy/bin/exampleReadingLiesUsingScanner.txt";
		//String filename = "F:\\Projekty\\Java\\TutorialUdemy\\TutorialUdemy\\bin\\exampleReadingLiesUsingScanner.txt";//to te¿ jest prawidlowe
		
		//zamiast wczytaywaæ plik ze œcie¿ki absolutnej (z góry podanej) mo¿na wczytywaæ ze œciezki bezwzglêdnej jak plik znajduje siê w foldere projektu
		//by dodaæ plik do projektu trzeba przeci¹gn¹æ plik do folderu projektu w Eclipse i daæ copy files (w g³ównym folderze - root directory, nie w scr ani innych plikach)
		//String filename = "exampleReadingLiesUsingScanner.txt";
		
		//tworzymy obiekt reprezentuj¹cy plik 
		File textFile = new File(filename);
		
		//Scanner skaner = new Scanner(textFile);//to wywali b³¹d, trzeba u¿yæ try catch
		
		//klikamy PPM na b³¹d i dajemy Surround wth try/catch lub Add Throws declaration
		Scanner skaner = new Scanner(textFile);
			
		/*try {//lub to jest równie¿ prawid³owe wtedy bez "throws FileNotFoundException"
			Scanner skaner = new Scanner(textFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		int count = 2;//licznik numeru linii
		//wczytujemy pierwszego inta w pliku, on wczytuje tylko inta a nie wczytuje znacznika koñca linii, dlatego wywy³uj¹c po tym metodê nextLine()
		//wczytamy pust¹ liniê (wskaŸnik koñca linii)
		int value = skaner.nextInt();
		
		skaner.nextLine();//robimy to by wczytaæ t¹ pust¹ liniê (Carrier Return, Line Feed) która nie zostala wczytana przez nextInt()
		
		System.out.println("Read value: " + value);
		
		//wczytuje liniê po linii przez ca³y plik i go wyœwietla
		while(skaner.hasNextLine()){
			String line = skaner.nextLine();
			
			System.out.println("Read line " + count + ": " + line);
			count++;
		}
		
		//for ()
		
		skaner.close();//otwieraj¹c Scanner trzeba go zamkn¹æ - inaczej bêdzie warning

	}
}
