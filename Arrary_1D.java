
import java.util.Scanner;
public class Arrary_1D {
	public static void main(String[] args) {
		//int a =1, b=2, c =3;
		// create and initialize an array
		int [] num = {10, 40, 20, 70, 30, 60};
		System.out.println(num); 
		System.out.println(num.length); 
		System.out.println(num[0]); 
		//System.out.println(num[6]);  // raise index out of bound exception
		System.out.println(num[5]);
		//looping to access elements
		System.out.println("access the elements using loop");
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		// searching for an element
		for (int i=0; i<num.length; i++) {
			if (num[i] == 30) {
				System.out.println("ok not bad");
				break;
				//System.out.println("next to break");
			}
		}
		// arrange the array in ascending order 
		System.out.println("Sorting the array elements:");
		for (int i=0; i<num.length; i++) {
			for (int j= i+1; j<num.length; j++) {
				if (num[i] < num[j]) {
					int t = num[i];
					num[i] = num[j];
					num[j] = t; 
				}				
			}
		}
		// print the sorted array
		System.out.println("Sorted array:");
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		//create 1D array using new 
		int x [] = new int[5]; // defining an array
		Scanner sc = new Scanner(System.in);
		for (int i =0; i<x.length; i++) {
			System.out.println("Enter the value of x[" + i + "]:");
			x[i] = sc.nextInt();
		}
	}
}
