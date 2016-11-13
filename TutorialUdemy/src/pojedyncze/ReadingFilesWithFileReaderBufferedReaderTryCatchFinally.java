package pojedyncze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFilesWithFileReaderBufferedReaderTryCatchFinally {

	public static void main(String[] args) {
		//File s�u�y do wczytywania plik�w
		File file = new File("test.txt");
		BufferedReader br = null;
		
		try {
			//FileReader wczytuje wszystkie znaki od razu, nie mo�na po linijce odczytywa�
			FileReader fr = new FileReader(file);
			//BufferedReader pozwala odczytywa� linijka po linijce tekst wcytany przez FileReader
			br = new BufferedReader(fr);
			
			String line;
			//wczytujemy po jednej linijce tekstu i j� wy�wietlamy
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {//FileReader
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {//BufferedReader
			System.out.println("Unable to read file: " + file.toString());
		} finally{//to zawsze si� uruchomi nawet jak b�dzie b��d
			try {
				//musimy zamkn��, �eby nie by�o wycieku pami�ci, zamyka od razu FileReader oraz File
				br.close();
			} catch (IOException e) {
				System.out.println("Cannot close file: " + file.toString());
			} catch (NullPointerException e){
				//Plik nie zosta� prawdopodobnie nigdy otwarty
			}
		}
	}
}
