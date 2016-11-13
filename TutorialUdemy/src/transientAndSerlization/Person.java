package transientAndSerlization;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 6463599313965871632L;
	//transient oznacza, ¿e id nie zostanie serializowne, wtedy jak ta wartoœæ jest zapisywana jako domyœlna wartoœæ,dla intów bêdzie wynosiæ 0;
	private transient int id;
	private String name;
	//sta³e/static nie sa serlializowane!!! - maj¹ zawsze wartoœæ domyœln¹ czyli dla inta 0;
	private static int count;
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
		
		System.out.println("Two-argument constructor.");
	}
	
	public Person() {
		System.out.println("Default constructor.");
	}
	
	@Override
	public String toString(){
		return "Person [id=" + id + " name = " + name + "]" + " count is: " + count;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
}
