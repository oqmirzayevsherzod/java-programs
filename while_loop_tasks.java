import java.util.Scanner;

public class while_loop_tasks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*
        int i = 1;

        while(i <= 10){
            System.out.println(i);
            i++;
        }

        int sum = 0;      // yig‘indi uchun
        int number;       // foydalanuvchi kiritadigan son

        System.out.println("Son kiriting (0 kiritsangiz to‘xtaydi):");

        while (true) {
            number = scanner.nextInt();   // son olish

            if (number == 0) {
                break;   // agar 0 bo‘lsa — to‘xtaydi
            }

            sum = sum + number;  // sonni yig‘indiga qo‘shish
        }

        System.out.println("Yig‘indi = " + sum);

         */

        int i = 1;
        while(i <= 5){
            int j = 1;
            while(j <= i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
