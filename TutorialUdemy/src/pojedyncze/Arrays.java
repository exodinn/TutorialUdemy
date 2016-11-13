package pojedyncze;
public class Arrays {

	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "you";
		words[2] = "fucker";
		
		System.out.println(words[2]);
		
		String[] lista= {"Coœ1", "Coœ2", "Coœ3"};
		
		for(String elementListy:lista){
			System.out.println(elementListy);
		}
		
		String text;//tylko alokujemy pamiêæ niezbêdn¹ do przechowywania adresu Stringa, a nie pamiêæ do przechowywania samej wartoœci Stringa
		//String teraz ma wartoœæ null
		text = "lol"; //dopiero w tym momencie alokowana jest pamiêæ, w której przechowywana jest wartoœæ
	}

}
