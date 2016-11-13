package pojedyncze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesUsingScanner {

	public static void main(String[] args) throws FileNotFoundException{//wtedy program przestanie dzia�a� jak wyst�pi b��d FileNotFoundException
		//�cie�ka do pliku, na kt�rym chcemy pracowa�
		String filename = "F:/Projekty/Java/TutorialUdemy/TutorialUdemy/bin/exampleReadingLiesUsingScanner.txt";
		//String filename = "F:\\Projekty\\Java\\TutorialUdemy\\TutorialUdemy\\bin\\exampleReadingLiesUsingScanner.txt";//to te� jest prawidlowe
		
		//zamiast wczytaywa� plik ze �cie�ki absolutnej (z g�ry podanej) mo�na wczytywa� ze �ciezki bezwzgl�dnej jak plik znajduje si� w foldere projektu
		//by doda� plik do projektu trzeba przeci�gn�� plik do folderu projektu w Eclipse i da� copy files (w g��wnym folderze - root directory, nie w scr ani innych plikach)
		//String filename = "exampleReadingLiesUsingScanner.txt";
		
		//tworzymy obiekt reprezentuj�cy plik 
		File textFile = new File(filename);
		
		//Scanner skaner = new Scanner(textFile);//to wywali b��d, trzeba u�y� try catch
		
		//klikamy PPM na b��d i dajemy Surround wth try/catch lub Add Throws declaration
		Scanner skaner = new Scanner(textFile);
			
		/*try {//lub to jest r�wnie� prawid�owe wtedy bez "throws FileNotFoundException"
			Scanner skaner = new Scanner(textFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		int count = 2;//licznik numeru linii
		//wczytujemy pierwszego inta w pliku, on wczytuje tylko inta a nie wczytuje znacznika ko�ca linii, dlatego wywy�uj�c po tym metod� nextLine()
		//wczytamy pust� lini� (wska�nik ko�ca linii)
		int value = skaner.nextInt();
		
		skaner.nextLine();//robimy to by wczyta� t� pust� lini� (Carrier Return, Line Feed) kt�ra nie zostala wczytana przez nextInt()
		
		System.out.println("Read value: " + value);
		
		//wczytuje lini� po linii przez ca�y plik i go wy�wietla
		while(skaner.hasNextLine()){
			String line = skaner.nextLine();
			
			System.out.println("Read line " + count + ": " + line);
			count++;
		}
		
		//for ()
		
		skaner.close();//otwieraj�c Scanner trzeba go zamkn�� - inaczej b�dzie warning

	}
}
