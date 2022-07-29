import java.util.Scanner;
public class Looping {
	public static void main(String[] args) {
		//int i=0;
		/*
		for (i=1; i<3; i++) {
			System.out.println(i);
		
		for (int j=5; j>=1; j--) {
			System.out.println(j);
		}}
		//System.out.println(i);
		
		//Nested loop
		for (int r=1; r<4; r++) { //outer loop
			for (int c=1; c<4; c++) { // inner loop
				System.out.println("r:" + r +" c:"+ c);
			}
		}
		
		for (int r=1; r<4; r++) { //outer loop
			for (int c=1; c<4; c++) { // inner loop
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		int x = 0;
		while (x <= 5) {
			System.out.println(x);
			x++;
		}
		
		int num = 12345;
		int r = 0; 
		while (num != 0) {
			r = r * 10;
			r = r + num % 10;
			num = num / 10;
		}
		System.out.println(r);
		
		int x = 0;
		do {
			x++;
			System.out.println(x);
			//x++;
		}while(x <= 5); 
		
		//menu driven program
		int ch = 0; 
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 1 for Chicken");
			System.out.println("Enter 2 for Mutton");
			System.out.println("Enter 3 for Exit");
			System.out.println("Enter your Choice");
			ch = sc.nextInt();
		}while(ch != 3); 
		
		// break statment 
		for (int i=1; i<=10; i++) {	
			if (i == 5)
				break;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// continue statement
		for (int i=1; i<=10; i++) {	
			if (i == 5 | i == 8)
				continue;
			System.out.print(i + " ");
		}
		
		// label with continue
		outer: for (int r=0; r<3; r++) {
			for (int c=0; c<3; c++) {
				if (c > r)
					continue outer;
				System.out.println("r:" + r + " c:" + c);
			}				
		}*/
		// label with break
		outer: for (int r=0; r<3; r++) {
			for (int c=0; c<3; c++) {
				if (c > r)
					break outer;
				System.out.println("r:" + r + " c:" + c);
			}				
		}
	} // main
} // class 
