import java.util.Scanner;

public class question51 {


    public static void main(String[] args) {
        // Scanneri sc Değerine Atıyoruz
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Sayı Girin:");

        double toplam=0;
        int positives = 0;
        int negatives = 0;

        while(true){
            int sayi = sc.nextInt();

            if(sayi < 0) {
                negatives++;
                toplam += sayi;
            } else if(sayi > 0) {
                positives++;
                toplam += sayi;
            } else
                break;
        }
        double bolum = (toplam) / (negatives + positives);
        System.out.println("Pozitif sayı Adeti: " + (int)positives);
        System.out.println("Negatif Sayı Adeti: " + (int)negatives);
        System.out.println("Toplam: " + (int)toplam);
        System.out.println("Ortalama: " + ( bolum));
    }


}
