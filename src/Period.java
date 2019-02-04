import java.util.Scanner;

public class Period {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество чисел которые вы хотите ввести: ");
        int n = input.nextInt();
        Integer[] arrOfNums = new Integer[n];

        for(int index = 0; index < n; index++){
            System.out.print("Введите число: ");
            arrOfNums[index] = input.nextInt();
        }

        findPeriod(arrOfNums);


    }
    // Algorithm @author is RodionGork
    private static void findPeriod(Integer[] sourceNumbers) {
        long firstNumber, secondNumber, firstTimer, length, secondTimer, index;
        boolean isPositive = true;// если не найдем числа,то нужно об этом надо как то расказать
        for (int n = 0; n < sourceNumbers.length - 1; n++) {
            //проверяем длинну массива, чтобы было что искать
            if (sourceNumbers.length < 2) {
                break;
            }
            //если нашли два положительных числа, то в путь
            else if (sourceNumbers[n] >= 0 && sourceNumbers[n + 1] >= 0) {
                isPositive = false;
                firstNumber = sourceNumbers[n];
                secondNumber = sourceNumbers[n + 1];
                firstTimer = firstNumber;
                //делаем все как в гайдиках в интернете. Числитель делим на знаменатель. При этом числитель умножаем на 10
                for (index = 0; index < secondNumber; index++) {
                    firstTimer = (firstTimer * 10) % secondNumber;
                }
                secondTimer = firstTimer;
                length = 0;
                // начинаем выискивать длинну периода
                do {
                    firstTimer = (firstTimer * 10) % secondNumber;
                    length++;
                } while (firstTimer != secondTimer);
                secondTimer = firstTimer = firstNumber;
                System.out.print("\nПериод десятичной дроби firstNumber = m/n для "
                        + "первых двух целых положительных чисел n и m, "
                        + "расположенных подряд: 0.");
                for (index = 0; index < length; index++) {
                    firstTimer = (firstTimer * 10) % secondNumber;
                }
                //ищем то что будет до периода и выводим
                for (index = 0; firstTimer != secondTimer; index++) {
                    System.out.print(secondTimer * 10 / secondNumber);
                    firstTimer = (firstTimer * 10) % secondNumber;
                    secondTimer = (secondTimer * 10) % secondNumber;
                }

                // выводим то что будет в скобках
                System.out.print('(');
                for (index = 0; index < length; index++) {
                    System.out.print(secondTimer * 10 / secondNumber);
                    secondTimer = (secondTimer * 10) % secondNumber;
                }
                //выводим дробь
                System.out.println(')' + " = " + firstNumber + "/" + secondNumber);
                break;
            }else{
                System.out.print("...");
            }
        }
        if (isPositive)
            System.out.print("\nНужных чисел не найдено.");
    }
}
