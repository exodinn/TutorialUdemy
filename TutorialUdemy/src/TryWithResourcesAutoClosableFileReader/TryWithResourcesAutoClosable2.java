package TryWithResourcesAutoClosableFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesAutoClosable2 {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		//nie tworzymy zmiennej przetrzymuj¹cej obiekt FileReader, tylko bezpoœrednio tworzymy nowy obiekt w metodzie BufferedReader
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			//wczytujemy po jednej linijce tekstu i j¹ wyœwietlamy
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file: " + file.toString());
		} catch (IOException e) {
			System.out.println("Cannot read file: " + file.toString());
		}
	}
}
