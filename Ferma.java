import java.util.Scanner;

public class Ferma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите степень: ");
        int n = input.nextInt();

        if (n>1){

            double result, c;
            int a,b;
            boolean triger = true;
            System.out.println("Целочисленные решения теоремы ферма от 1 до 100:");
            for (int i = 1; i<101; i++){
                for (int j = 1; j < 101; j++) {
                    a = i;
                    b = j;

                    c = Math.pow(a, n) + Math.pow(b, n);
                    result = Math.pow(c, 1.0 / n);
                    if (result == (int) result) {
                        System.out.println("a " + a + " b " + b + " result " + result);
                        triger = false;
                    }
                }
            }
            if (triger) System.out.print("Решений не найдено.");
        }else{
            System.out.print("\nСтепень должна быть от 2 и выше.");
        }

    }


}
