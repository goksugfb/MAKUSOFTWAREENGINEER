/*

*/
package makusoftwareengineer;
import java.util.Scanner;
public class cisim_enerjileri {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Lütfen cismin kütlesini kg cinsinden giriniz:");
       double m=input.nextDouble();
       System.out.println("Lütfen cismin yerden yüksekliğini cm cinsinden giriniz:");
       double h=input.nextDouble();
       System.out.println("Lütfen cismin hızını giriniz:");
       double V=input.nextDouble();
       double Ep=m*10*h;
       double Ek=m*V*V;
       System.out.println("Girdiğiniz değerlere göre cisminizin kinetik enerjisi: "+Ek);
       System.out.println("Girdiğiniz değerlere göre cisminizin potansiyel enerjisi: "+Ep);
    }
}