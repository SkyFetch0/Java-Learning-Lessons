import java.util.Random;
import java.util.Scanner;
public class question517 {


    public static void main(String[] args) {

        int number = 16;

        String msg = "";

        for(int i = 1; i <= number; i++) {


            int ic = number - i;
            String msc = "";
            for(int a = 1; a <= ic; a++){
                msc += "  ";
            }
            int is = i;
            String numbers = "";
            for(int v = 0; v < is;) {
                if(is <= 0) {
                    continue;
                }
                numbers += " "+is + "";
                is--;
            }



            for(int j = 1; j <= i;) {
                if(i == 1) {
                 numbers += "";

                }else if(j == 1) {
                    numbers += "";
                } else {
                    numbers += " "+j + "";
                }
                j++;
            }
            msg += msc + numbers + "\n";


        }
        System.out.println(msg);



    }

    }
