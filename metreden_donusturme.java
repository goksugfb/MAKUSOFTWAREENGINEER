/*
1.Adim: Basla
2.Adim: al m,secim
3.Adim: Eğer secim=1 ise mm=m*1000, yazdir "mm"
4.Adim: Eğer sacim=2 ise cm=m*100, yazdir "cm"
5.Adim: Eğer secim=3 ise dm=m*10, yazdir "dm"
6.Adim: Eğer secim=4 ise km=m/1000, yazdir "km"
7.Adim: Eğer secim bunları karşılamıyorsa yazdir "Lütfen uygulamayı tekrar başlatıp geçerli bir değer giriniz."
8.Adim: Bitir
*/
package makusoftwareengineer;
import java.util.Scanner;
public class metreden_donusturme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen dönüştürmek istediğiniz uzunluğu metre cinsinden giriniz: ");
        int m=input.nextInt();
        System.out.println("1-mm \n2-cm \n3-dm \n4-km");
        System.out.println("Lütfen girdğiniz "+m+"m uzunluğunu dönüştürmek istediğiniz birimi seçiniz:");
        int secim=input.nextInt();
        if(secim==1){
            int mm=m*1000;
            System.out.println("Girdiğiniz değerin mm karşılığı: "+mm);
        }
        else if(secim==2){
            int cm=m*100;
            System.out.println("Girdiğiniz değerin cm karşılığı: "+cm);
        }
        else if(secim==3){
            int dm=m*10;
            System.out.println("Girdiğiniz değerin dm karşılğı: "+dm);
        }
        else if(secim==4){
            int km=m/1000;
            System.out.println("Girdiğiniz değerin km karşılığı: "+km);
        }
        else{
            System.out.println("Lütfen uygulamayı tekrar başlatıp geçerli bir değer giriniz.");
        }
    }
}
