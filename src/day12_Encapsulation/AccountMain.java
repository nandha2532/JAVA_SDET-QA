package day12_Encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account();
		a.setAccNo(101);
		System.out.println(a.getAccNo());
		
		a.setName("Jhon");
		System.out.println(a.getName());
		
		a.setAmount(1500);
		System.out.println(a.getAmount());
	}

}
