package handlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ApplicationV2 {

	public static void main(String[] args) throws FileNotFoundException {

		openFile();
					
	}
	
	//je�li korzystamy z Add throw declaration to musimy te� doda� Add throw declaration lub Try catch do miejsca gdzie u�ywamy tej metody - tu main
	public static void openFile() throws FileNotFoundException{
		File file = new File("test.txt");

		FileReader fr  = new FileReader(file);
	}
}
