package enumsBasics;

public class Application {
	
	//tworzymy statici int, nie maj� one konkretnej numeracji, uszeregowania, s� lu�nymi sta�ymi 
	/*public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int MOUSE = 2;*///jak mam enuma nie potrzebuje ju� tych sta�ych

	public static void main(String[] args) {

		//int animal = CAT;//mo�emy nadawa� warto�ci zmiennej za pomoc� static�w//jka nie mamy enum�w
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
		System.out.println(Animal.DOG);//wy�wietli DOG,gdy nie ma stworzonej metody toString, gry jest metoda toString wy�wietli This animal is called Lolek
		System.out.println(Animal.DOG.name());//wy�wietli DOG, nawet gdy zdefiniowali�my toString
		System.out.println(Animal.DOG.getClass());//wy�wietli class nazwaPakietu.Animal
		System.out.println(Animal.DOG instanceof Animal);//wy�wieli true - instanceof okresla czy dany obiekt/enum jest przypadkiem klasy/czy jest stworzony z danej klasy - tu Animal
		System.out.println(Animal.DOG instanceof Enum);//te� wy�wietli true bo Animal cz�ci�/dziedziczy po klasie Enum
		
		System.out.println(Animal.CAT.getName());//wy�wietli Tom
		System.out.println(Animal.CAT.toString());//wy�wietli This animal is called Tom, to samo gdyby nie by�o .toString w println, bo mamy metode toString zdefiniowan�
		
		Animal animal2 = Animal.valueOf("CAT");//trzypisze do animal2 enuma CAT("Tom")
		System.out.println(animal2);//wy�wietli Tom
	}
}

