package pojedyncze;

public class Constructors {

	public static void main(String[] args) {
		//program sam wybiera konstraktor na podstawie parametru
		Machine machine1 = new Machine();//wyœwietli "Constructor running!"
		Machine machine2 = new Machine("Ropucha");//wyœwietli "Second constructor running!"
		Machine machine3 = new Machine("Zaba", 7);//wyœwietli "Third constructor running!"
		Machine machine4 = new Machine(5);//wyœwietli "Third constructor running!" oraz "Forth constructor running!"
		
	}
}

class Machine {
	private String name;
	private int code;
	
	//konstruktor, jako jedyny nie ma podanego zrwacanego typu (nawet voida), nazwa musi byæ taka sama jak nazwa klasy
	//i naczyna siê z du¿ej litery
	//konstruktory najczêœciej u¿ywa siê do inicjalizacji instance variables
	public Machine(){
		System.out.println("Constructor running!");//konstruktor automatycznie siê uruchamia gdy tworzymy nowy obiekt danej klasy
		name = "Lol";//przy tworzeniu nowego obiektu domyœlnie bêdzie on mia³ od razu instance variable name ustawiona na "Lol"
	}
	//konstruktorów mo¿e byæ wiele, ale ka¿dy musi przyjnowaæ inne parametry
	public Machine(String name){
		System.out.println("Second constructor running!");
		this.name = name;
	}
	
	public Machine(String name, int code){
		System.out.println("Third constructor running!");
		this.name = name;
		this.code = code;
	}
	//mo¿emy u¿ywac konstruktorów wewn¹trz konstruktorów
	public Machine(int code){
		this("Lolek", code);
		System.out.println("Forth constructor running!");
		//Machine("Lolek", code);//tak nie podzia³a
		//this("Lolek", code);//tu nie zadzia³a - konstruktor wewn¹trz konstruktora musi byæ w pierwszej liniejce danego konstruktora
	}

}