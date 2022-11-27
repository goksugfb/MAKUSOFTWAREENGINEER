/*
1.Adim: Basla
2.Adim: Al x
3.Adim: y=(x*x)-(5*x)+3
4.Adim: Eğer y<0 ise yazdir "negatif"
5.Adim: Eğer y=0 ise yazdir "sıfır"
6.Adim: Eğer hiç biri sağlamıyorsa yazdir "pozitif"
7.Adim: Bitir
*/
package makusoftwareengineer;
import java.util.Scanner;
public class signum_fonksiyon {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Signum fonksiyonunda girmek istediğiniz sayıyı giriniz:");
        int x=input.nextInt();
        int y=(x*x)-(5*x)+3;
        if(y<0){
            System.out.println("Girdiğiniz değere göre fonksiyonun değeri negatiftir.");
        }
        else if(y==0){
            System.out.println("Girdiğiniz değere göre fonksiyonun değeri sıfırdır.");
        }
        else{
            System.out.println("Girdiğiniz değere göre fonksiyonun değeri pozitiftir.");
        }
    }
}