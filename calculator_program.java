import java.util.Scanner;

public class calculator_program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        char operator;
        double secondNumber;

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextDouble();

        switch (operator) {
            case '+':
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber != 0)
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                else
                    System.out.println("0 ga bo'lib bo'lmaydi");
                break;
            case '^':
                double daraja = Math.pow(firstNumber , secondNumber);
                System.out.println(firstNumber + " ^ " + secondNumber + " = " + daraja);
                break;
            default:
                System.out.println("Noto'g'ri amal");

        }
        scanner.close();
    }
}
