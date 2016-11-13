package abstractClasses;

public class Car extends Machine{

	@Override
	public void start() {
		System.out.println("Car starting.");
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff Car");
		
	}

	@Override
	public void shutDown() {
		System.out.println("Shut Car down");
		
	}

}
