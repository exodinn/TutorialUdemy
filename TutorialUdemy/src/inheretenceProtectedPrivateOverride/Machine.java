package inheretenceProtectedPrivateOverride;

public class Machine {
	
	//to jest instance variable prywatny wiêc nie bêdzie widoczny dla klas nadrzêdnych np Car
	//private jest widoczny tylko WEWNATRZ klasy, nie poza ni¹
	private String name = "Machine Type 1";	
	
	String info = "Information";//to jest instance variable typu public, wiêc widoczna dla klas dziedzicz¹cych po Machine
	
	//proteced oznacza, ¿e dostêp maj¹ wszystkie klasy dziedzicz¹ce po danej klasie lub znajduj¹c siê w tym samym pakiecie
	protected String model = "Model";
	
	public void start(){
		System.out.println("Machine started.");
	}
	
	public void stop(){
		System.out.println("Machine stopped.");
	}

}
