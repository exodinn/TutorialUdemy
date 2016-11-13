package multipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {

	public static void main(String[] args) {

		Test test = new Test();
		
		//musimy daæ Add throw declaration lub Try catch lub try multicatch
		/*try {//mo¿e byæ to (mulitcatch) - nie ma rozró¿nienia który b³¹d wyst¹pi³ lub
			test.run();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}*/
		
		//lub to (catch) - rozró¿nia który b³¹d wyst¹p³ lub Add throw declaration w mainie
		/*try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//teraz ³apiemy jakikolwiek rodzaj b³êdu )exception); IOException oraz ParseException to klasy dziedzicz¹ce po Exception-u¿ywamy tu polimorfizmu
		try {
			test.run();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		try {
			test.input();
		//FileNotFoundException dziedziczy po IOException
		//najpierw musi byæ FileNotFoundException bo dziedziczy po IOException i gdyby by³o na odwrót to gdyby wyst¹pi³ FileNotFoundException to 
		// i tak jedynie wyst¹pi³ by IOException bo FileNotFoundException jest podklas¹ (dziedziczy po) IOException - IOException z³apie FileNotFoundException
		//!!!!!!!!!!!czyli najpierw musi byæ child exception, póŸniej parent Exception!!!!!!!!!!!
		//maj¹c exception bêd¹ce w relacji child/parent i u¿ywaj¹c mulicatch nalezy jedynie u¿yæ parent class inaczej bêdzie b³¹d/powtórzenie
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
