import java.util.Date;
public class Date_Author {
    public static void main(String[] args){
        //ругается на deprecated int int int int int int int int ПАЧИМУ? ОНО ЖЫ РАБОТАЕТ
        Date date_received =  new Date(119,1,19, 10,6);//класс date помогает работать с датами0
        String second_name = "Красногорский";
        System.out.print("Фамилия сдающего:" + second_name);
        System.out.print("\nЗадание получено:" + date_received.toString());
        //при просто создании эк
        Date date_sended = new Date();
        System.out.print("\nЗадание сдается: " + date_sended.toString());

        //task oriented документация
        //особености направлености на задачи документаиции для пользователей и для разработчиков

    }
}