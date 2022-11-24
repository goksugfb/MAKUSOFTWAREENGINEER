/*
1.Adim: Başla
2.Adim: Al n
3.Adim: Eğer n=1 ise yazdır "Pazartesi"
4.Adim: Eğer n=2 ise yazdır "Salı"
5.Adim: Eğer n=3 ise yazdır "Çarşamba"
6.Adim: Eğer n=4 ise yazdır "Perşembe"
7.Adim: Eğer n=5 ise yazdır "Cuma"
8.Adim: Eğer n=6 ise yazdır "Cumartesi"
9.Adim: Eğer n=7 ise yazdır "Pazar"
10.Adim: Eğer n hiçbiri ise yazdır "Girdiğiniz sayının karşılığında bir gün yoktur."
11.Adim: Bitir
 */
package makusoftwareengineer;
import java.util.Scanner;
public class haftanin_hangi_günü {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 1-7 (dahil) arasında bir tamsayı giriniz:");
        int n=input.nextInt();
        if(n==1){
            System.out.println("Seçtiğiniz gün: Pazartesi");
        }
        else if(n==2){
            System.out.println("Seçtiğiniz gün: Salı");
        }
        else if(n==3){
            System.out.println("Girdiğiniz gün: Çarşamba");
        }
        else if(n==4){
            System.out.println("Girdiğiniz gün: Perşembe");
        }
        else if(n==5){
            System.out.println("Girdiğiniz gün: Cuma");
        }
        else if(n==6){
            System.out.println("Girdiğiniz gün: Cumartesi");
        }
        else if(n==7){
            System.out.println("Girdiğiniz gün: Pazar");
        }
        else{
            System.out.println("Girdiğiniz sayıya karşılık gelen bir gün yoktur.");
        }
    }
}