package pojedyncze;
public class Arrays {

	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "you";
		words[2] = "fucker";
		
		System.out.println(words[2]);
		
		String[] lista= {"Co�1", "Co�2", "Co�3"};
		
		for(String elementListy:lista){
			System.out.println(elementListy);
		}
		
		String text;//tylko alokujemy pami�� niezb�dn� do przechowywania adresu Stringa, a nie pami�� do przechowywania samej warto�ci Stringa
		//String teraz ma warto�� null
		text = "lol"; //dopiero w tym momencie alokowana jest pami��, w kt�rej przechowywana jest warto��
	}

}
