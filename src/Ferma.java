import java.util.Scanner;
/*
Создайте приложение, которое покажет,
что для выражения an+bn=cn (теорема Ферма) нет натуральных решений от 1 до 100 и n>2.
Убедитесь, что есть решения для n=2, и выведите их в консоль.
 */
public class Ferma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // вводим степень
        System.out.print("Введите степень: ");
        int n = input.nextInt();
        //услоие добавлено для того чтобы просто показать что при н больше 2 вы никогда не найдете решения
        //и иметь возможность проверить что будет при 1 или 2
        if (n>0){
            double result, c;
            int a,b;
            boolean triger = true;//для определения того что решение есть или нет
            System.out.println("Целочисленные решения теоремы ферма от 1 до 100:");
            for (int i = 1; i<101; i++){
                for (int j = 1; j < 101; j++) {
                    a = i;
                    b = j;
                    c = Math.pow(a, n) + Math.pow(b, n);
                    result = Math.pow(c, 1.0 / n);//точка 0 важны так как изначально все числа считаются int
                    if (result == (int) result) {// 2.0 == 2
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
