package multipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
	//mo�na wyrzuci� tylko jeden b��d, ale m�wimy, �e kilka rodzaj�w b�edu mo�e zosta� wyrzuconych, kolejne b��dy po przecinku
	public void run() throws IOException, ParseException{
		//throw new IOException();//wyrzucamy przyk�adowy exception/b��d, komentujemy bo tylko 1 b��d mo�e by� wyrzucany
		
		throw new ParseException("Error in command list.", 2);//wyrzucamy kolejny exception
	}
	
	//FileNotFoundException dziedziczy po IOException
	public void input() throws IOException, FileNotFoundException{
		
	}
} 
