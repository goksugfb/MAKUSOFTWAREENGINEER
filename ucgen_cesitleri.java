/*
 */
package makusoftwareengineer;
import java.util.Scanner;
public class ucgen_cesitleri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen üçgeninizin birinci kenarını giriniz:");
        double j=input.nextDouble();
        System.out.println("Lütfen üçgeninizin ikinci kenarını giriniz:");
        double l=input.nextDouble();
        System.out.println("Lütfen üçgeninizin üçüncü(son) keanrını giriniz:");
        double k=input.nextDouble();
        if(j==k&&j==l){
            System.out.println("Girdiğiniz değerlere göre üçgeniniz eşkenar bir üçgendir.");
        }
        else if(j==k&&k!=l || j==l&&l!=k || k==l&&l!=j){
            System.out.println("Girdiğiniz değerlere göre üçgeniniz ikizkenar bir üçgendir.");
        }
        else{
            System.out.println("Girdiğiniz değerlere göre üçgeniniz çeşitkenar bir üçgendir.");
        }
    }
}