package pojedyncze;
public class Macierze_MultiDimensionalArrays {

	public static void main(String[] args) {
		
		int[] values = {1, 13, 345};//wektor/ci�g (array) int�w - jednowymiarowy
		System.out.println(values[2]);
		
		int grid[][] = {//macierz (wektor wektor�w) - ka�dy wers mo�e miec inn� liczb� element�w
			{1, 13, 345},
			{2, 6},
			{1, 5, 77, 88}	
		};
		
		System.out.println(grid[0][2]);//wy�wietli 345
		
		String[][] texts= new String[2][3];//stworzyli�my jedynie referencje do macierzy String�w
		System.out.println(texts[1][2]);//wyjdzie null
		texts[1][2] = "Hello";
		System.out.println(texts[1][2]);//terraz wy�wietli Hello
		
		//iteruje po wszystkich elementach macierzy i je wy�wietla oddzielaj�c elementy jednego wiersza tabem i enterem kolumny
		for (int row = 0; row < grid.length; row++){
			for (int col = 0; col < grid[row].length; col++){
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
		
		String[][] words = new String[2][];
		words[0][0] = "lol";//wywali b��d - nie zdefiniowali�my wymiaru dla kolumn
		words[0] = new String[3];
		words[0][0] = "lol";
		System.out.println(words[0][0]);//poka�e prawid�owo lol
		
	}
}