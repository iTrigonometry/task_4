import java.util.Scanner;
public class Natural_Number {

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
        System.out.print("Эти числа являются простыми: ");
        Simple_Class a =  new Simple_Class();
        for (int i = 0; i<n;i++){
            a.check_Number(arr[i]);
        }
    }

}
class Simple_Class{
    int var = 2;
    public void check_Number(int num){
        if(num > 1){
            if(num % var != 0){
                var++;
                //System.out.print(var + " ");
                check_Number(num);
            }else if (num % var == 0){

                print_Result(num, var);
                var = 2;
            }
        }
    }

    public void print_Result(int n, int var){
        if (n == var){
            System.out.print(n + " ");
        }
    }
}