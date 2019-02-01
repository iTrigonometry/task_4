import java.util.ArrayList;
import java.util.Scanner;

public class Fibonachi {
    static public void main(String[] args){
        ArrayList<Long> nums = new ArrayList<Long>();

        long numFibonaachi0 = 1;
        long numFibonaachi1 = 1;
        nums.add(0, numFibonaachi0);
        nums.add(1, numFibonaachi1);

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количесво чисел которые вы хотите ввести: ");
        int n = input.nextInt();


        int[] input_Nums = new int[n];
        for (int i = 0; i<n; i++){
            System.out.print("\nВведите число: ");
            input_Nums[i] = input.nextInt();
        }

        long add_num;
        for(int i = 2; i<50;i++){
            add_num = nums.get(i-2) + nums.get(i-1);
            nums.add(i, add_num);
        }

        System.out.println();
        System.out.print("Среди ваших чисел были найдены вот такие из последовательности Фибоначи:");
        for (int num:input_Nums){
            for (long numl:nums){
                if (num <= numl && num == numl)
                    System.out.print(" " + num);
            }
        }

    }
}
