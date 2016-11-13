package interfaces;

//zamiast tworzenia klasy dajemy PPM na Package Explorer->New->Interface
//Narazie Person i Machine nie s¹ w ¿aden sposób powi¹zane ze sob¹ - nie dziedzicz¹ od siebie czy wspólnej klasy
//ale chcemy stworzyæ metodê showInfo pokazuj¹c¹/wyœwietlaj¹c¹ wartoœæ instance variable dla poszczególnych klas
//instance variable dla tych klas maj¹ ró¿n¹ nazwê i nawet typ

//!!!!!!!!!!!!!!!!!!!!!Nazwy interfejsów powinny zaczynac siê od "I" (taka konwencja) np ICont, wiêc raczej Info to s³aba nazwa

//!!! czêœæ ludzi zaczyna pisac program od definiowania/pisania interfejsów i definicji ich metod 


//nie mo¿na u¿ywaæ new jeœli chodzi o interfejsy
public interface Info {
	
	public void showInfo();//interfejsy nie maj¹ nawet {}, maj¹ tylko headery metod, tylko deklaracja

}
