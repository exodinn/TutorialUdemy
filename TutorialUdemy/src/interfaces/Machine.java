package interfaces;

//jak nic wiêcej nie zrobimy poka¿e b³¹d - mo¿na PPM na b³¹d i klikn¹æ "Add unimplemented methods" lub samemu dodac rêcznie dodaæ metodê

public class Machine implements Info{//Machine implementuje (definiuje) metody interfejsu Info
	//klasa mo¿e implementowaæ dowaln¹ liczbê interfejsów, s¹ one oddzielone przecinkami
	
	private int id = 7;
	
	public void start(){
		System.out.println("Machine started.");
	}

	@Override//implementujemy metodê zdefiniowan¹ w interfejsie Info/nadpisujemy bo w Info tylko zadeklarowalismy metodê
	public void showInfo() {
		System.out.println("Machine id is: " + id);
		
	}
	
}
