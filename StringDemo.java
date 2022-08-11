public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Karunya";
		System.out.println("s1:"+s1);
		String s2 = new String(); // empty 
		System.out.println("s2:"+s2);
		String s3 = new String("University");
		System.out.println("s3:"+s3);
		char carray [] = {'c','s','e'};
		String s4 = new String(carray);
		System.out.println("s4:"+s4);
		byte barray [] = {(byte)'c',(byte)'s',(byte)'e'};
		System.out.println("barray[2]:"+barray[2]);
		String s5 = new String(barray);
		System.out.println("s5:"+s5);
		System.out.println("s5 length:"+s5.length());
		String s6 = s1 + " " + s3 + " " + s5; 
		System.out.println("s6:"+s6);
		s6 = "hello";
		System.out.println("s6:"+s6);
	}
}
