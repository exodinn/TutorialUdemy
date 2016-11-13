package multipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {

	public static void main(String[] args) {

		Test test = new Test();
		
		//musimy da� Add throw declaration lub Try catch lub try multicatch
		/*try {//mo�e by� to (mulitcatch) - nie ma rozr�nienia kt�ry b��d wyst�pi� lub
			test.run();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}*/
		
		//lub to (catch) - rozr�nia kt�ry b��d wyst�p� lub Add throw declaration w mainie
		/*try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//teraz �apiemy jakikolwiek rodzaj b��du )exception); IOException oraz ParseException to klasy dziedzicz�ce po Exception-u�ywamy tu polimorfizmu
		try {
			test.run();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		try {
			test.input();
		//FileNotFoundException dziedziczy po IOException
		//najpierw musi by� FileNotFoundException bo dziedziczy po IOException i gdyby by�o na odwr�t to gdyby wyst�pi� FileNotFoundException to 
		// i tak jedynie wyst�pi� by IOException bo FileNotFoundException jest podklas� (dziedziczy po) IOException - IOException z�apie FileNotFoundException
		//!!!!!!!!!!!czyli najpierw musi by� child exception, p�niej parent Exception!!!!!!!!!!!
		//maj�c exception b�d�ce w relacji child/parent i u�ywaj�c mulicatch nalezy jedynie u�y� parent class inaczej b�dzie b��d/powt�rzenie
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
