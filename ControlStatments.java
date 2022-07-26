import java.util.Scanner;
public class ControlStatments {
	public static void main(String[] args) {
		System.out.println("Give a number b/w 1 to 10:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x >= 3 & x <= 5) {
			System.out.println("Good");
		}
		else if (x >=6 & x <= 8) {
			System.out.println("ok");
		}
		else {
			System.out.println("Not good");
		}
	}

}
