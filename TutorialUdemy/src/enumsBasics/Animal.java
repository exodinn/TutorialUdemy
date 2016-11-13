package enumsBasics;

//daje new->Enum
public enum Animal {
	//CAT,DOG,MOUSE; wcze�niej
	CAT("Tom"),DOG ("Lolek"),MOUSE("Jerry");
	
	private String name;
	
	Animal(String name){//albo po prostu private
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString(){//mo�emy stworzy� metode toString
		return "This animal is called " + name;
	}
}
