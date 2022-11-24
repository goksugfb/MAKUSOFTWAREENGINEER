/*

 */
package makusoftwareengineer;
import java.util.Scanner;
public class küre_alan_hacim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kürenizin yarı çapını pozitif tam sayı cinsinden giriniz: ");
        int r=input.nextInt();
        double A=4*3.14*r*r;
        double V=4/3*3.14*r*r*r;
        System.out.println("Girdiğiniz yarıçap değerine göre kürenizin yüzey alanı: "+A);
        System.out.println("Girdiğiniz yarıçap değerine göre kürenizin hacmi: "+V);
    }
}