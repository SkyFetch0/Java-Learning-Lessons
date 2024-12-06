
public class question519 {


    public static void main(String[] args) {
        // Limiti Belirleriz
        int limit = 8;
        //En Sonda Ekrana Yazdırmak İçin Boş Bir String Değer Oluşturuyoruz
        String Mesaj = "";
        for(int i = 1; i <= limit; i++) {
            // Kaç Tane Boşluk Olacağını Ayarlıyoruz
            // 1. Satırda 7 Tane Boşluk Olması Lazımki 8.satırdaki ile eş durabilsin
            int limityeni = limit - i;
            // Boşlukları Kaydedeceğimiz Bir String İfade açıyoruz
            String Bosluklar = "";
            // Her Satırda Kaç Tane Boşluk Olacağını Hesaplıyoruz
            for(int j = 1; j <= limityeni; j++) {
                Bosluklar += "  ";
            }

            // Sol Taraftakileri Kaydetmek İçin String Bir İfade Açıyoruz
            String SolMesaj = "";
            // j değerini 1 den başlatıyoruz ve i değerinden küçük olduğu zaman çalışacağı bir for açıyoruz
            for(int j = 1; j < i;){
                // ilk satırda 1 yapmak için 2 nin 0 ıncı üssünü almak için iyenim değerini atıyoruz
                int iyenim = j - 1;
                // 2 nin iyenim'ci kuvvetini alıyoruz
                SolMesaj += (int) Math.pow(2.0,iyenim) + " ";
                // j değerini arttırarak 0, 1, 2,3 yani 1, 2, 4, 8 şeklinde arttırmak için kullanıyoruz
                j++;
            }
            // Sağ Taraftakileri Kaydetmek İçin String Bir İfade Açıyoruz
            String SagMesaj = "";
            // j değerini i ye atıyoruzki sağ taraf orantılı gitsin
            for(int j = i; j > 0;){
                int iyenim = j - 1;
                SagMesaj += (int) Math.pow(2.0,iyenim) + " ";
                // Burda j yi azaltıyoruz çünkü sağ kısımda 8, 4, 2, 1 şeklinde gitmesini sağlamamız lazım
                j--;
            }
            // tüm değerleri birleştirip Mesaj değerine atıyoruz
            Mesaj += Bosluklar + SolMesaj + SagMesaj  + " \n";
        }
        System.out.println(Mesaj);
    }

}
