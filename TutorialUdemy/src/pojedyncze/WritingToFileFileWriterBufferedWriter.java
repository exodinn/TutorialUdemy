package pojedyncze;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFileFileWriterBufferedWriter {

	public static void main(String[] args) {
		
		File file = new File("test2.txt");
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			br.write("This is line 1");//wpisuje do plik liniê
			br.newLine();//dorzuca znacznik koñca linii
			br.write("This is line 2");
			br.newLine();
			br.write("This is last line");

		} catch (IOException e) {
			System.out.println("Cannot read file: " + file.toString());
		}
	}
}
