package abstractClasses;

public abstract class Machine {//Machine jest klas� abstrakcyjn� i nie chemy by mo�na by�o tworzy� obiekty tej klasy bo nie sa one potrzebne, nic nie wnosz�
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//towrzymy klas� abstrakcyjn�, kt�ra b�dzie wsp�lna dla wszystkich obiekt�w dziedzicz�cych po Machine ale nie chcemy by sama klasa Machine mia�a t� metod�
	public abstract void start();//metody abstrakcyjne u�ywamy tak jak metody w interfejsie - nie definiujemy ich tylko deklarujemy, w poszczeg�lnych klasach musimy je zdefiniowac
	
	public abstract void doStuff();
	
	public abstract void shutDown();
	
	public void run(){//nie musz� tu by� metody abstrakcyjne
		start();
		//mo�na wywo�ywac abstrakcyjne metody wewn�trz klasy, mimo, �e s� one/musz� by� zdefiniowane dopiero wewn�trz klas dziedzicz�cych po danej klasie
		doStuff();
		shutDown();
	}
}
