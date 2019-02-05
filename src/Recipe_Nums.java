import java.util.InputMismatchException;
import java.util.Scanner;
/*
Для произвольной цифры от 0 до 9 вывести на консоль ее значение прописью.
Например, для цифры 9 на консоли должна быть напечатана строка «Девять».
 */
public class Recipe_Nums {
    public static void main(String[] Andryushka) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Введите число от 0 до 9: ");
            int input_Num = input.nextInt();
            //гдето я читал что сканер нужно закрывать после того как вы перестали его использовать
            input.close();
            System.out.print("\nВы ввели число: ");
            //выводит буквенное выражение введенного числа
            switch (input_Num) {
                case 0:
                    System.out.print("Ноль");
                    break;
                case 1:
                    System.out.print("Адын");
                    break;
                case 2:
                    System.out.print("Два");
                    break;
                case 3:
                    System.out.print("Тры");
                    break;
                case 4:
                    System.out.print("Чатыре");
                    break;
                case 5:
                    System.out.print("Пять");
                    break;
                case 6:
                    System.out.print("Шесть");
                    break;
                case 7:
                    System.out.print("Семь");
                    break;
                case 8:
                    System.out.print("Восемь");
                    break;
                case 9:
                    System.out.print("Девять");
                    break;
                default:
                    System.out.print("Error14881337228\nЗапустите программу заново и введжите число от 0 до 9");
            }
        }catch (InputMismatchException e){//срабатывает когда в поле ввода вводится неправильное значение
            System.out.println("Введено неправильное значение. Для ввода годятся только целые числа");
        }
    }
}
