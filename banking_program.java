import java.util.Scanner;

public class banking_program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){


        int choice;
        boolean isRunning = true;
        double balance = 0;

        while(isRunning){
            for(int i = 0; i <= 15; i++){
                System.out.print("*");
            }
            System.out.println("\nBANKING PROGRAM");
            for(int i = 0; i <= 15; i++){
                System.out.print("*");
            }
            System.out.println("\n1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            for(int i = 0; i <= 15; i++){
                System.out.print("*");
            }

            System.out.print("\nEnter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit();
                    break;
                case 3:
                    balance -= withdraw(balance);
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("*********************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("*********************");

        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        double amount;
        System.out.println("Enter an amount to be deposited");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }

    }
    static double withdraw(double balance){

        double amount;
        System.out.println("Enter an amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}
