package pojedyncze;

public class SetterAndThis {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		//frog1.name = "Zabka";//tak nie powinno si� robi�, gdyby name by�o private nie mo�na by tak zrobi�
		frog1.age = 1;//tak nie powinno si� robi�, gdyby name by�o private nie mo�na by tak zrobi�
		frog1.setName("Zabka");
		frog1.setAge(1);
		System.out.println(frog1.getName());
		
	}
}

class Frog {
	private String name;//enkapsulacja - ukrywanie pewnych danych sk�adowych tak, aby by�y dostepne z zewn�trz tylko za pomoca metod
	//teraz frog1.name = "Zabka"; b�dzie wy�wietla�o b��d
	int age;//ta instance variable jest nadal dost�pna z zewn�trz bez u�ycia metod
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;//this m�wi, �e chodzi o instance variable, zmienn� b�d�c� cz�ci� klasy, name bez this odnosi si� do parametru metody
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {//nie u�ywamy this.
		age = newAge;
	}
	
	public void setInfo(String name, int age){
		setName(name);
		setAge(age);
		//this.name = name;//unika� u�ywania this. gdy jest taka mo�liwo��
		//this.setName(name);//unika� u�ywania this. gdy jest taka mo�liwo��
	}
	

}