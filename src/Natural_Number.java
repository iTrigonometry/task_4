import java.util.Scanner;
/*
Ввести с консоли n целых чисел и поместить их в массив.
На консоль вывести простые числа.
 */
public class Natural_Number {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //просим ввести количесво чисел
        System.out.print("Введите количество чисел: ");
        int n = input.nextInt();
        //заполняем массив
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nВведите число: ");
            arr[i] = input.nextInt();
        }
        //выводим простые числа
        System.out.print("Эти числа являются простыми: ");
        Simple_Num a =  new Simple_Num();
        for (int i = 0; i<n;i++){
            a.check_Number(arr[i]);
        }
    }
}
class Simple_Num{ //простые числа это те числа которые делятся на 1 и сами на себя, а еще они больше 1
    int var = 2;
    public void check_Number(int num){
        if(num > 1){// простые числа обязательно больше единицы
            //делаем это пока остаток от деления не будет равен 0
            if(num % var != 0){
                var++;
                check_Number(num);
            }else if (num % var == 0){
                print_Result(num, var);
                var = 2;
            }
        }
    }

    public void print_Result(int n, int var){
        if (n == var){//если число равно делителю, то оно простое и мы его просто выводим
            System.out.print(n + " ");
        }
    }
}