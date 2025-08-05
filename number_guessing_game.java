import java.util.Scanner;
import java.util.Random;

public class number_guessing_game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100");
        int guess;
        int attemps = 0;
        int randomNumber = random.nextInt(1,100);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attemps++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attemps: " + attemps);
            }
        }while(guess !=  randomNumber);
    }
}
