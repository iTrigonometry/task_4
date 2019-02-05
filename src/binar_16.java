import java.util.Scanner;

public class binar_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //просим ввести количество чисел
        System.out.print("Введите количество чисел которые хотите ввести:");
        int n = input.nextInt();
        //заполняем массив
        int[] nums_inputed = new int[n];
        for (int i = 0; i<n; i++){
            System.out.print("\nВведите число:");
            nums_inputed[i] = input.nextInt();
        }

        //начинаем перебирать все числа
        String result;
        for (int num:nums_inputed){
            System.out.print("Число " + num + "в 2-ичной системе: ");
            result = Integer.toString(num, 2);//на место второго аргумента ставим нужную систему счисления
            System.out.println(result);

            System.out.print("Число " + num + "в 16-ичной системе: ");
            result =  Integer.toString(num, 16);
            System.out.println(result);
        }
    }
}
