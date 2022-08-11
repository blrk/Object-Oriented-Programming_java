public class DemoClass {
	String name = "rk";
	void greet() {
		System.out.println("Hey welcome, I am greet");
	}
	public static void main(String[] args) {
		DemoClass obj1 = new DemoClass();
		obj1.greet();
		System.out.println(obj1.name);
	}

}
