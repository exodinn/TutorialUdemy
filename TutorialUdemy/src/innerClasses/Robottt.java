package innerClasses;

public class Robottt {
	private int id;
	//klasy wewn¹trzne wykorzystujemy by grupowac klasy
	//klasa anonimowa to te¿ rodzaj klasy wewn¹trznej
	private class Brain{//to jest przyk³ad klasy wewn¹trznej (inner class) - klasa zagnie¿d¿ona (nested)
		public void think(){
			System.out.println("Robot " + id + " thinks.");
		}
	}
	//to jest przyk³ad klasy wewn¹trznej - statyczna klasa, gdy nie potrzbujemy dostêpu do instance variables
	public static class Battery{
		public void charge(){
			System.out.println("Battery is charging.");
			//System.out.println("Charging battery of robot: " + id);//nie zadzia³a bo klasa jest static, wiêc nie ma dostêpu do instance variables
		}
	}
	
	public Robottt(int id) {
		this.id = id;
	}
	
	public void start(){
		System.out.println("Starting robot number: " + id);
		Brain brain = new Brain();
		brain.think();
		
		//to jest przyk³ad klasy wewn¹trznej - klasa wewn¹trz metody, robimy gdy chcemy tej klasy u¿yæ w tej jednej metodzie
		final String name = "Ziutek";//musi byæ final by klasa wewn¹trz metody mia³a dostêp do tej zmiennej lokalnej
		class Temp{//nie dajemy tu ani public ani private ani protected bo i tak widocznoœæ tej klasy jest ograniczona tylko do tej metody
			public void doSomething(){
				System.out.println("ID is: " + id);
				System.out.println("My name is: " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
	
}
