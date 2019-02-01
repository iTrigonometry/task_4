import java.util.Scanner;

public class Recipe_Nums {
    public static void main(String[] Andryushka){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число от 0 до 9: ");
        int input_Num = input.nextInt();
        //выводиь блять
            switch (input_Num){
                case 0: System.out.print("Ноль");break;
                case 1: System.out.print("Адын");break;
                case 2: System.out.print("Два");break;
                case 3: System.out.print("Тры");break;
                case 4: System.out.print("Чатыре");break;
                case 5: System.out.print("Пять");break;
                case 6: System.out.print("Шесть");break;
                case 7: System.out.print("Семь");break;
                case 8: System.out.print("Восемь");break;
                case 9: System.out.print("Девять");break;
                default:System.out.print("Ты конченый чтоли блять я просил от 0 до 9 сука ебливая");
            }
    }
}
