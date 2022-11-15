/*
Adim1: Basla
Adim2: m degerini al.
Adim3: km=m/1000
Adim4: Yazdir=km
Adim5: Bitir.
*/
package makusoftwareengineer;
import java.util.Scanner;
public class metre_km {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Lütfen çevirmek istediğiniz değeri (m) cinsinden giriniz:");
        double m =input.nextDouble();
        double km=m/1000;
        System.out.println("Girdiğiniz uzunluğun km cinsinden değeri:" +km);
    }  
}
