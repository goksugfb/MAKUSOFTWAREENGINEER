/*
Adim1: Basla.
Adim2: Klavyeden m,t al.
Adim3: v=m/t
Adim4: Yazdir=v
Adim5: Bitir.
*/
package makusoftwareengineer;
import java.util.Scanner;
public class ort_hiz {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yer değiştirmenizi(m) giriniz:");
        double m=input.nextDouble();
        System.out.println("Lütfen toplam geçen süreyi(sn) giriniz:");
        double t=input.nextDouble();
        double v=m/t;
        System.out.println("Yol boyu ortalama hızınız: "+v);
    }
}
