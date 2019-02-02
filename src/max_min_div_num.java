import java.util.Scanner;

public class max_min_div_num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

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

        System.out.print("\nНОД: " + nod);
        int nok = 1;
        int max = arr[0] * arr[1] / nod;
        if (nod > 1){
            for (int i = 1; i < n; i++){
                if (i < n-1) {
                    nok = arr[i] * arr[i + 1] / nod;
                    if (nok > max)
                        max = nok;
                }
            }
            nok = max;
        }else{
            nok = arr[0] * arr[1] / nod(arr[1], arr[2]);
            for (int i = 2; i < n; i++){
                    nok = nok * arr[i] / nod(nok, arr[i]);
            }
        }
        System.out.print("НОК: " + nok);
    }

    static int nod(int a, int b){
        if(b==0)return a;
        else return nod(b, a%b);
    }
}
