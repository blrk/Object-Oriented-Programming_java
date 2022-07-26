public class Looping {
	public static void main(String[] args) {
		int i=0;
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
		}*/
		for (int r=1; r<4; r++) { //outer loop
			for (int c=1; c<4; c++) { // inner loop
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	} // main
} // class 
