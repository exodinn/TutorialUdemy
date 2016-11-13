package inheretenceProtectedPrivateOverride;

public class Machine {
	
	//to jest instance variable prywatny wi�c nie b�dzie widoczny dla klas nadrz�dnych np Car
	//private jest widoczny tylko WEWNATRZ klasy, nie poza ni�
	private String name = "Machine Type 1";	
	
	String info = "Information";//to jest instance variable typu public, wi�c widoczna dla klas dziedzicz�cych po Machine
	
	//proteced oznacza, �e dost�p maj� wszystkie klasy dziedzicz�ce po danej klasie lub znajduj�c si� w tym samym pakiecie
	protected String model = "Model";
	
	public void start(){
		System.out.println("Machine started.");
	}
	
	public void stop(){
		System.out.println("Machine stopped.");
	}

}
