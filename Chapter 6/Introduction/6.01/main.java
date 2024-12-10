import java.util.Scanner;

public class Chapter6 {

    public static int hesapla(int i, int j) {
        int data = 0;
        for(i=i;i <= j;i++) {
            data += i;
        }
        return data;
    }

    public static void main(String[] args) {

        System.out.println("Sum From 1 To 10 Is: " + hesapla(1,10));
        System.out.println("Sum From 20 To 37 Is: " + hesapla(20,37));
        System.out.println("Sum From 35 To 49 Is: " + hesapla(35,49));



    }


}
