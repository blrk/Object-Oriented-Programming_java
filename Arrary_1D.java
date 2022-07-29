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
	}

}
