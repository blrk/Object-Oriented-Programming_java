
import java.util.Scanner;
public class BasicDetail {
	public static void main(String[] args) {
		String name; 
		int weight;
		float sal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give ur name:");
		name = sc.nextLine();
		System.out.println("Give ur weight:");
		weight = sc.nextInt();
		System.out.println("Give ur salary:");
		sal = sc.nextFloat();
		
		System.out.println("Name: " +name);
		System.out.println("Weight: " + weight);
		System.out.println("Salaray: " + sal);
		sc.close();
	}

}
