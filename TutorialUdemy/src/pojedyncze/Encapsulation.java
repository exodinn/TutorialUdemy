package pojedyncze;

public class Encapsulation {

	public static void main(String[] args) {	

		
		
	}
}
//to jest idea enkapsulacji
class Plant {
	//d��ymy by wszystkie instance variable by�y private, tylko ewentualnie sta�e by�y public, jak ma by� do instance variable dost�p z zewn�trz wtedy get i set zrobi�
	private String name;
	//gettery i settery mo�emy stworzy� klikaj�c PPM->Source->Generate Setters and Getters
	
	//sta�a dost�na z zewn�trz klasy
	public final static int ID = 7;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getData(){
		String data = "Co� tam" + calcualtGrowth();
		
		return data;
	}
	
	//je�li mozna to staramy si� by wszystko do czego nie chcemy by by� dost�p z zewn�trz by�o private 
	//je�li chcemy by co� by�o dost�pne dla klas dziedziczacych zr�bmy protected, pubic tylko gdy rzeczywi�cie konieczne jest by by�a dostepna z zewn�trz
	private int calcualtGrowth(){
		return 9;
	}
	
}
