/*
1.Adim: Basla
2.Adim: al n
3.Adim: i=0, j=1
4.Adim: j<=n olana kadar i=i+j, j=j+2
5.Adim: yazdir j
6.Adim: Bitir
 */
package makusoftwareengineer;
import java.util.Scanner;
public class tek_sayi_toplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen dilediğiniz sayıyı giriniz:");
        int n=input.nextInt();
        int i=0;
        int j=1;
        while(j<=n){
            i=i+j;
            j=j+2;
        }
        System.out.println("Girdiğiniz sayıya göre tek sayılar toplamı: "+i);
    }
}