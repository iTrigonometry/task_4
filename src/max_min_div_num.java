import java.util.Scanner;

public class max_min_div_num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //123
        System.out.print("Введите количество чисел: ");

        int n = input.nextInt();

        System.out.print("\n");

        int[] arr = new int[n];


        int num_Input;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            num_Input = input.nextInt();
            arr[i] = num_Input;
            System.out.print("\n");
        }

        int nod = arr[0];
        for (int i = 1; i<n; i++){
            nod = nod(nod,arr[i]);
        }

        System.out.print("\n" + nod);
    }

    static int nod(int a, int b){
        if(b==0)return a;
        else return nod(b, a%b);
    }
}
