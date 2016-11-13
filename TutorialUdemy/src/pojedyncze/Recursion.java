package pojedyncze;

public class Recursion {
	
	public static void main(String[] args) {

		int value = 4;
		calculate(value);
		System.out.println(silnia(value));//wy�wiwtli 24(wynik dzia�ania silni)
		
	}
	
	/*private static void calculate(int value){//nie musi by� static, ale nie chcemy musie� robi� nowego obiektu typu Application by m�c wywyo�a� ta metode wen�trz tej klasy
		value = value - 1;
		System.out.println(value);//wy�witli 3, ale warto�� value poza t� metod� nadal b�dzie r�wna 4, value b�dzie r�wna value(4) - 1 tylko w tej metodzie
	}*/
	
	/*private static void calculate(int value){//to b�dzie w niesko�ono�� si� wykonywa�o, bo funkcja wywo�uj� sam� siebie w niesko�czono��,wywali b��d StackOverFlow
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
	//rekursja - dop�ki nei zainstnieje warunek dla kt�rego aktuwuje si� return lub dla kt�rego przestanie si� wywo�ywac kolejny raz ta sama funkcja dop�ty b�dzie dzia�a p�tla
	private static int silnia(int value){
		if(value == 1){
			return 1;
		}
		//je�li damy value = x, metoda zwraca silnia(x - 1) * x, ale nie wiem ile to jest silnia(x - 1) wi�c wywo�uj� funkcj� silnia (x - 1), kt�ra
		//zwraca silnia(x - 1 - 1) * (x - 1) i dop�ki silnia(1) to nie zwr�ci �adnej warto�ci a jak dojdzie do tego miejsca to wtedy podliczy ile to jest
		//i wyrzuci warto��, bo mamy warunek if(value==1) return 1
		return silnia(value - 1) * value;
	}
	
}

