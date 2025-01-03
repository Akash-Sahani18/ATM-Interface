  import java.util.Scanner;

    public class ATMmachine{ 

      float Balance=1000;
      int pin = 8980;
      public void checkpin(){
                Scanner sc = new Scanner(System.in);
                   System.out.print("Enter the PIN : ");
                   int enterPin = sc.nextInt();
                     if(enterPin==pin)
                        menu();
                        else{
                             System.out.println("Invalid PIN ");
                        } 
                 }
      public void menu(){
         System.out.println("1. Check Balance ");
         System.out.println("2. Withdrwal");
         System.out.println("3. Deposit ");
         System.out.println("4. EXIT ");
         Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();
              if(opt==1)
                 checkBalance();
                 else if(opt==2){
                    withdrawMoney();
                 }
                 else if(opt==3){
                     Deposit();
                 }
                 else if(opt==4){
                   System.out.println("Thank You for using our services!!");
                     return;
                 }
                 else{
                     System.out.println("Invalid Request");
                 }
                 menu();
         
   }
     public void withdrawMoney(){
      Scanner sc = new Scanner(System.in);
         System.out.print("Enter Amount To Withdraw: ");
         int withdrawAmt = sc.nextInt();
             if(withdrawAmt>Balance){
                  System.out.println("Insufficient Balance ");
             }
             else if(withdrawAmt<=Balance){
               Balance -= withdrawAmt; 
                  System.out.println("Collect Cash ");
             }
             else{
                 System.out.println("Enter a valid Amount ");
             }
             menu();

          }
          public void Deposit(){
              Scanner sc = new Scanner(System.in); 
                System.out.println("Enter the Amount");
                   int depoAmt= sc.nextInt();
                    Balance += depoAmt;
                    System.out.println("Money Deposited Succesfully");
                    menu();
              }
              public void checkBalance(){
                 System.out.println("Your Balance :" +Balance);
              }

   public static void main(String args[]){
          ATMmachine obj = new ATMmachine();
              obj.checkpin();
            }
       }