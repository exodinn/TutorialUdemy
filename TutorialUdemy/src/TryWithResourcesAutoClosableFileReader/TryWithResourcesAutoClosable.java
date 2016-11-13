package TryWithResourcesAutoClosableFileReader;

public class TryWithResourcesAutoClosable {

	public static void main(String[] args) {
		
		/*Temp temp = new Temp();//mo¿emy tak lub
		
		try {
			temp.close();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		//lub tak - od Java7 - automatycznie wywo³uje metodê close() bo implementuje klasê AutoClosable
		try(Temp temp = new Temp()){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}

//AutoClosable u¿ywamy do automatycznego zamykania np buforów, plików, zmusza nas to implementacji metody close() 	
class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing.");
		
	}
	
}
