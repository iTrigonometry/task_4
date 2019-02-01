import java.util.Scanner;

public class Polindroms {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество чисел которые вы хотите ввести: ");
        int n = input.nextInt();
        int[] arrOfNums = new int[n];

        for(int i = 0; i < n; i++){
            arrOfNums[i] = input.nextInt();
        }



        for (int i = 0; i<n; i++){
            StringBuffer temp = new StringBuffer(Integer.toString(arrOfNums[i]));
            String word = temp.toString();
            String wordreverse = temp.reverse().toString();
            if(word.equals(wordreverse)) {
                System.out.print(arrOfNums[i] + " ");
            }
        }
    }


}

