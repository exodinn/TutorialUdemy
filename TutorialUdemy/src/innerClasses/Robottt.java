package innerClasses;

public class Robottt {
	private int id;
	//klasy wewn�trzne wykorzystujemy by grupowac klasy
	//klasa anonimowa to te� rodzaj klasy wewn�trznej
	private class Brain{//to jest przyk�ad klasy wewn�trznej (inner class) - klasa zagnie�d�ona (nested)
		public void think(){
			System.out.println("Robot " + id + " thinks.");
		}
	}
	//to jest przyk�ad klasy wewn�trznej - statyczna klasa, gdy nie potrzbujemy dost�pu do instance variables
	public static class Battery{
		public void charge(){
			System.out.println("Battery is charging.");
			//System.out.println("Charging battery of robot: " + id);//nie zadzia�a bo klasa jest static, wi�c nie ma dost�pu do instance variables
		}
	}
	
	public Robottt(int id) {
		this.id = id;
	}
	
	public void start(){
		System.out.println("Starting robot number: " + id);
		Brain brain = new Brain();
		brain.think();
		
		//to jest przyk�ad klasy wewn�trznej - klasa wewn�trz metody, robimy gdy chcemy tej klasy u�y� w tej jednej metodzie
		final String name = "Ziutek";//musi by� final by klasa wewn�trz metody mia�a dost�p do tej zmiennej lokalnej
		class Temp{//nie dajemy tu ani public ani private ani protected bo i tak widoczno�� tej klasy jest ograniczona tylko do tej metody
			public void doSomething(){
				System.out.println("ID is: " + id);
				System.out.println("My name is: " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
	
}
