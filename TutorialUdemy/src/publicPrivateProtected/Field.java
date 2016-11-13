package publicPrivateProtected;

public class Field {
	Plant roslinka = new Plant();
	
	public Field(){
		//size jest protected, ale Field znajduje siê w tym samym pakiecie co Plant,
		//gdyby Field byc w innym pakiecie pokaza³o by b³¹d, size nie by³by widoczny dla Field	
		System.out.println(roslinka.size);
	}
}
