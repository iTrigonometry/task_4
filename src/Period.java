import java.util.Scanner;

public class Period {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество чисел которые вы хотите ввести: ");
        int n = input.nextInt();
        int[] arrOfNums = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Введите число: ");
            arrOfNums[i] = input.nextInt();
        }

        int index = -1;
        for (int i = 0; i<n - 1; i++){
            if (arrOfNums[i] > 0 && arrOfNums[i+1] > 0){
                index = i;
                break;
            }
        }

        if (index != -1){

        }else{
            System.out.print("Дебил");
        }
    }
}
