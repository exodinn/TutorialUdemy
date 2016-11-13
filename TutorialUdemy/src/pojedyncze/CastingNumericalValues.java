package pojedyncze;

public class CastingNumericalValues {

	public static void main(String[] args) {	
		
		byte byteValue = 17;//do 8 bitów
		short shortValue = 55;//16 bitów
		int intValue = 888;//32 bitów
		long longValue = 23456;
		
		//float floatValue = 4233.6;//nie zadzia³a bo jak mamy liczbê z kropk¹ to automatycznie robi z tego double
		float floatValue = 4233.6f;//musi byæ na koñcu f jak defiujemy float jako liczbê z przecinkiem
		float floatVal = (float)234.2;//tak te¿ mo¿e byæ
		double doubleValue = 3265667.54;
		
		System.out.println(Double.MAX_VALUE); //nieprymitywna wersja double, to jest klasa, podobnie jak Byte, Integer
		
		//intValue = longValue;//wywali b³¹d bo nie mo¿na konwertowaæ z long na int
		intValue = (int)longValue;//jest ok, rzucamy (cast) type long na typ int,gdyby long by³ zbyt d³ugi to zostanie on uciêty
		System.out.println(intValue);
		
		doubleValue = intValue;//jest ok, doda tylko .0 do inta, nie musimy robiæ rzutowania (cast), bo nie zmieniamy wartoœci, nic nie ucinamy, tylko dodajemy
		System.out.println(intValue);
		
		//intValue = doubleValue;//bêdzie b³¹d,bo potrzebny jest rzut (cast) - z double na int bêdizemy musieli uci¹æ czeœæ informacji z float
		intValue = (int)floatValue;//to jest ok, bo wykonujemy cast (potwiedzamy, ¿e wiemy co robimy)
		System.out.println(intValue);//wyœwietli 4233 - utnie floata, a NIE zaokr¹gli go
		
		byteValue = (byte) 128;//rzucamy liczbê wiêksza ni¿ maksymalna liczba, która mo¿e przechowac byte
		//wyœwietli -128 , czyli pzrewinie siê do pocz¹tku (cofnie do poczatkowej wartoœci, wyzeruje) i zacznie liczyæ od zera
		//tak jakby wykoan³ operacjê modulo <maksymalna wartoœæ przechowywanej zmiennej>, jeœli by³o by 129 to wyœwitli³o by -127
		System.out.println(byteValue);
	}
}
