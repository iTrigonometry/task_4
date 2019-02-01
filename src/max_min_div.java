import java.util.Scanner;

public class max_min_div {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        //ввод чисел в массив
        System.out.print("Введите количество чисел, которое хотите ввести в массив: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        int input_Num;
        for(int i = 0; i<n;i++){
            System.out.print("Введите число: ");
            input_Num = input.nextInt();
            nums[i] = input_Num;
        }
        int nod = nums[0];

        for (int i = 1; i<n;i++){
            nod = nod(nod, nums[i]);
        }

        

    }
    static int nod(int a, int b) {
        if (b == 0) return a;
        else return nod(b, a % b);
    }


}
