import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pass {
    public static void main(String[] args){
        //просим ввести пароль
        System.out.print("Введите пароль: ");
        Scanner input = new Scanner(System.in);
        String pass =  input.nextLine();

        try{//открываем заранее приготовленный файл с кучей паролей
        String path = "file/pass.txt";
        File file = new File(path);
        Scanner fileReader = new Scanner(file);
        boolean was = true;//выясняем правильно ли введено пароль
            //начинаем читать файл
        while(fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            if (line.equals(pass)){
                System.out.println("Пароль введен верно.");
                was = false;
                break;
            }
        }
        if (was)System.out.print("Пароль введен неверно");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
