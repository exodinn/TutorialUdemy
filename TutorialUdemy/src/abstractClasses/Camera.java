package abstractClasses;

public class Camera extends Machine{

	@Override
	public void start() {
		System.out.println("Camera starting.");
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff Camera");
		
	}

	@Override
	public void shutDown() {
		System.out.println("Shut Camera down");
		
	}
	
}
