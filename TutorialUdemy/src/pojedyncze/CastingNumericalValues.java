package pojedyncze;

public class CastingNumericalValues {

	public static void main(String[] args) {	
		
		byte byteValue = 17;//do 8 bit�w
		short shortValue = 55;//16 bit�w
		int intValue = 888;//32 bit�w
		long longValue = 23456;
		
		//float floatValue = 4233.6;//nie zadzia�a bo jak mamy liczb� z kropk� to automatycznie robi z tego double
		float floatValue = 4233.6f;//musi by� na ko�cu f jak defiujemy float jako liczb� z przecinkiem
		float floatVal = (float)234.2;//tak te� mo�e by�
		double doubleValue = 3265667.54;
		
		System.out.println(Double.MAX_VALUE); //nieprymitywna wersja double, to jest klasa, podobnie jak Byte, Integer
		
		//intValue = longValue;//wywali b��d bo nie mo�na konwertowa� z long na int
		intValue = (int)longValue;//jest ok, rzucamy (cast) type long na typ int,gdyby long by� zbyt d�ugi to zostanie on uci�ty
		System.out.println(intValue);
		
		doubleValue = intValue;//jest ok, doda tylko .0 do inta, nie musimy robi� rzutowania (cast), bo nie zmieniamy warto�ci, nic nie ucinamy, tylko dodajemy
		System.out.println(intValue);
		
		//intValue = doubleValue;//b�dzie b��d,bo potrzebny jest rzut (cast) - z double na int b�dizemy musieli uci�� cze�� informacji z float
		intValue = (int)floatValue;//to jest ok, bo wykonujemy cast (potwiedzamy, �e wiemy co robimy)
		System.out.println(intValue);//wy�wietli 4233 - utnie floata, a NIE zaokr�gli go
		
		byteValue = (byte) 128;//rzucamy liczb� wi�ksza ni� maksymalna liczba, kt�ra mo�e przechowac byte
		//wy�wietli -128 , czyli pzrewinie si� do pocz�tku (cofnie do poczatkowej warto�ci, wyzeruje) i zacznie liczy� od zera
		//tak jakby wykoan� operacj� modulo <maksymalna warto�� przechowywanej zmiennej>, je�li by�o by 129 to wy�witli�o by -127
		System.out.println(byteValue);
	}
}
