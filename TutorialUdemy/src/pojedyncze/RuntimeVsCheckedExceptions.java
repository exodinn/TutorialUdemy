package pojedyncze;

public class RuntimeVsCheckedExceptions {

	public static void main(String[] args) {

		//s¹ 2 rodzaje exceptions w javie - runtime(unchecked) exceptions i chacked exceptions (te dla których góry musimy zdefinowaæ sposób ich obs³ugi (handlingu)
		//Thread.sleep(111);//to jest checked exception bo od razu musimy zdefinowac handling bo wywali b³¹d od razu - bez uruchamiania programu
		
		/*//to jest np unchecked/runtime exception - nie wywali mi b³êdu zanim nie uruchomiê programu, jest to arythmetic exception, klasa dziedzi¹ca
		 //po runtimeException, która natomiast dziedziczy po Exception, nie musimy robiæ dla nich try/catch ani add throw declaration
		int value = 7;
		value = value/0;*/
		
		/*//runtime exception kolejny przyk³ad
		String text = null;
		System.out.println(text.length());	//wywali nullPointerException*/
		
		//wywali ArrayOutOfBoundException bo chcemy wyœwietliæ nieistniej¹cy element ci¹gu (array) - runtime exception
		String[] text = {"one", "two", "three"};
		//jeœli chcemy mo¿emy zrobiæ try/catch dla runtime exception jeœli nie chcemy by koniecznie program siê wywala³ jak wyst¹pi b³¹d
		try{
			System.out.println(text[3]);
		}catch(Exception e){
			System.out.println("Wyst¹pi³ b³¹d.");
			//lub System.out.println(e.toString());
		}
		/*//lub
		 }catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Wyst¹pi³ b³¹d.");
		}*/
	}
}
