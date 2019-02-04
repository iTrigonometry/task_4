import java.util.InputMismatchException;
import java.util.Scanner;

public class divide_3_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
try {
    //просим ввести количество чисел
    System.out.print("Введите количество чисел: ");
    int n = input.nextInt();
    int[] arr = new int[n];
    //заполняем массив
    for (int i = 0; i < n; i++) {
        System.out.print("\nВведите число: ");
        arr[i] = input.nextInt();
    }
    //эти флаги нам помогут определить есть ли хоть одно число которое делится на 3 или 9
    boolean div9 = false;
    boolean div3 = false;

    //выводим числа которые делятся на 3
    System.out.print("Числа которые делятся на 3: ");
    for (int i = 0; i < n; i++) {
        if (arr[i] % 3 == 0) {
            System.out.print(arr[i] + " ");
            div3 = true;
        }
    }
    if (!div3)// если число было найдено, то сообщение не выведится ! - операция отрицания !true == false
        System.out.print("Таких чисел нет");


    //делаем то же самое и для 9
    System.out.print("\nЧисла которые делятся на 9: ");
    for (int i = 0; i < n; i++) {
        if (arr[i] % 9 == 0) {
            System.out.print(arr[i] + " ");
            div9 = true;
        }
    }
    if (!div9)
        System.out.print("Таких чисел нет");
}catch (InputMismatchException e){//обрабатываем исключение если было введено не число
    System.out.print("\nВводить можно только целые числа.");
}
    }

}
