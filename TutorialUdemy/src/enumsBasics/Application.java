package enumsBasics;

public class Application {
	
	//tworzymy statici int, nie maj¹ one konkretnej numeracji, uszeregowania, s¹ luŸnymi sta³ymi 
	/*public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int MOUSE = 2;*///jak mam enuma nie potrzebuje ju¿ tych sta³ych

	public static void main(String[] args) {

		//int animal = CAT;//mo¿emy nadawaæ wartoœci zmiennej za pomoc¹ staticów//jka nie mamy enumów
		Animal animal = Animal.CAT;//jak mamy enumy
		
		/*switch(animal){//gdy nie ma enuma
		case(DOG):
			System.out.println("Dog");
			break;
		case(CAT):
			System.out.println("Cat");
			break;
		case(MOUSE):
			System.out.println("Mouse");
			break;*/
		
		switch(animal){
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		}
		System.out.println(Animal.DOG);//wyœwietli DOG,gdy nie ma stworzonej metody toString, gry jest metoda toString wyœwietli This animal is called Lolek
		System.out.println(Animal.DOG.name());//wyœwietli DOG, nawet gdy zdefiniowaliœmy toString
		System.out.println(Animal.DOG.getClass());//wyœwietli class nazwaPakietu.Animal
		System.out.println(Animal.DOG instanceof Animal);//wyœwieli true - instanceof okresla czy dany obiekt/enum jest przypadkiem klasy/czy jest stworzony z danej klasy - tu Animal
		System.out.println(Animal.DOG instanceof Enum);//te¿ wyœwietli true bo Animal czêœci¹/dziedziczy po klasie Enum
		
		System.out.println(Animal.CAT.getName());//wyœwietli Tom
		System.out.println(Animal.CAT.toString());//wyœwietli This animal is called Tom, to samo gdyby nie by³o .toString w println, bo mamy metode toString zdefiniowan¹
		
		Animal animal2 = Animal.valueOf("CAT");//trzypisze do animal2 enuma CAT("Tom")
		System.out.println(animal2);//wyœwietli Tom
	}
}

