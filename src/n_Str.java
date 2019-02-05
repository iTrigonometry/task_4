import java.util.Random;
import java.util.Scanner;
/*
Написать приложение, выводящее n строк с переходом и без перехода на новую строку.
 */
public class n_Str {
    public static void main(String[] args){
        System.out.print("Введите пожалуйста число работы цикла сос стороками: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println();
        //просто рандомновыводим строки
        Random rand = new Random();
        for(int i = 0; i<n; i++){
            int rnum = rand.nextInt(80) - 30;
            if (rnum % 2 == 0)System.out.print("Строкабезпереноса");
            else System.out.println("Строка с переносом");
        }
    }
}
