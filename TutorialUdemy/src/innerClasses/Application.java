package innerClasses;

public class Application {

	public static void main(String[] args) {
		Robottt robot = new Robottt(3);
		robot.start();
		
		//mo�na stworzy� obiekt klasy Brain poza klas� Robottt gdy Brain jest klas� public, ale tak si� raczej nie robi
		//Robottt.Brain brain = robot.new Brain();
		//brain.think();
		
		Robottt.Battery battery = new Robottt.Battery();//to si� u�ywa cz�sto
	}
}

