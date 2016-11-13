package packages;
//je�li co� jest w default package nie ma tej linijki na g�rze, a na dysku nie jest przechowywane w �adnym folderze
//pozosta�e pakiety s� przechowywane w folderach o nazwach takich samych na nazwy pakietu
//gdy pakiet nazywa si� hello.lol.wow to na dysku przechowywany jest w folderze wow, znajduj�cym si� w folderze
//lol, znajduj�cym si� w folderze hello, czyli w �cie�ce: hello/lol/wow

//Ctrl+Shift+O lub PPM->Source->Organize Imports - automatycznie dodaje brakuj�ce importy i usunie niepotrzebne

//!!!!!!!!!!!!!!!!
//jak chcemy p�niej przekaza� komu� nasz kod w formie .jar to najlepiej tak nazywac pakiety by mia�y unikaln� nazw�
//je�li mamy stron� www to nazywamy pakiet np com.google.nazwaAplikacji, gdzie com.google to adres naszej strony

import packages.Fish;
import packages.Seaweed;
//import packages.*;//importuje wszystki klasy danego pakietu czyli od razu importuje Fish i Seaweed

//ka�dy plik .java (znajduj� si� w folderze src) generuje plik .class (znajduj�cy si� w folderze bin)

public class Packages {

	public static void main(String[] args) {	
		//gdy mamy klasy o takich samych nazwa i s� one w innych pakietach to nie ma problemu
		//pakiety chroni� przed problemami zwi�zanymi z powatrzaj�cymi si� nazwami klas
		//nazwy pakiet�w zaczynaja si� z ma�ych liter i sa bez spacji
		
		
		//jesli Packages.java znajduje si� w innym pakiecie niz Fish.java poka�e b��d 
		//i oczywi�cie nie mamy importa zrobionego, jak dodamy import b��d znika
		Fish fish = new Fish();
		
		//jak dodaj� obiekt klasy, kt�ra znajduje si� w pewnym pakiecie i dla jakie� klasy tego w�a�nie pakietu ju�
		//mamy dodanego importa (w tym przypadku Fish znajduje si� w tym samym pakiecie co Seaweed) to Eclipse
		//automatycznie doda nam importa dla tej nowej klasy (Seaweed) - nie musia�em sam dodawa� importa dla Seaweed
		Seaweed seaweed = new Seaweed();
		
		
	}
}