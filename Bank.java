
import java.util.Scanner;

public class Bank {

	
	public static void main(String[] args)
	{
		Bankaccount obj1 = new Bankaccount ("XYZ", "000001");
		obj1.Menu();
	}
	
	// we need classes for each oppertation withdraw deposit etc
	

}

class Bankaccount
{
	int balence;
	int previous;
	String customername;
	String customerid;
	private Scanner scanner;
	
	Bankaccount(String cname, String cid)
	{
		customername = cname;
		customerid = cid;
	}
	
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balence = balence + amount;
			previous = -amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balence = balence - amount;
			previous = -amount;
		}
	}
	
	void getprevious()
	{
		if(previous > 0)
		{
			System.out.println("Deposited:" + previous);
		}
		if(previous < 0 )
		{
			System.out.println("Withdrew:" + Math.abs(previous));
		}
		else 
		{
			System.out.println("Nothing happend");
		}
	}
	
	void Menu()
	{
		int  option = 0;
		scanner = new Scanner(System.in);
		
		System.out.println("Welcome"  +customername);
		System.out.println("Your id is " +customerid);
		System.out.println("\n");
		System.out.println("1. Check Balence");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Previous Transaction");
		System.out.println("5. Exit");
	
	
	do
	{
		System.out.println("-------------------------------------------");
		System.out.println("Select an option");
		option = scanner.nextInt();
		System.out.println("-------------------------------------------");
		
		switch(option)
		{
		case 1:
			System.out.println("-------------------------------------------");
			System.out.println("Balence = " +balence);
			System.out.println("-------------------------------------------");
			System.out.println("\n");
			break;
			
		case 2:
			System.out.println("-------------------------------------------");
			System.out.println("Enter amount to deposit");
			System.out.println("-------------------------------------------");
			int amount = scanner.nextInt();
			deposit(amount);
			System.out.println("\n");
			break;
			
		case 3:
			System.out.println("-------------------------------------------");
			System.out.println("Enter amount to withdraw");
			System.out.println("-------------------------------------------");
			int amount2 = scanner.nextInt();
			withdraw(amount2);
			System.out.println("\n");
			break;
			
		case 4:
			System.out.println("-------------------------------------------");
			getprevious();
			System.out.println("-------------------------------------------");
			System.out.println("\n");
			break;
			
		case 5:
			System.out.println("-------------------------------------------");
			break;
			
		default:
			System.out.println("Invalid option!");
			break;
			
			}		
		}while(option != 5);
		System.out.println("Thank you have a good day");
	}
}
