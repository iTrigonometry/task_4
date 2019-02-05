import java.util.Scanner;
/*
Ввести с консоли n целых чисел и поместить их в массив.
На консоль вывести наибольший общий делитель и наименьшее общее кратное этих чисел
 */
public class max_min_div_num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //просим ввести количество чисел
        System.out.print("Введите количество чисел: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        //заполняем массив
        for (int i = 0; i < n; i++) {
            System.out.print("\nВведите число: ");
            arr[i] = input.nextInt();
        }
        //находим нод
        int nod = arr[0];
        for (int i = 1; i<n; i++){
            nod = nod(nod,arr[i]);
        }
        //Находим нок
        System.out.print("\nНОД: " + nod);
        int nok = 1;
        int max = arr[0] * arr[1] / nod;
        if (nod > 1){//если нод больше 1 то он для всех пар чисел одинаковые
            for (int i = 1; i < n; i++){
                if (i < n-1) {
                    nok = arr[i] * arr[i + 1] / nod;
                    if (nok > max)
                        max = nok;
                }
            }
            nok = max;
        }else{//если он равен 1 то мы вынуждены искать нод для каждой пары чисел
            nok = arr[0] * arr[1] / nod(arr[1], arr[2]);
            for (int i = 2; i < n; i++){
                    nok = nok * arr[i] / nod(nok, arr[i]);
            }
        }
        System.out.print("НОК: " + nok);
    }
    //автор этого гениального метода просто гений и решил остаться неизвестным
    static int nod(int a, int b){
        if(b==0)return a;
        else return nod(b, a%b);
    }
}
