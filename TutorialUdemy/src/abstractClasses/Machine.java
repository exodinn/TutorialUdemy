package abstractClasses;

public abstract class Machine {//Machine jest klas¹ abstrakcyjn¹ i nie chemy by mo¿na by³o tworzyæ obiekty tej klasy bo nie sa one potrzebne, nic nie wnosz¹
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//towrzymy klasê abstrakcyjn¹, która bêdzie wspólna dla wszystkich obiektów dziedzicz¹cych po Machine ale nie chcemy by sama klasa Machine mia³a t¹ metodê
	public abstract void start();//metody abstrakcyjne u¿ywamy tak jak metody w interfejsie - nie definiujemy ich tylko deklarujemy, w poszczególnych klasach musimy je zdefiniowac
	
	public abstract void doStuff();
	
	public abstract void shutDown();
	
	public void run(){//nie musz¹ tu byæ metody abstrakcyjne
		start();
		//mo¿na wywo³ywac abstrakcyjne metody wewn¹trz klasy, mimo, ¿e s¹ one/musz¹ byæ zdefiniowane dopiero wewn¹trz klas dziedzicz¹cych po danej klasie
		doStuff();
		shutDown();
	}
}
