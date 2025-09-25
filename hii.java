package practice;

import java.util.Scanner;

public class hii {
     public static Scanner sc = new Scanner(System.in);
     
     public static void main(String[] args) {
          BankAccount acc1 = new BankAccount("001", "Josie Rizal", "Savings", 5000);
          BankAccount acc2 = new BankAccount("002", "John Dela Cruz", "Checking", 50000);
          BankAccount acc3 = new BankAccount("003", "Gabriella Silang", "Current", 1000000);
          BankAccount holder = null;
          
          boolean isLoggedIn = false;
          while(!isLoggedIn){
               System.out.print("""
                              Welcome to ABC Bank ATM!
                              Please enter your Account Number: """);
               
             String accNumber = sc.nextLine();
             BankAccount[] account = {acc1, acc2, acc3};
             

             for(BankAccount acc : account){
                  if(accNumber.equals(acc.getAccountNumber())){
                       isLoggedIn = true;
                       holder = acc;
                  }
             }
             
             if(!isLoggedIn){
                  System.out.println("[Error] Account not found.");
             }
          }
          
          
          while(isLoggedIn){
               System.out.printf("""
               		
                            Welcome, %s
                            ===============================
                            [1] Deposit
                            [2] Withdraw
                            [3] Check Balance
                            [4] Close Account
                            [5] Exit
                            
                            Enter a task: """,holder.getAccountHolder());
               int task = sc.nextInt();
               double amount;
               switch(task) {
                	case(1):
                		System.out.print("Enter the amout you want to deposit: ");
                		amount = sc.nextDouble();
                		holder.deposit(amount);
                		break;
                	case(2):
                		System.out.print("Enter the amout you want to deposit: ");
            			amount = sc.nextDouble();
            			holder.withdraw(amount);
                		break;
                	case(3):
                		holder.checkBalance();
                		break;
                	case(4):
                		holder.closeAccount();
                		break;
                	case(5):
                		System.out.println("Thank you have a nice day");
                	    isLoggedIn = false;
                		break;
                	default:
                		break;
                	
               }
            	   
          }
    }
     
     static class BankAccount{
          private String accountNumber, accountHolder, accountType;
          private double accountBalance;

          public BankAccount(String accNum, String accHolder, String accType, double accBal){
               this.accountNumber = accNum;
               this.accountHolder = accHolder;
               this.accountType = accType;
               this.accountBalance = accBal;
          }
          public double deposit(double amount){
        	  System.out.println("Deposited: $"+amount);
               accountBalance += amount;
               System.out.println("New balance is: $"+accountBalance);
               return accountBalance;
          }
          public double withdraw(double amount) {
        	  System.out.println("Withdrawed: $"+amount);
        	  accountBalance -= amount;
        	  System.out.println("New balance is: $"+accountBalance);
        	  return accountBalance;
          }
          public void checkBalance() {
        	  System.out.println("Your current balance is: $"+accountBalance);
          }
          public void closeAccount() {
        	  
          }

          public String getAccountHolder(){
               return accountHolder;
          }

          public String getAccountNumber(){
               return accountNumber;
          }
          
          public String getAccountType(){
               return accountType;
          }
     }
}