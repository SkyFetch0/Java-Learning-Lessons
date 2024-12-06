
public class question518 {


    public static void main(String[] args) {
        // Piramitdeki Sayı Limitini Belirliyoruz
        int limit = 6; // 1 Den 6 Ya Kadar Olacak
        // En Sonda Ekrana Yazdıracabilmek İçin String Bir Değer Oluşturuyoruz
        String Mesaj = "";
        // Türlerin Yazılarını Kaydediyoruz
        String TypeA = "Tür A\n";
        String TypeB = "Tür B\n";
        String TypeC = "Tür C\n";
        String TypeD = "Tür D\n";

        for(int i = 1; i <= limit;i++) {

            // Tip A Piramiti
            for(int j = 1; j <= i;j++) {
                TypeA += j + " ";
            }
            TypeA += "\n";

            // Tip B Piramiti
            int LimitYeni = limit -i + 1;
            for(int j = 1; j <= LimitYeni;){
              TypeB += j + " ";
              j++;
            }
            TypeB += "\n";

            //Tip C Piramiti

            String Bosluk = "";
            LimitYeni = limit -i;
            for(int j = 1; j <= LimitYeni;j++) {
                Bosluk += "  ";
            }
            TypeC +=Bosluk;
            for(int j = i; j > 0;) {
                TypeC += j + " ";
                j--;
            }
            TypeC += "\n";

            // Tip D Piramiti

            LimitYeni = i - 1;
            String BoslukYeni = "";
            for(int j = 0; j < LimitYeni;j++) {
                BoslukYeni += "  ";
            }
            TypeD += BoslukYeni;

            LimitYeni = limit -i + 1;
            for(int j = 1; j <= LimitYeni;j++) {
                TypeD += j + " ";
            }
            TypeD += "\n";

        }
        // Ekrana Yazdırma
        System.out.println(TypeA);
        System.out.println(TypeB);
        System.out.println(TypeC);
        System.out.println(TypeD);


    }

}
