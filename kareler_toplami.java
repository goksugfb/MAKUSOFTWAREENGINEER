/*
1.Adim: Basla
2.Adim: Al n, k=0, a=0
3.Adim: i=1
4.Adim: Eğer i>n ise git adim 8
5.Adim: a=i*i
6.Adim: k=k+a
7.Adim: Git adim 4
8.Adim: Yazdir "k"
9.Adim: Bitir
*/
package makusoftwareengineer;
import java.util.Scanner;
public class kareler_toplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen dilediğiniz pozitif tam sayıyı giriniz:");
        int n=input.nextInt();
        int k=0;
        int a=0;
        for (int i=1; i<=n ; i++) {
            a=i*i;
            k=k+a;
        }
        System.out.println("Girdiğiniz sayıya kadar olan sayıların kareleri toplamı: "+k);
    }
}