package pojedyncze;

public class EqualsHashCode {

	public static void main(String[] args) {
		//u�ywa� == tylko dla typ�w prymitywnych
		Persoon osoba1 = new Persoon(4, "Jan");
		Persoon osoba2 = new Persoon(4, "Jan");
		Persoon osoba3 = new Persoon(7, "Mietek");
		
		// == m�wi tylko czy obie zmienne: osoba1 i osoba2 wskazuj� na ten sam obiekt czy nie, nawet jak b�d� mia�y takie same warto�ci id i name
		//to z por�wnania b�dzie wynik false, jakbysmy zrobili osoba2 = osoba1, wtedy osoba2 wskazuje na ten sam obiekt co osoba1 i b�dzie true
		/*if(osoba1 == osoba2){
			
		}*/
		//System.out.println(osoba1 == osoba2);//to samo co wy�ej
		
		//System.out.println(osoba1.equals(osoba2));//to samo co wy�ej, te� poka�e false gdy nie nadpisali�my equals()
		System.out.println(osoba1.equals(osoba2));//po nadpisaniu equals() poka�e true
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		System.out.println(value1 == value2);//wy�wietli false, z tego samego powodu do wy�ej, == dzia�a poprawnie na typach prumitywnych jak int czy double
		System.out.println(value1.equals(value2));//wy�wietli true
		
		double value3 = 7.2;
		double value4 = 7.2;
		System.out.println(value3 == value4);//wy�wietli true bo double to typ prymitywny
		
		Integer value5 = 7;
		Integer value6 = 7;
		System.out.println(value5 == value6);//to b�dzie true, bo Java stworzy tylko jeden obiekt, dla Double to tak nie dzia�a
		
		String text1 = "Hello";
		String text2 = "Hello";
		String text3 = "Hello1111".substring(0, 5);//substring tworzy nowy Stringa na podstawie innego Stringa
		System.out.println(text1 == text2);//poka�e true bo java stworzy�a jeden obiekt
		System.out.println(text3);//poka�e Hello
		System.out.println(text1 == text3);//poka�e false, bo dla text3 java stworzy� nowy obiekt
		
		System.out.println(new Object());//wy�wietli np java.lang.Object@2a139a55 gdzie 2a139a55 to hashCode - unikalny numer dla ka�dego obiektu
	}
}

class Persoon {
	private int id;
	private String name;

	public Persoon(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Persoon [id=" + id + ", name=" + name + "]";
	}

	//PPM source->Generate hashCode() and equals()
	@Override
	public boolean equals(Object obj) {//nadpisujemy metod� equals()
		if (this == obj)//je�li obie zmienne wskazuj� na ten sam obiekt
			return true;
		if (obj == null)//je�li zmienna w nawiasie wynosi null
			return false;
		if (getClass() != obj.getClass())//je�li oba obie zmienne wskazuj� na obiekty innych klas
			return false;
		Persoon other = (Persoon) obj;
		//pr�wnanie poszczeg�lnych zmiennych
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
