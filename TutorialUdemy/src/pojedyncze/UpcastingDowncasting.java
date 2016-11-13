package pojedyncze;

public class UpcastingDowncasting {

	public static void main(String[] args) {	
		Machinee maszyna = new Machinee();
		Camera kamera = new Camera();
		
		maszyna.start();
		kamera.start();
		kamera.snap();
		
		//upcasting - wynika z (gwarantowane przez) polimorfizmu - nie trzeba si� martwi�, bezpieczne
		Machinee maszyna2 = kamera;//maszyna2 wskazuje na obiekt kamera
		maszyna2.start();//zadzia�� bo zar�wno Camera i Machine maj� t� metod�, wywo�a metode klasy Kamera
		//to nie zadzia�a bo maszyna2 jest klasy Machine a nie Camera, a snap() nie jest metod� Machine, to zmienna okre�la jakie metody mog� u�yc a nie obiekt na jaki wskazuje
		//maszyna2.snap();
		
		//downcasting- trzeba uwa�a�
		Machinee maszyna3 = new Camera();
		//Camera kamera2 = maszyna3;//nie zadzia�a, jak robimy downcasting java che potwierdzenie �e wiemy co robimy
		Camera kamera2 = (Camera)maszyna3;//to zadzia�a - rzucamy obiekt klasy Camera wskazywany przez wska�nik klasy Machine (maszyna3) na obiekt klasy Camera
		maszyna3.start();//wy�wietli camera started bo maszyna3 wskazuje na obiekt klasy Camera
		kamera2.start();//wy�wietli camera started bo maszyna3 wskazuje na obiekt klasy Camera a kamera2 wskazuje na maszyna3
		kamera2.snap();
		
		Machinee maszyna4 = new Machinee();
		//Camera kamera3 = (Camera) maszyna4;//wywyali b��d: Machine cannot cast to Camera, bo chcemy rzuci� klas� Machine na Camera - ni�sz� klas� na wy�sz�
		//kamera3.start();//wywyali b��d: Machine cannot cast to Camera, bo chcemy rzuci� klas� Machine na Camera - ni�sz� klas� na wy�sz�
		
	}
}

class Machinee{
	public void start(){
		System.out.println("Machine started.");
	}
}

class Camera extends Machinee{
	
	@Override//nadpisujemy metode start
	public void start(){
		System.out.println("Camera started.");
	}
	
	public void snap(){
		System.out.println("Snap taken.");
	}
}