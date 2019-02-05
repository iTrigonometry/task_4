public class Fucking_Numbers {
  /*
  Вычислить выражение 1- 1/2 +1/3 -1/4 + +1/ 9999-1/10000 , используя оператор условия.
   */
    public static void main(String[] args){
        double sashenka = 1;
        //вроде это вот так работает
        for (int i = 2; i < 10001; i++){
            if (i%2==0)sashenka -= (1.0/i);
            else sashenka+=(1.0/i);
        }
            System.out.print("Sashenka остался в наших сердцах таким: " + sashenka);
    }
}
