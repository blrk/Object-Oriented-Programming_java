import java.util.Scanner;
public class Array2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x [] [] = {{1, 2}, {3,4}};
		for (int r=0; r<x.length; r++) { // access row
			for (int c=0; c<x[r].length; c++) {
				System.out.print(x[r][c] + " ");
			}
			System.out.println();
		}
		int y [] [] = new int [2][2];
		// read the elements from the user 
		for (int r=0; r<x.length; r++) { // access row
			for (int c=0; c<x[r].length; c++) {
				System.out.println("y["+r+"]["+c+"]:");
				y[r][c] = sc.nextInt();
			}
		}
		// print the array 
		for (int r=0; r<y.length; r++) { // access row
			for (int c=0; c<y[r].length; c++) {
				System.out.print(y[r][c] + " ");
			}
			System.out.println();
		}
		// create sum array 
		int sum [][] = new int[2][2];
		//adding x and y arrays
		for (int r=0; r<y.length; r++) { // access row
			for (int c=0; c<y[r].length; c++) {
				sum[r][c] = x[r][c] + y[r][c];
			}
			System.out.println();
		}
		// print sum array
		for (int r=0; r<sum.length; r++) { // access row
			for (int c=0; c<sum[r].length; c++) {
				System.out.print(sum[r][c] + " ");
			}
			System.out.println();
		}
	}

}
