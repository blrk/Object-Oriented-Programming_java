public class Operators {
	public static void main(String[] args) {
		int x = 5, y = 3;
		/*x++;
		++x;
		System.out.println("x:" + x);
		System.out.println("x:" + (x++));
		System.out.println("x:" + x);*/
		System.out.println("x:" + (++x));
		System.out.println("x:" + x);
		int a = 10, b = 10;
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
		
		int z = 10;
		System.out.println(z++);
		System.out.println(++z);
		System.out.println(z--);
		System.out.println(--z);
	}
}
