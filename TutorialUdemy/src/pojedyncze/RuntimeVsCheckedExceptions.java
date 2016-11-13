package pojedyncze;

public class RuntimeVsCheckedExceptions {

	public static void main(String[] args) {

		//s� 2 rodzaje exceptions w javie - runtime(unchecked) exceptions i chacked exceptions (te dla kt�rych g�ry musimy zdefinowa� spos�b ich obs�ugi (handlingu)
		//Thread.sleep(111);//to jest checked exception bo od razu musimy zdefinowac handling bo wywali b��d od razu - bez uruchamiania programu
		
		/*//to jest np unchecked/runtime exception - nie wywali mi b��du zanim nie uruchomi� programu, jest to arythmetic exception, klasa dziedzi�ca
		 //po runtimeException, kt�ra natomiast dziedziczy po Exception, nie musimy robi� dla nich try/catch ani add throw declaration
		int value = 7;
		value = value/0;*/
		
		/*//runtime exception kolejny przyk�ad
		String text = null;
		System.out.println(text.length());	//wywali nullPointerException*/
		
		//wywali ArrayOutOfBoundException bo chcemy wy�wietli� nieistniej�cy element ci�gu (array) - runtime exception
		String[] text = {"one", "two", "three"};
		//je�li chcemy mo�emy zrobi� try/catch dla runtime exception je�li nie chcemy by koniecznie program si� wywala� jak wyst�pi b��d
		try{
			System.out.println(text[3]);
		}catch(Exception e){
			System.out.println("Wyst�pi� b��d.");
			//lub System.out.println(e.toString());
		}
		/*//lub
		 }catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Wyst�pi� b��d.");
		}*/
	}
}
