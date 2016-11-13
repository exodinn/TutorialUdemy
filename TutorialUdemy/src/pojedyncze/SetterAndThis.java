package pojedyncze;

public class SetterAndThis {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		//frog1.name = "Zabka";//tak nie powinno siê robiæ, gdyby name by³o private nie mo¿na by tak zrobiæ
		frog1.age = 1;//tak nie powinno siê robiæ, gdyby name by³o private nie mo¿na by tak zrobiæ
		frog1.setName("Zabka");
		frog1.setAge(1);
		System.out.println(frog1.getName());
		
	}
}

class Frog {
	private String name;//enkapsulacja - ukrywanie pewnych danych sk³adowych tak, aby by³y dostepne z zewn¹trz tylko za pomoca metod
	//teraz frog1.name = "Zabka"; bêdzie wyœwietla³o b³¹d
	int age;//ta instance variable jest nadal dostêpna z zewn¹trz bez u¿ycia metod
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;//this mówi, ¿e chodzi o instance variable, zmienn¹ bêd¹c¹ czêœci¹ klasy, name bez this odnosi siê do parametru metody
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {//nie u¿ywamy this.
		age = newAge;
	}
	
	public void setInfo(String name, int age){
		setName(name);
		setAge(age);
		//this.name = name;//unikaæ u¿ywania this. gdy jest taka mo¿liwoœæ
		//this.setName(name);//unikaæ u¿ywania this. gdy jest taka mo¿liwoœæ
	}
	

}