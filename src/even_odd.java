import java.util.InputMismatchException;
import java.util.Scanner;


public class even_odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
try {
    //просим ввести числа
    System.out.print("Введите количество чисел:");
    int n = input.nextInt();
    int[] arr = new int[n];
    //заполняем массив
    for (int i = 0; i < n; i++) {
        System.out.print("\nВведите число:");
        arr[i] = input.nextInt();
    }
    //вывод четных чисел
    System.out.print("Четные числа:");
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0)
            System.out.print(arr[i] + " ");
    }

    //вывод нечетных чисел
    System.out.print("\nНечетные числа:");
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 != 0)
            System.out.print(arr[i] + " ");
    }
}catch (InputMismatchException e){//если введено не число то нужно об этом расказать
    System.out.print("\nТы ввел неверное значение, нужно вводить целые числа, Собака ты сутулая.");

}
    }
}
