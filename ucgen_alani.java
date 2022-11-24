/*
1.Adim: Başla
2.Adim: Al n,h
3.Adim: A=n*h/2
4.Adim: Yazdir A
5.Adim: Bitir
*/
package makusoftwareengineer;
import java.util.Scanner;
public class ucgen_alani {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lürfen üçgeninizin bir kenar uzuluğunu giriniz:");
        double n=input.nextDouble();
        System.out.println("Lütfen girdiğiniz kenara ait yüksekliği giriniz:");
        double h=input.nextDouble();
        double A=n*h/2;
        System.out.println("Girdiğiniz değerlere göre üçgeninizin alanı: "+A);
    }
}