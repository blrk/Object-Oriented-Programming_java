import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		System.out.println("Give a number b/w 1 to 10:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x % 2 == 0) 
			System.out.println("Even number");
		else 
			System.out.println("Odd Number");
		sc.close();
	}

}
