/*
1.Adim: Başla
2.Adim: Al m,n ve k=0
3.Adim: for(i=1; i<=n; i++){k=k+m}
4.Adim: Yazdir "m"
5.Adim: Bitir
*/
package makusoftwareengineer;
import java.util.Scanner;
public class carpansiz_carpma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen çarpmak istediğiniz ilk tam sayıyı giriniz:");
        int n=input.nextInt();
        System.out.println("Lütfen çarpmak istediğiniz ikinci sayıyı giriniz:");
        int m=input.nextInt();
        int k=0;
        for (int i = 1; i<=n; i++) {
            k=k+m;
        }
        System.out.println("Çarpım sonucunuz: "+k);
    }
}
