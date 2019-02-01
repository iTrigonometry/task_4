import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pass {
    public static void main(String[] args){
        System.out.print("Введите пароль: ");
        Scanner input = new Scanner(System.in);
        String pass =  input.nextLine();

        try{
        String path = "file/pass.txt";
        File file = new File(path);
        Scanner fileReader = new Scanner(file);


        while(fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            if (line.equals(pass)){
                System.out.println("Пароль введен верно.");
                break;
            }
        }}catch (FileNotFoundException e){
            e.printStackTrace();
        }
    {
            ;
        }
    }
}
