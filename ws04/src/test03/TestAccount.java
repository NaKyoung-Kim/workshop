package test03;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("441-0290-1203", 500000, 7.3);
		System.out.println(a.getAccount()+"\t"+a.getBalance());
		a.withdraw(600000);
		a.deposit(20000);
		System.out.println(a.getAccount()+"\t"+a.getBalance());
		System.out.println(a.calculateInterest());
		
	}

}
