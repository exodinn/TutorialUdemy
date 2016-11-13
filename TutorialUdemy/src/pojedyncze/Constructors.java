package pojedyncze;

public class Constructors {

	public static void main(String[] args) {
		//program sam wybiera konstraktor na podstawie parametru
		Machine machine1 = new Machine();//wy�wietli "Constructor running!"
		Machine machine2 = new Machine("Ropucha");//wy�wietli "Second constructor running!"
		Machine machine3 = new Machine("Zaba", 7);//wy�wietli "Third constructor running!"
		Machine machine4 = new Machine(5);//wy�wietli "Third constructor running!" oraz "Forth constructor running!"
		
	}
}

class Machine {
	private String name;
	private int code;
	
	//konstruktor, jako jedyny nie ma podanego zrwacanego typu (nawet voida), nazwa musi by� taka sama jak nazwa klasy
	//i naczyna si� z du�ej litery
	//konstruktory najcz�ciej u�ywa si� do inicjalizacji instance variables
	public Machine(){
		System.out.println("Constructor running!");//konstruktor automatycznie si� uruchamia gdy tworzymy nowy obiekt danej klasy
		name = "Lol";//przy tworzeniu nowego obiektu domy�lnie b�dzie on mia� od razu instance variable name ustawiona na "Lol"
	}
	//konstruktor�w mo�e by� wiele, ale ka�dy musi przyjnowa� inne parametry
	public Machine(String name){
		System.out.println("Second constructor running!");
		this.name = name;
	}
	
	public Machine(String name, int code){
		System.out.println("Third constructor running!");
		this.name = name;
		this.code = code;
	}
	//mo�emy u�ywac konstruktor�w wewn�trz konstruktor�w
	public Machine(int code){
		this("Lolek", code);
		System.out.println("Forth constructor running!");
		//Machine("Lolek", code);//tak nie podzia�a
		//this("Lolek", code);//tu nie zadzia�a - konstruktor wewn�trz konstruktora musi by� w pierwszej liniejce danego konstruktora
	}

}