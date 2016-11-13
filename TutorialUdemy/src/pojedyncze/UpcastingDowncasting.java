package pojedyncze;

public class UpcastingDowncasting {

	public static void main(String[] args) {	
		Machinee maszyna = new Machinee();
		Camera kamera = new Camera();
		
		maszyna.start();
		kamera.start();
		kamera.snap();
		
		//upcasting - wynika z (gwarantowane przez) polimorfizmu - nie trzeba siê martwiæ, bezpieczne
		Machinee maszyna2 = kamera;//maszyna2 wskazuje na obiekt kamera
		maszyna2.start();//zadzia³¹ bo zarówno Camera i Machine maj¹ t¹ metodê, wywo³a metode klasy Kamera
		//to nie zadzia³a bo maszyna2 jest klasy Machine a nie Camera, a snap() nie jest metod¹ Machine, to zmienna okreœla jakie metody mogê u¿yc a nie obiekt na jaki wskazuje
		//maszyna2.snap();
		
		//downcasting- trzeba uwa¿aæ
		Machinee maszyna3 = new Camera();
		//Camera kamera2 = maszyna3;//nie zadzia³a, jak robimy downcasting java che potwierdzenie ¿e wiemy co robimy
		Camera kamera2 = (Camera)maszyna3;//to zadzia³a - rzucamy obiekt klasy Camera wskazywany przez wskaŸnik klasy Machine (maszyna3) na obiekt klasy Camera
		maszyna3.start();//wyœwietli camera started bo maszyna3 wskazuje na obiekt klasy Camera
		kamera2.start();//wyœwietli camera started bo maszyna3 wskazuje na obiekt klasy Camera a kamera2 wskazuje na maszyna3
		kamera2.snap();
		
		Machinee maszyna4 = new Machinee();
		//Camera kamera3 = (Camera) maszyna4;//wywyali b³¹d: Machine cannot cast to Camera, bo chcemy rzuciæ klasê Machine na Camera - ni¿sz¹ klasê na wy¿sz¹
		//kamera3.start();//wywyali b³¹d: Machine cannot cast to Camera, bo chcemy rzuciæ klasê Machine na Camera - ni¿sz¹ klasê na wy¿sz¹
		
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