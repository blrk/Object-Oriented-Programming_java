class Account{
	int accNo;
	String accName;
	double accBal;
	Account(){
		accNo = 1001;
		accName = "John";
		accBal = 500.0;
	}
	Account(int accNo, String accName, double accBal){
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	void display() {
		System.out.println("AccNo:"+accNo);
		System.out.println("AccName:"+accName);
		System.out.println("AccBal:"+accBal);
	}
}
public class AccountDemo {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.display();
		Account a2 = new Account(1002, "Kevin", 5000.50);
		a2.display();
	}
}
