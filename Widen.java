
public class Widen {
	public static void main(String[] args) {
		int x = 20;
		float y = x;
		System.out.println(x);
		System.out.println(y);
		
		double v = 23.456;
		int g;
		// g = v; --> this produces error
		g = (int) v; // type casting 
		System.out.println(g);
		
		// float d = 12.3; this leads to an error
		float d = 12.3f;
		System.out.println(d);
	}

}
