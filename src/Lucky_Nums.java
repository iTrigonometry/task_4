import java.util.Scanner;

public class Lucky_Nums {
    public static void main(String[] Sashenka){
        Scanner input = new Scanner(System.in);
        //просим ввести количество чисел
        System.out.print("Введите количество чисел: ");
        int n = input.nextInt();
        //заполняем массив
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nВведите число меньше 304: ");
            arr[i] = input.nextInt();
        }
        //мне показалось что искать счастливые числа по формулам это сложно, да и не надо поэтому у меня есть массив лучших счастливыъ чисел
        int[] lucky_Nums = {1, 3, 7, 9, 13, 15, 21, 25, 31, 33, 37, 43, 49, 51, 63, 67, 69, 73, 75, 79, 87, 93, 99, 105, 111, 115, 127, 129, 133, 135, 141, 151, 159, 163, 169, 171, 189, 193, 195, 201, 205, 211, 219, 223, 231, 235, 237, 241, 259, 261, 267, 273, 283, 285, 289, 297, 303};
        // поиск и вывод счастливых чисел
        boolean lucky = false;//чтобы сообщить в случае чего что чисел нет
        System.out.print("Это счастливые числа: ");
        for (int i = 0; i < n; i++){
            if (arr[i] <= 303)
            for (int j = 0; j < lucky_Nums.length; j++){
                if (arr[i] == lucky_Nums[j]){
                    System.out.print(arr[i] + " ");
                    lucky = true;
                    break;
                }
            }
        }
        if (!lucky)//сообщаем о том что таких чисел нет 
            System.out.print("\nСчасливых чисел не найдено((((");

    }
}
