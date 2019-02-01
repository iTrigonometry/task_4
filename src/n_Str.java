import java.util.Random;
import java.util.Scanner;

public class n_Str {
    public static void main(String[] args){
        int n = new Scanner(System.in).nextInt();

        Random rand = new Random();
        for(int i = 0; i<n; i++){
            int rnum = rand.nextInt(80) - 30;
            if (rnum % 2 == 0)System.out.print("Строкабезпереноса");
            else System.out.println("Строка с переносом");
        }
    }
}
