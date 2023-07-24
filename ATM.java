import java.util.Scanner;

import java.lang.String;


class ATM{
    float Balance;
    int pin=1234;
    int transactions=0;
    String transactionHistory="";

    public void checkPin()
    {
        System.out.println("Enter Your ATM Pin");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        if(p==pin)
        {
            menu();
        }
        else{
            System.out.println("invalid!please enter a valid pin");
        }
       
    }

    public void menu()
    {
        System.out.println("*****WELCOME TO ABC ATM*****");
        System.out.println("1.To Withdraw");
        System.out.println("2.To Deposit");
        System.out.println("3.Transaction History");
        System.out.println("4.Transfer");
        System.out.println("5.Quit");
        System.out.println("Enter your choice");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        if(choice==1)
        {
            withdraw();
            
        }
        
        else if(choice==2){
            deposit();
          }
        else if(choice==3){
            history();
          }
        else if(choice==4){
            transfer();
          }
        else if(choice==5){
            quit();
        }
          
          else {
            System.out.println("Enter valid option");
          }   
    }
    public void balance(){
        System.out.println("Balance:"+Balance);
        menu();
    }
    public void withdraw(){
        System.out.println("Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance=Balance+amount;
            System.out.println("Cash withdrawl Successfully");
        }
      menu();
    }
    public void deposit(){
        System.out.println("Enter amount to Deposit");
        Scanner sc = new Scanner(System.in);
        float amount=sc.nextFloat();
         Balance=Balance+amount;
         System.out.println("Cash Deposited Successfully");
         menu();
  }
    public void transfer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Receipent name");
        String receipent= sc.nextLine();
        System.out.println("Enter amount to be transferred");
        float amount= sc.nextFloat();
        if(Balance>=amount) {
           if(amount<=100000f) {	
           transactions++;
        	   Balance-=amount;
        	   System.out.println("transferred to "+ receipent);
        	   
           }
           else {
        	   System.out.println("Insufficient funds");
           }
        }
        menu();
        
    }
    public void history() {
    	if(transactions==0) {
    		 System.out.println("No Transactions");
    	}
    	else {
    		System.out.println(""+transactions);
    	}menu();
    }
    public void quit() {
    	 System.out.println("Thank You");
    }

    
}

