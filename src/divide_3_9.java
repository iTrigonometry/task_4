import java.util.InputMismatchException;
import java.util.Scanner;

public class divide_3_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
try {
    System.out.print("Введите количество чисел: ");

    int n = input.nextInt();

    System.out.print("\n");

    int[] arr = new int[n];


    int num_Input;
    for (int i = 0; i < n; i++) {
        System.out.print("Введите число: ");
        num_Input = input.nextInt();
        arr[i] = num_Input;
        System.out.print("\n");
    }

    System.out.print("Числа которые делятся на 3: ");

    boolean div3 = false;
    boolean div9 = false;

    for (int i = 0; i < n; i++) {
        if (arr[i] % 3 == 0) {
            System.out.print(arr[i] + " ");
            div3 = true;
        }
    }
    if (!div3)
        System.out.print("Таких чисел нет");

    System.out.print("\n");
    System.out.print("Числа которые делятся на 9: ");

    for (int i = 0; i < n; i++) {
        if (arr[i] % 9 == 0) {
            System.out.print(arr[i] + " ");
            div9 = true;
        }
    }
    if (!div9)
        System.out.print("Таких чисел нет");
}catch (InputMismatchException e){
    System.out.print("\nВводить можно только целые числа.");
}
    }

}
