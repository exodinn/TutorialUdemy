package pojedyncze;

public class Encapsulation {

	public static void main(String[] args) {	

		
		
	}
}
//to jest idea enkapsulacji
class Plant {
	//d¹¿ymy by wszystkie instance variable by³y private, tylko ewentualnie sta³e by³y public, jak ma byæ do instance variable dostêp z zewn¹trz wtedy get i set zrobiæ
	private String name;
	//gettery i settery mo¿emy stworzyæ klikaj¹c PPM->Source->Generate Setters and Getters
	
	//sta³a dostêna z zewn¹trz klasy
	public final static int ID = 7;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getData(){
		String data = "Coœ tam" + calcualtGrowth();
		
		return data;
	}
	
	//jeœli mozna to staramy siê by wszystko do czego nie chcemy by by³ dostêp z zewn¹trz by³o private 
	//jeœli chcemy by coœ by³o dostêpne dla klas dziedziczacych zróbmy protected, pubic tylko gdy rzeczywiœcie konieczne jest by by³a dostepna z zewn¹trz
	private int calcualtGrowth(){
		return 9;
	}
	
}
