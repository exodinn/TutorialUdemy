package pojedyncze;

public class StringBuilderAndStringFormatting {

	public static void main(String[] args) {	
		
		//nieefektywne budowanie String�w
		String info = "";//tworz�c String od razu definiuj�c go, tworzymy taki pusty String, dodaj�c kolejne ci�gi znak�w
		//nie zmieniamy pocz�tkowego Stringa, tylko tworzymy nowy przypisuj�c mu warto�� Stringa pocz�tkowego i dopisuj�c 
		//kolejne ci�gi i dodaj�c dolejne ci�gi tworzymy nowe Stringi, wi�c jest to bardzo nieefektywne i mo�e wp�yn�� na
		//dzia�anie programu, a wszystko poniewa� Stringi s� "immutable" (niezmienialne)
		info += "My name is Lol.";
		info += " ";
		info += "I am a Builder";
		System.out.println(info);
		
		//efektywny spos�b budowania String�w, nie tworzymy za ka�dym razem nowych String�w tylko dodajemy nowe ci�gi do buildera
		StringBuilder sb = new StringBuilder();
		sb.append("My name is Moron.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		System.out.println(sb.toString());
		
		//mo�na to samo sykona� pomijaj�c nazw� zmiennej oraz �rednik
		StringBuilder s = new StringBuilder();
		s.append("My name is Sam.")
		.append(" ")
		.append("I am a skydiver.");
		System.out.println(s.toString());
		
		//////Formatowanie//////////////////////////
		System.out.print("Tu jest jaki� tekst. \t To jest tabulacja.\nA to jest nowa linia. ");
		//print/println m�wi o tym czy wy�wietlanie tesktu ma by� zako�czone znacznikiem ko�ca linii czy nie,
		//je�li jest print to oznacza, �e KOLEJNY wy�wietlony teskt b�dzie znajdowa� si� w tej samej linijce
		System.out.println("Ten tekst b�dzie w poprzedniej linijce.");
		
		//w printf musimy okresli� rodzaj zmiennej jaki ma by� wy�wietlony, tak samo jak w C++
		//%d=digit(Integer, liczba ca�kowita), %<liczba>d = okre�la ile cyfr ma mie� dana liczba
		//gdy <liczba> jest ujemna to liczba b�dzie wy�wietlana na pocz�tku, p�niej b�d� ewentualne spacje
		//%s=String, %f=float (zmiennoprzecinkowe, double)
		System.out.printf("Ca�kowity koszt wynosi %7d, a ilo�� wynosi %d\n", 5, 120);//wy�wietli "5" jako "       5"
		System.out.printf("Ca�kowity koszt wynosi %-7d, a ilo�� wynosi %d\n", 5, 120);//wy�wietli "5" jako "5       "
		
		//dzi�ki temu jak bedziemy wy�wietlac teskt to po przej�ciu z liczb jednocyfrowych na dwucyfowe nie b�dzie przesuni�cia tesktu
		//podobnie jakby�my zrobili %-2d, tylko wtedy liczby jednocyfrowe b�d� wyr�wnane do lewej a nie do prawej
		for(int i = 0; i < 20; i++){
			System.out.printf("%2d: jaki� tekst\n", i);
		}
		
		System.out.printf("%s\n","co� tam");//dla String�w
		
		System.out.printf("Liczba zmiennoprzecinkowa: %f\n", 5.6);//dla float, double (liczb zmiennoprzecinkowych)
		
		System.out.printf("Liczba zmiennoprzecinkowa: %.2f\n", 5.6);//dla float, double - okre�lamy ilo�� liczb po przecinku
		
		System.out.printf("Liczba zmiennoprzecinkowa: %.2f\n", 5.62541);//dodatkowo zaokr�gla, wy�wietli 5,63
		
		//podobnie jak dla %d - wy�wietli dodatkowe spacje (puste miejsce), tylko �e do tych "8" wlicza si� 
		//licza cyfr przed przecinkiem, przcinek i cyfry po precinku, czyli zrobi dwie dodatkowe spacje (puste pola)
		System.out.printf("Liczba zmiennoprzecinkowa: %8.2f\n", 155.62541);
		
		
		
	}
}