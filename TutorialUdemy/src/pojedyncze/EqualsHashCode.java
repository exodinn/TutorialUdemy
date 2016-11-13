package pojedyncze;

public class EqualsHashCode {

	public static void main(String[] args) {
		//u¿ywaæ == tylko dla typów prymitywnych
		Persoon osoba1 = new Persoon(4, "Jan");
		Persoon osoba2 = new Persoon(4, "Jan");
		Persoon osoba3 = new Persoon(7, "Mietek");
		
		// == mówi tylko czy obie zmienne: osoba1 i osoba2 wskazuj¹ na ten sam obiekt czy nie, nawet jak bêd¹ mia³y takie same wartoœci id i name
		//to z porównania bêdzie wynik false, jakbysmy zrobili osoba2 = osoba1, wtedy osoba2 wskazuje na ten sam obiekt co osoba1 i bêdzie true
		/*if(osoba1 == osoba2){
			
		}*/
		//System.out.println(osoba1 == osoba2);//to samo co wy¿ej
		
		//System.out.println(osoba1.equals(osoba2));//to samo co wy¿ej, te¿ poka¿e false gdy nie nadpisaliœmy equals()
		System.out.println(osoba1.equals(osoba2));//po nadpisaniu equals() poka¿e true
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		System.out.println(value1 == value2);//wyœwietli false, z tego samego powodu do wy¿ej, == dzia³a poprawnie na typach prumitywnych jak int czy double
		System.out.println(value1.equals(value2));//wyœwietli true
		
		double value3 = 7.2;
		double value4 = 7.2;
		System.out.println(value3 == value4);//wyœwietli true bo double to typ prymitywny
		
		Integer value5 = 7;
		Integer value6 = 7;
		System.out.println(value5 == value6);//to bêdzie true, bo Java stworzy tylko jeden obiekt, dla Double to tak nie dzia³a
		
		String text1 = "Hello";
		String text2 = "Hello";
		String text3 = "Hello1111".substring(0, 5);//substring tworzy nowy Stringa na podstawie innego Stringa
		System.out.println(text1 == text2);//poka¿e true bo java stworzy³a jeden obiekt
		System.out.println(text3);//poka¿e Hello
		System.out.println(text1 == text3);//poka¿e false, bo dla text3 java stworzy³ nowy obiekt
		
		System.out.println(new Object());//wyœwietli np java.lang.Object@2a139a55 gdzie 2a139a55 to hashCode - unikalny numer dla ka¿dego obiektu
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
	public boolean equals(Object obj) {//nadpisujemy metodê equals()
		if (this == obj)//jeœli obie zmienne wskazuj¹ na ten sam obiekt
			return true;
		if (obj == null)//jeœli zmienna w nawiasie wynosi null
			return false;
		if (getClass() != obj.getClass())//jeœli oba obie zmienne wskazuj¹ na obiekty innych klas
			return false;
		Persoon other = (Persoon) obj;
		//prównanie poszczególnych zmiennych
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
