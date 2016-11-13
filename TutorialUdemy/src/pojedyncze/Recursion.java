package pojedyncze;

public class Recursion {
	
	public static void main(String[] args) {

		int value = 4;
		calculate(value);
		System.out.println(silnia(value));//wyœwiwtli 24(wynik dzia³ania silni)
		
	}
	
	/*private static void calculate(int value){//nie musi byæ static, ale nie chcemy musieæ robiæ nowego obiektu typu Application by móc wywyo³aæ ta metode wen¹trz tej klasy
		value = value - 1;
		System.out.println(value);//wyœwitli 3, ale wartoœæ value poza t¹ metod¹ nadal bêdzie równa 4, value bêdzie równa value(4) - 1 tylko w tej metodzie
	}*/
	
	/*private static void calculate(int value){//to bêdzie w nieskoñonoœæ siê wykonywa³o, bo funkcja wywo³ujê sam¹ siebie w nieskoñczonoœæ,wywali b³¹d StackOverFlow
		System.out.println(value);
		
		calculate(value);
	}*/
	private static void calculate(int value){
		System.out.println(value);
		if(value < 10){
			calculate(value + 1);
		}
		
		//lub 
		/*if (value == 9){
			return;
		}*/ 
	}
	//rekursja - dopóki nei zainstnieje warunek dla którego aktuwuje siê return lub dla którego przestanie siê wywo³ywac kolejny raz ta sama funkcja dopóty bêdzie dzia³a pêtla
	private static int silnia(int value){
		if(value == 1){
			return 1;
		}
		//jeœli damy value = x, metoda zwraca silnia(x - 1) * x, ale nie wiem ile to jest silnia(x - 1) wiêc wywo³ujê funkcjê silnia (x - 1), która
		//zwraca silnia(x - 1 - 1) * (x - 1) i dopóki silnia(1) to nie zwróci ¿adnej wartoœci a jak dojdzie do tego miejsca to wtedy podliczy ile to jest
		//i wyrzuci wartoœæ, bo mamy warunek if(value==1) return 1
		return silnia(value - 1) * value;
	}
	
}

