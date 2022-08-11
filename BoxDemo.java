class Box{
	double height, width, depth;
	void print() {
		System.out.println("height:"+ height);
		System.out.println("width:" + width);
		System.out.println("depth:" + depth);
	}
}
public class BoxDemo {
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.height = 23.4;
		b1.width = 24.6;
		b1.depth = 23.7;
		b1.print();
		//System.out.println("depth:" + depth);
	}
}
