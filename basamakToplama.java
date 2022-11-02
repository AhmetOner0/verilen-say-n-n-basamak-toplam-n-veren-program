package patikadev;
import java.util.Scanner;
public class basamakToplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val,total=0;
        System.out.println("bir sayı giriniz:");
        val = sc.nextInt();

        while (val > 0){
            total += val % 10;
            val /= 10;
        }
        System.out.println("girilen sayının rakamları toplamı:"+total);
    }
}
