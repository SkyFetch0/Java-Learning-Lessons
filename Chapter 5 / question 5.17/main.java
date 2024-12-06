import java.util.Random;
import java.util.Scanner;
public class question517 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of lines(1-15): ");
        int limit = scan.nextInt();
        // 1-15 Arası Sayı Kontrolü
        if(limit < 1){
            System.out.println("Lütfen 1-15 Arası Bir Sayı Girin!");
            return;
        } else if(limit > 15) {
            System.out.println("Lütfen 1-15 Arası Bir Sayı Girin");
            return;
        }
            //En Sonda Ekrana Yazdırmak İçin Boş Bir String Değer Oluşturuyoruz
        String Mesaj = "";
        for(int i = 1; i <= limit; i++) {
                // Her Satırda Kaç Tane Boşluk Olduğunu Bulmak İçin BoslukSayisi Değerini Oluşturuyoruz
            int BoslukSayisi = limit - i;
                // Boşlukları Yazacağımız String Değerimizi Oluşturuyoruz
            String Bosluklar = "";
            for(int a = 1; a <= BoslukSayisi; a++){
                Bosluklar += "  ";
            }
            // Piramidin Sol Tarafını Yapıyoruz
            int iYedek = i;
            String Sayilar = "";
            for(int v = 0; v < iYedek;) {
                // Sayılar 6 5 4 3 2 1 şeklinde gideceği için en büyükten yazdırmaya başalıyoruz
                Sayilar += " "+iYedek + "";
                // Git Gide Azaltıyoruz
                iYedek--;
            }


            // Piramidin Sağ Tarafını Yapıyoruz
            for(int j = 1; j <= i;) {
                // if ile i Değerinin 1 olup olmadığını kontrol ediyoruz
                // Burdaki Amaç Ortada 2 Tane 1 Olmasın Diye
                if(i == 1) {
                    // Eğer i Değeri 1 İse Sayilar Kısmını Boş Bırak
                    Sayilar += "";

                }else if(j == 1) {
                    // if ile j Değerinin 1 olup olmadığını kontrol ediyoruz
                    // Burdaki Amaç Ortada 2 Tane 1 Olmasın Diye
                    // Eğer j Değeri 1 İse Sayilar Kısmını Boş Bırak
                    Sayilar += "";
                } else {
                    Sayilar += " "+j + "";
                }
                j++;
            }
            // Piramitin Yeni Satırlarını Mesaja Ekliyoruz
            Mesaj += Bosluklar + Sayilar + "\n";


        }
        // Döngü Bittikten Sonra Mesajı Yazdır
        System.out.println(Mesaj);
    }

}
