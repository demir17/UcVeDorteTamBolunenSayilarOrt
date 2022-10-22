import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, toplamSayi = 0, bolunenSayiToplam = 0;

        System.out.println("Bir sayı giriniz: ");
        inp = sc.nextInt();

        for (int i=0; i <= inp ; i++){


            if(i % 3 == 0 && i % 4 == 0){
               toplamSayi++;
               bolunenSayiToplam += i;

            } 


        }
        int ortalama = bolunenSayiToplam / (toplamSayi-1);
        System.out.println(ortalama);
    }
}
