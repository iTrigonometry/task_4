import java.util.Date;
public class Date_Author {
    public static void main(String[] args){
        //ругается на deprecated int int int int int int int int ПАЧИМУ? ОНО ЖЫ РАБОТАЕТ
        Date date_received =  new Date(119,1,19, 10,6);
        String second_name = "Красногорский";
        System.out.print("Фамилия сдающего:" + second_name);
        System.out.print("\nЗадание получено:" + date_received.toString());

        Date date_sended = new Date();
        System.out.print("\nЗадание сдается: " + date_sended.toString());


    }
}
