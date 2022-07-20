import java.util.Scanner;
public class TypePromotion {
	public static void main(String[] args) {
		byte a = 40, b = 50, c = 100;
		int d = a * b / c ; 
		//short d = a * b / c ; 
		System.out.println("d:" + d);
		System.out.println("a * b:" +  a * b);
		//byte e = 2000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		String s1 = sc.next();
		int x = Integer.parseInt(s1);
		System.out.println("x:" + x);
	}
}
