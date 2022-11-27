/*
1.Adim: Basla
2.Adim: Al n
3.Adim: n=0 değil ise yaz (n mod 10)
4.Adim: n/=10
5.Adim: Bitir
*/
package makusoftwareengineer;
import java.util.Scanner;
public class tersten_sayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Tersten yazmak istediğiniz sayıyı giriniz:");
        int n=input.nextInt();
        System.out.print("Girdiğiniz sayının tersten yazılışı:");
        while(n!=0){
            System.out.print(n%10);
            n/=10;
        }
    }
}