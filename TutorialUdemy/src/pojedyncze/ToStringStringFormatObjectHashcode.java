package pojedyncze;

public class ToStringStringFormatObjectHashcode {

	public static void main(String[] args) {	
		Zabka zabka1 = new Zabka(7, "Ropuszka");
		Zabka zabka2 = new Zabka(5, "Zaba");
		//gdy zrobimy println nie definiuj¹c metody toString() to wyœwietli pakietPodstawowy.Zabka@2a139a55
		//2a139a55 to hashcode - unikalny identyfikator obiektów
		//gdy mamy metodê toString() zdefiniowan¹ wyœwietli to co ma wyœwietlaæ ta metoda
		System.out.println(zabka1);
		System.out.println(zabka2);
		
	}
}

//ka¿da klasa dziedziczy po klasie Object, wszystkie podstawowe metody np toString() czy equals() w³aœnie st¹d siê bior¹
class Zabka{
	private int id;
	private String name;
	public String toString(){
		//return id + ": " + name;//najpierw tworzy jednego Stringa, póŸniej kolejnego, który opiera siê na poprzednim
		//a nastepnie wrzuca to do inta, który nastênie jest zamieniany na Stringa
		
		/*//to jest bardziej efektywne ni¿ to co wy¿ej
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();*/
		
		//to jest najbardziej efektywne, mo¿e byæ %-4d, bez znaczenia
		return String.format("%4d: %s", id, name);
	}
	public Zabka(int id, String name){
		this.id = id;
		this.name = name;
	}
}