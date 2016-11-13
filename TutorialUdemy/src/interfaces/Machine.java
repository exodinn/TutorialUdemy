package interfaces;

//jak nic wi�cej nie zrobimy poka�e b��d - mo�na PPM na b��d i klikn�� "Add unimplemented methods" lub samemu dodac r�cznie doda� metod�

public class Machine implements Info{//Machine implementuje (definiuje) metody interfejsu Info
	//klasa mo�e implementowa� dowaln� liczb� interfejs�w, s� one oddzielone przecinkami
	
	private int id = 7;
	
	public void start(){
		System.out.println("Machine started.");
	}

	@Override//implementujemy metod� zdefiniowan� w interfejsie Info/nadpisujemy bo w Info tylko zadeklarowalismy metod�
	public void showInfo() {
		System.out.println("Machine id is: " + id);
		
	}
	
}
