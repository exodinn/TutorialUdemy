package multipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
	//mo¿na wyrzuciæ tylko jeden b³¹d, ale mówimy, ¿e kilka rodzajów b³edu mo¿e zostaæ wyrzuconych, kolejne b³êdy po przecinku
	public void run() throws IOException, ParseException{
		//throw new IOException();//wyrzucamy przyk³adowy exception/b³¹d, komentujemy bo tylko 1 b³¹d mo¿e byæ wyrzucany
		
		throw new ParseException("Error in command list.", 2);//wyrzucamy kolejny exception
	}
	
	//FileNotFoundException dziedziczy po IOException
	public void input() throws IOException, FileNotFoundException{
		
	}
} 
