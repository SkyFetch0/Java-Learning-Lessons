import java.util.Scanner;

public class Chapter603 {

    public static int Faktoriyel(int n) {
        int sonuc = 1;
        if (n == 0) {


            return 1;
        } else if(n > 0) {
            for(int i = 1; i<= n;i++) {
                sonuc *= i;
            }

        }
        return sonuc;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Faktoriyel Hesabı İçin Bir Sayı Girin (örnek 5 yazarsanız 5! olur)");
        int n = scan.nextInt();
        System.out.println(n+"! Faktoriyel: "+Faktoriyel(n));
    }


}
