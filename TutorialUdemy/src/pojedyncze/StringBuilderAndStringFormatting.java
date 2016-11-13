package pojedyncze;

public class StringBuilderAndStringFormatting {

	public static void main(String[] args) {	
		
		//nieefektywne budowanie Stringów
		String info = "";//tworz¹c String od razu definiuj¹c go, tworzymy taki pusty String, dodaj¹c kolejne ci¹gi znaków
		//nie zmieniamy pocz¹tkowego Stringa, tylko tworzymy nowy przypisuj¹c mu wartoœæ Stringa pocz¹tkowego i dopisuj¹c 
		//kolejne ci¹gi i dodaj¹c dolejne ci¹gi tworzymy nowe Stringi, wiêc jest to bardzo nieefektywne i mo¿e wp³yn¹æ na
		//dzia³anie programu, a wszystko poniewa¿ Stringi s¹ "immutable" (niezmienialne)
		info += "My name is Lol.";
		info += " ";
		info += "I am a Builder";
		System.out.println(info);
		
		//efektywny sposób budowania Stringów, nie tworzymy za ka¿dym razem nowych Stringów tylko dodajemy nowe ci¹gi do buildera
		StringBuilder sb = new StringBuilder();
		sb.append("My name is Moron.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		System.out.println(sb.toString());
		
		//mo¿na to samo sykonaæ pomijaj¹c nazwê zmiennej oraz œrednik
		StringBuilder s = new StringBuilder();
		s.append("My name is Sam.")
		.append(" ")
		.append("I am a skydiver.");
		System.out.println(s.toString());
		
		//////Formatowanie//////////////////////////
		System.out.print("Tu jest jakiœ tekst. \t To jest tabulacja.\nA to jest nowa linia. ");
		//print/println mówi o tym czy wyœwietlanie tesktu ma byæ zakoñczone znacznikiem koñca linii czy nie,
		//jeœli jest print to oznacza, ¿e KOLEJNY wyœwietlony teskt bêdzie znajdowa³ siê w tej samej linijce
		System.out.println("Ten tekst bêdzie w poprzedniej linijce.");
		
		//w printf musimy okresliæ rodzaj zmiennej jaki ma byæ wyœwietlony, tak samo jak w C++
		//%d=digit(Integer, liczba ca³kowita), %<liczba>d = okreœla ile cyfr ma mieæ dana liczba
		//gdy <liczba> jest ujemna to liczba bêdzie wyœwietlana na pocz¹tku, póŸniej bêd¹ ewentualne spacje
		//%s=String, %f=float (zmiennoprzecinkowe, double)
		System.out.printf("Ca³kowity koszt wynosi %7d, a iloœæ wynosi %d\n", 5, 120);//wyœwietli "5" jako "       5"
		System.out.printf("Ca³kowity koszt wynosi %-7d, a iloœæ wynosi %d\n", 5, 120);//wyœwietli "5" jako "5       "
		
		//dziêki temu jak bedziemy wyœwietlac teskt to po przejœciu z liczb jednocyfrowych na dwucyfowe nie bêdzie przesuniêcia tesktu
		//podobnie jakbyœmy zrobili %-2d, tylko wtedy liczby jednocyfrowe bêd¹ wyrównane do lewej a nie do prawej
		for(int i = 0; i < 20; i++){
			System.out.printf("%2d: jakiœ tekst\n", i);
		}
		
		System.out.printf("%s\n","coœ tam");//dla Stringów
		
		System.out.printf("Liczba zmiennoprzecinkowa: %f\n", 5.6);//dla float, double (liczb zmiennoprzecinkowych)
		
		System.out.printf("Liczba zmiennoprzecinkowa: %.2f\n", 5.6);//dla float, double - okreœlamy iloœæ liczb po przecinku
		
		System.out.printf("Liczba zmiennoprzecinkowa: %.2f\n", 5.62541);//dodatkowo zaokr¹gla, wyœwietli 5,63
		
		//podobnie jak dla %d - wyœwietli dodatkowe spacje (puste miejsce), tylko ¿e do tych "8" wlicza siê 
		//licza cyfr przed przecinkiem, przcinek i cyfry po precinku, czyli zrobi dwie dodatkowe spacje (puste pola)
		System.out.printf("Liczba zmiennoprzecinkowa: %8.2f\n", 155.62541);
		
		
		
	}
}