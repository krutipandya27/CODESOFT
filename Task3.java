import java.util.Scanner;
 class AtmMachine{
	

    UserBankAccount account;

    public AtmMachine(UserBankAccount account){
        this.account = account;
    }

    public void Withdraw(double amount){
        account.withdraw(amount);
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Total balance now: " + account.getBalance());
    }

    public void Deposite(double amount){
        account.deposit(amount);
        System.out.println("Amount deposited: " + amount);
        System.out.println("Total balance now: " +     account.getBalance());
    }

    public void CheckBalance(){
        System.out.println("Current balance: " + account.getBalance());
    }


}
 class UserBankAccount{

  
    double balance;

    public UserBankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
    	if(amount<0){
    		System.out.println("invalid... try agian!!");
    	}
        balance += amount;
    }

    public void withdraw(double amount){
    	if(amount <= 0){
    System.out.println("Invalid amount");
}
else if(amount > balance){
    System.out.println("Not sufficient balance!");
}
else {
    balance -= amount;
}

    }

}
public class Task3{
	public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
System.out.println("ENTER AMOUNT");
 int initialamount=sc.nextInt();
   UserBankAccount account = new UserBankAccount(initialamount);  
     AtmMachine atmMachine = new AtmMachine(account);
    
    
    while(true){

     System.out.println("enter 1 for withdraw..\n enter 2 for deposite... \n enter 3 to check balance....\n enter 4 to stop");
     int choice=sc.nextInt();
     int amount;
     
       

     if(choice==1){
     	System.out.println("enter how much amount you wants to withdraw!!");
     	amount=sc.nextInt();
     	atmMachine.Withdraw(amount);
     }
     else if(choice==2){
     	System.out.println("enter how much amount you wants to deposite!!");
     	amount=sc.nextInt();
        atmMachine.Deposite(amount);
     }
     else if(choice==3){
          	System.out.println("your balsnce is:");
          	atmMachine.CheckBalance();
     }
     else if(choice==4){
     	
     	return ;
     }
     else{
     	System.out.println("Invalid  choice!!");
     }
    }





	}
}