import java.util.Scanner;

 class Account 
{
	private String name="Rutuja";
	private long acctNumber=12345;
	private int pswd=1111;
	private double balance=10000;
	public String getName()
	{
		return name;
	}
	public long getAcctNumber()
	{
		return acctNumber;
	}
	public int getPswd()
	{
		return pswd;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setName(String s1)
	{
		name=s1;
	}
	public void setAcctNumber(long s1)
	{
		acctNumber=s1;
	}
	public void setPswd(int s1)
	{
		pswd=s1;
	}
	public void setBalance(double s1)
	{
		balance=s1;
	}

}

class Atm
 {
    static Account a=new Account();
	static Scanner sc=new Scanner(System.in);
	public void withdraw()
	{
      System.out.println("enter acctno");
	  long acctno=sc.nextLong();
	  if(a.getAcctNumber()==acctno)
	  {
        System.out.println("enter pswd");
		int pswd=sc.nextInt();
		if(a.getPswd()==pswd)
		{
			System.out.println("enter money");
			double mon=sc.nextDouble();
			if(a.getBalance()>=mon)
			{
               double dc=a.getBalance()-mon;
			   a.setBalance(dc);
			}
			else
			{
				System.out.println("insufficient money");
			}
		}
		else
		{
			System.out.println("invalid pswd");
		}
	  }
	  else
	  {
		  System.out.println("account number is invalid");
	  }
	}
	public void deposit()
	{
		System.out.print("Enter money to be deposited : ");
		double cash=sc.nextDouble();
		double amount=a.getBalance()+cash;
        a.setBalance(amount);
		System.out.println("Your Money has been successfully deposited");

	}
	public void checkBalance()
	{
     System.out.println("Balance : "+a.getBalance());
	}
	public static void main(String[]args)
	{
		Atm a1=new Atm();
		for(;;)
		{
			System.out.println("Welcome to the ATM Machine");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.print("Choose the operation : ");
			System.out.println("");
           switch(sc.nextInt())
		   {
			   case 1:
				   a1.withdraw();
			   break;
			   case 2:
                  a1.deposit();
			   break;
			   case 3:
				   a1.checkBalance();
			   break;
			   case 4:
				   System.exit(1);
		   }
		}
	}
 }