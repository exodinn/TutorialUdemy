package publicPrivateProtected;

public class Oak extends Plant{
	
	public Oak(){
		//type = "tree";//tu bêdzie b³¹d, instance variable type jest typu private
		
		this.size = "large";//this nie musi byæ, dzia³a size jest typu protected i jest widoczne dla klas dziedziczacych
		
		height = 3;//to jest ok bo Oak i Plant sa w jednym pakiecie
		
	}

}
