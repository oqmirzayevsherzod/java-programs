import java.util.Scanner;

public class Shopping_cart_program {
    public static void main(String[] args){

        // Shopping cart game
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String favoriteFood = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        Double price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        byte number = scanner.nextByte();

        System.out.println("you have bought " + number+" "+favoriteFood);
        System.out.println("The total price is " + number*price);
        scanner.close();
    }
}
