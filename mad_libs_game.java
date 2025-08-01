import java.util.Scanner;

public class mad_libs_game {
    public static void main(String[] args){

        // Theme: MAD LIBS GAME
       Scanner scanner = new Scanner(System.in);

       String adjective1;
       String noun1;
       String noun2;
       String adjective2;
       String verb1;

       System.out.print("Enter a place: ");
       noun1 = scanner.nextLine();
       System.out.print("Enter an adjective that describes your friends: ");
       adjective1 = scanner.nextLine();
       System.out.print("Enter a verb: ");
       verb1 = scanner.nextLine();
       System.out.println("Enter a noun (place): ");
       noun2 = scanner.nextLine();
       System.out.print("Enter an adjetive that describes the restaurant: ");
       adjective2 = scanner.nextLine();

        System.out.println("\nYesterday, i went to the " + noun1);
        System.out.println("There I saw a bunch of my " + adjective1 + " friends");
        System.out.println("We together " + verb1+" to a "+noun2 + ".");
        System.out.println("There, we had a lot of fun. ");
        System.out.println("At the end of the day, we are all hungry. So we go to a " + adjective2 + " restaurant");

        //chatgpt bilan amaliyot

        System.out.print("Iltimos, ismingizni kiriting:>>>");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
        System.out.print("Iltimos, yoshingiz ni kiriting:>>>");
        System.out.print("Enter your age:>>>");
        String age = scanner.nextLine();
        System.out.println("you are " + age + " years old");
        System.out.print("Enter your region>>>");
        String region = scanner.nextLine();
        scanner.close();
    }
}
