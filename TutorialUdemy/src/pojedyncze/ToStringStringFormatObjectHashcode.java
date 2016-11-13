package pojedyncze;

public class ToStringStringFormatObjectHashcode {

	public static void main(String[] args) {	
		Zabka zabka1 = new Zabka(7, "Ropuszka");
		Zabka zabka2 = new Zabka(5, "Zaba");
		//gdy zrobimy println nie definiuj�c metody toString() to wy�wietli pakietPodstawowy.Zabka@2a139a55
		//2a139a55 to hashcode - unikalny identyfikator obiekt�w
		//gdy mamy metod� toString() zdefiniowan� wy�wietli to co ma wy�wietla� ta metoda
		System.out.println(zabka1);
		System.out.println(zabka2);
		
	}
}

//ka�da klasa dziedziczy po klasie Object, wszystkie podstawowe metody np toString() czy equals() w�a�nie st�d si� bior�
class Zabka{
	private int id;
	private String name;
	public String toString(){
		//return id + ": " + name;//najpierw tworzy jednego Stringa, p�niej kolejnego, kt�ry opiera si� na poprzednim
		//a nastepnie wrzuca to do inta, kt�ry nast�nie jest zamieniany na Stringa
		
		/*//to jest bardziej efektywne ni� to co wy�ej
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();*/
		
		//to jest najbardziej efektywne, mo�e by� %-4d, bez znaczenia
		return String.format("%4d: %s", id, name);
	}
	public Zabka(int id, String name){
		this.id = id;
		this.name = name;
	}
}