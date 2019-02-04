import java.util.InputMismatchException;
import java.util.Scanner;

public class divide_5_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Введите количество чисел: ");
            int n = input.nextInt();
            int[] arr = new int[n];



            for (int i = 0; i < n; i++) {
                System.out.print("\nВведите число: ");
                arr[i] = input.nextInt();
            }

            boolean div5 = false;
            boolean div10 = false;

            System.out.print("Числа которые делятся на 5: ");
            for (int i = 0; i < n; i++) {
                if (arr[i] % 5 == 0) {
                    System.out.print(arr[i] + " ");
                    div5 = true;
                }
            }
            if (!div5)
                System.out.print("Таких чисел нет");

            System.out.print("\n");
            System.out.print("Числа которые делятся на 10: ");

            for (int i = 0; i < n; i++) {
                if (arr[i] % 10 == 0) {
                    System.out.print(arr[i] + " ");
                    div10 = true;
                }
            }
            if (!div10)
                System.out.print("Таких чисел нет");
        }catch (InputMismatchException e){
            System.out.print("\nВводить можно только целые числа.");
        }
    }
}
