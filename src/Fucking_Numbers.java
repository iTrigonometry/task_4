public class Fucking_Numbers {
    public static void main(String[] args){
        double sashenka = 1;
        //я не помню что за задание
        for (int i = 2; i < 10001; i++){
            if (i%2==0)sashenka -= (1.0/i);
            else sashenka+=(1.0/i);
        }
            System.out.print("Sashenka остался в наших сердцах таким: " + sashenka);
    }
}
