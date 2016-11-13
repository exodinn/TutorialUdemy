package pojedyncze;
public class Macierze_MultiDimensionalArrays {

	public static void main(String[] args) {
		
		int[] values = {1, 13, 345};//wektor/ci¹g (array) intów - jednowymiarowy
		System.out.println(values[2]);
		
		int grid[][] = {//macierz (wektor wektorów) - ka¿dy wers mo¿e miec inn¹ liczbê elementów
			{1, 13, 345},
			{2, 6},
			{1, 5, 77, 88}	
		};
		
		System.out.println(grid[0][2]);//wyœwietli 345
		
		String[][] texts= new String[2][3];//stworzyliœmy jedynie referencje do macierzy Stringów
		System.out.println(texts[1][2]);//wyjdzie null
		texts[1][2] = "Hello";
		System.out.println(texts[1][2]);//terraz wyœwietli Hello
		
		//iteruje po wszystkich elementach macierzy i je wyœwietla oddzielaj¹c elementy jednego wiersza tabem i enterem kolumny
		for (int row = 0; row < grid.length; row++){
			for (int col = 0; col < grid[row].length; col++){
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
		
		String[][] words = new String[2][];
		words[0][0] = "lol";//wywali b³¹d - nie zdefiniowaliœmy wymiaru dla kolumn
		words[0] = new String[3];
		words[0][0] = "lol";
		System.out.println(words[0][0]);//poka¿e prawid³owo lol
		
	}
}