import java.util.ArrayList;
import java.util.Scanner;

public class Fibonachi {
    static public void main(String[] args){
        ArrayList<Long> nums = new ArrayList<Long>();
        //используем для чисел фибоначи arraylist так как ему не обязательно указывать размер
        long numFibonaachi0 = 1;
        long numFibonaachi1 = 1;
        nums.add(0, numFibonaachi0);
        nums.add(1, numFibonaachi1);

        //вводим количество чисел
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количесво чисел которые вы хотите ввести: ");
        int n = input.nextInt();

        // заполняем массив
        int[] input_Nums = new int[n];
        for (int i = 0; i<n; i++){
            System.out.print("\nВведите число: ");
            input_Nums[i] = input.nextInt();
        }
        //забиваем лист числами фибоначи
        long add_num;
        for(int i = 2; i<50;i++){
            add_num = nums.get(i-2) + nums.get(i-1);
            nums.add(i, add_num);
        }
        //ищем эти числа среди наших
        System.out.print("\nСреди ваших чисел были найдены вот такие из последовательности Фибоначи:");
        for (int num:input_Nums){
            for (long numl:nums){
                if (num <= numl && num == numl)//переписать
                    System.out.print(" " + num);
            }
        }

    }
}
