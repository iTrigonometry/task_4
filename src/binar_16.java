import java.util.Scanner;

public class binar_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество чисел которые хотите ввести:");
        int n = input.nextInt();


        int[] nums_inputed = new int[n];
        for (int i = 0; i<n; i++){
            System.out.print("\nВведите число:");
            nums_inputed[i] = input.nextInt();
        }

        String result;
        for (int num:nums_inputed){
            System.out.print("Число " + num + "в 2-ичной системе:");
            result = Integer.toString(num, 2);
            System.out.println(result);

            System.out.print("Число " + num + "в 2-ичной системе:");
            result =  Integer.toString(num, 16);
            System.out.println(result);
        }
    }
}
