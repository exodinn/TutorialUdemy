package publicPrivateProtected;

public class Field {
	Plant roslinka = new Plant();
	
	public Field(){
		//size jest protected, ale Field znajduje si� w tym samym pakiecie co Plant,
		//gdyby Field byc w innym pakiecie pokaza�o by b��d, size nie by�by widoczny dla Field	
		System.out.println(roslinka.size);
	}
}
