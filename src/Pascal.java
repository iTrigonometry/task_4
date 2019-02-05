import java.util.Scanner;

public class Pascal {
    public static void main(String[] args){
        int overflow, firstNum = 0;
        Scanner input = new Scanner(System.in);
        //вводим кколичество чисел
        System.out.print("Введите количество чисел которое вы хотите ввести:");
        overflow = input.nextInt();
        //заполняем массив
        int[] nums = new int[overflow];
        for(int i = 0; i<overflow;i++){
            System.out.print("\nВведите число: ");
            nums[i]= input.nextInt();
        }
        //нахоодим первое положительное число
        for (int i:nums){
            if (i > 0){
                firstNum = i;
                break;
            }else{
                throw new RuntimeException("Отсутствует положительное число");
            }
        }

        //рисуем треугольник
        PascalTriangle pas = new PascalTriangle(overflow, firstNum);
        pas.show();
    }
}
 class PascalTriangle {
    private int ubound;
    private long C[][];

    //инициализация треугольника
    public PascalTriangle(int ubound, int firstNum){

        if(ubound > 40){
            throw new RuntimeException("Data overflow");
        }

        this.ubound = ubound;
        C = new long[ubound+1][ubound+1];

        for (int n = 0; n <= ubound; n++) {
            //первый и последний элемент в строке равен 1
            C[n][0] = C[n][n] = firstNum;
            //далее вычисляем внутреннюю часть
            for (int k = 1; k < n; k++) {
                C[n][k] = C[n-1][k-1] + C[n-1][k];
            }
        }
    }

    //вывод треугольника в консоль
    public void show(){
        for (int n = 0; n <= ubound; n++) {
            for (int k = 0; k <= n; k++) {
                System.out.print(C[n][k] + "     ");
            }
            System.out.println();
        }
    }

    //метод, возвращающий кол-во сочетаний из n по k
    public long get(int n,int k){
        return C[n][k];
    }
}
