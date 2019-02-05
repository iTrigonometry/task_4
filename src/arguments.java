import java.util.Scanner;

public class arguments {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //вводим числа
        System.out.print("Введите первое число:");
        String first_Number = input.nextLine();
        System.out.print("Введите второе число:");
        String second_Number = input.nextLine();
        //парсим
        int int_First_Number = Integer.parseInt(first_Number);
        int int_Second_Number = Integer.parseInt(second_Number);
        //вывводим результат
        System.out.print("Сумма этих чисел равна: " + (int_First_Number + int_Second_Number));
        System.out.print("\nПроизведение этих чисел равно: " + (int_First_Number * int_Second_Number));

    }
}
