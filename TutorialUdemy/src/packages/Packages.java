package packages;
//jeœli coæ jest w default package nie ma tej linijki na górze, a na dysku nie jest przechowywane w ¿adnym folderze
//pozosta³e pakiety s¹ przechowywane w folderach o nazwach takich samych na nazwy pakietu
//gdy pakiet nazywa siê hello.lol.wow to na dysku przechowywany jest w folderze wow, znajduj¹cym siê w folderze
//lol, znajduj¹cym siê w folderze hello, czyli w œcie¿ce: hello/lol/wow

//Ctrl+Shift+O lub PPM->Source->Organize Imports - automatycznie dodaje brakuj¹ce importy i usunie niepotrzebne

//!!!!!!!!!!!!!!!!
//jak chcemy póŸniej przekazaæ komuœ nasz kod w formie .jar to najlepiej tak nazywac pakiety by mia³y unikaln¹ nazwê
//jeœli mamy stronê www to nazywamy pakiet np com.google.nazwaAplikacji, gdzie com.google to adres naszej strony

import packages.Fish;
import packages.Seaweed;
//import packages.*;//importuje wszystki klasy danego pakietu czyli od razu importuje Fish i Seaweed

//ka¿dy plik .java (znajduj¹ siê w folderze src) generuje plik .class (znajduj¹cy siê w folderze bin)

public class Packages {

	public static void main(String[] args) {	
		//gdy mamy klasy o takich samych nazwa i s¹ one w innych pakietach to nie ma problemu
		//pakiety chroni¹ przed problemami zwi¹zanymi z powatrzaj¹cymi siê nazwami klas
		//nazwy pakietów zaczynaja siê z ma³ych liter i sa bez spacji
		
		
		//jesli Packages.java znajduje siê w innym pakiecie niz Fish.java poka¿e b³¹d 
		//i oczywiœcie nie mamy importa zrobionego, jak dodamy import b³¹d znika
		Fish fish = new Fish();
		
		//jak dodajê obiekt klasy, która znajduje siê w pewnym pakiecie i dla jakieœ klasy tego w³aœnie pakietu ju¿
		//mamy dodanego importa (w tym przypadku Fish znajduje siê w tym samym pakiecie co Seaweed) to Eclipse
		//automatycznie doda nam importa dla tej nowej klasy (Seaweed) - nie musia³em sam dodawaæ importa dla Seaweed
		Seaweed seaweed = new Seaweed();
		
		
	}
}