import java.util.Scanner;

public class Chapter602 {

    public static int topla(int i, int j, char c) {
        int sonuc = 0;
        for(i = i; i <= j;i++)  {
            if(i % 2 == 0 && c == 'ç'){
                sonuc += i;
            } else if(i % 2 != 0 && c == 't') {
                sonuc += i;

            }

        }
        return sonuc;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Toplama Aralaığını Girin ( Örneğin 1 100 gibi, tek(t), çift(ç): )");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        char c = scan.next().charAt(0);
        System.out.println(topla(s1,s2,c));


    }


}
