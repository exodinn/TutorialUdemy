package innerClasses;

public class Application {

	public static void main(String[] args) {
		Robottt robot = new Robottt(3);
		robot.start();
		
		//mo¿na stworzyæ obiekt klasy Brain poza klas¹ Robottt gdy Brain jest klas¹ public, ale tak siê raczej nie robi
		//Robottt.Brain brain = robot.new Brain();
		//brain.think();
		
		Robottt.Battery battery = new Robottt.Battery();//to siê u¿ywa czêsto
	}
}

