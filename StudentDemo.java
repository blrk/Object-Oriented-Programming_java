class Student{
	int regNo, mark;
	Student(){ //constructor without parameters | empty
		regNo = 12;
		mark = 40;
	}
	Student(int rno, int m){ //parameterised constructor
		regNo = rno;
		mark = m;
	}
	void print() {
		System.out.println("marks:"+mark);
		System.out.println("Reg No:"+regNo);
	}
	void result() {
		if (mark >= 50) {
			System.out.println("Result: pass");
		}
		else {
			System.out.println("Result: Fail");
		}
	}
}
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.print();
		s1.result();
		Student s2 = new Student(13, 89);
		s2.print();
		s2.result();
	}
}
