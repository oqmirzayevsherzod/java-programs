import java.util.Scanner;

public class weight_converter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        int option;
        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        if(option == 1){
            double lbs_weight;
            System.out.print("Enter the weight in lbs: ");
            lbs_weight = scanner.nextDouble();
            double newWeight = lbs_weight * 0.453592;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        else if(option == 2){
            double kgs_weight;
            System.out.print("Enter the weight in kgs: ");
            kgs_weight = scanner.nextDouble();
            double New_Weight = kgs_weight * 2.20462;
            System.out.printf("The new weight in kgs: %.2f", New_Weight);
        }
        else{
            System.out.println("That wasn't a valid choice");
        }
        scanner.close();
    }
}
