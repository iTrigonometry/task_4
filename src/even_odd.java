import java.util.InputMismatchException;
import java.util.Scanner;


public class even_odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
try {
    System.out.print("Введите количество чисел:");

    int n = input.nextInt();

    System.out.print("\n");

    int[] arr = new int[n];


    int num_Input;
    for (int i = 0; i < n; i++) {
        System.out.print("Введите число:");
        num_Input = input.nextInt();
        arr[i] = num_Input;
        System.out.print("\n");
    }

    System.out.print("Четные числа:");

    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0)
            System.out.print(arr[i] + " ");
    }

    System.out.print("\n");
    System.out.print("Нечетные числа:");

    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 != 0)
            System.out.print(arr[i] + " ");
    }
}catch (InputMismatchException e){
    System.out.print("\nТы ввел неверное значение, нужно вводить целые числа, Собака ты сутулая.");
}
    }
}
