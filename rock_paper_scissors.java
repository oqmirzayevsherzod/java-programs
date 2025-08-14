import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors {
    public static void main(String[] args){

        // rock paper scissors game 🗿

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};
        int randomIndex = random.nextInt(3);
        String comChoice = options[randomIndex];

        String userChoice;
        String playAgain;

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            userChoice = scanner.nextLine().toLowerCase();

            System.out.println("Computer choice: " + comChoice);


            if (userChoice.equals(comChoice)) {
                System.out.println("It's a tie!");
            } else if (
                    (userChoice.equals("rock") && comChoice.equals("scissors")) ||
                            (userChoice.equals("scissors") && comChoice.equals("paper")) ||
                            (userChoice.equals("paper") && comChoice.equals("rock"))
            ) {
                System.out.println("You win!");
            } else if (
                    (userChoice.equals("rock") && comChoice.equals("paper")) ||
                            (userChoice.equals("scissors") && comChoice.equals("rock")) ||
                            (userChoice.equals("paper") && comChoice.equals("scissors"))
            ) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Invalid input, please choose rock, paper, or scissors.");
            }

            System.out.println("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");



        scanner.close();
    }
}
