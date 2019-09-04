import java.util.Scanner;

public class MatrixSum
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int[][] matOne = new int[3][3];
		int[][] matTwo = new int[3][3];
		int[][] matTwoTran = new int[3][3];
		int[][] matSum = new int[3][3];
		
		System.out.println("You will now create two different matrix grids with 9 numbers each.");
		
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 3; col++)
			{
				System.out.println("Please enter a number to add to the first grid");
				matOne[row][col] = keyboard.nextInt();
			}
		}
		
		System.out.println("This is the grid you created.");
		
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 3; col++)
			{
				System.out.print(matOne[row][col] + " ");
			}
			System.out.println();
		}
		
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 3; col++)
			{
				System.out.println("Please enter a number to add to the Second grid");
				matTwo[row][col] = keyboard.nextInt();
			}
		}
		
		System.out.println("This is the grid you created.");
		
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 3; col++)
			{
				System.out.print(matTwo[row][col] + " ");
			}
			System.out.println();
		}
		
		for(int rowT = 0, col = 0; rowT < 3; rowT++, col++)
		{
			for(int colT = 0, row = 0; colT < 3; colT++, row++)
			{
				matTwoTran[rowT][colT] = matTwo[row][col];
			}
		}
		
		System.out.println("This is the secong grid you created, but transposed");
		
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 3; col++)
			{
				System.out.print(matTwoTran[row][col] + " ");
			}
			System.out.println();
		}
		
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 3; col++)
			{
				matSum[row][col] = (matOne[row][col] + matTwoTran[row][col]);
			}
		}
		
		System.out.println("This is the result of adding the fist grid and the transposed second grid together.");
		
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 3; col++)
			{
				System.out.print(matSum[row][col] + " ");
			}
			System.out.println();
		}
	}
}

