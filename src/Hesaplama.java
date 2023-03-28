import java.util.Scanner;
public class Hesaplama {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input=new Scanner(System.in);
        System.out.println("A kenarının uzunu giriniz:");
        a= input.nextInt();
        System.out.println("B kenarının uzunu giriniz:");
        b= input.nextInt();
        c= Math.sqrt((b*b)+(a*a));
        System.out.println("C kenarı:"+c);
    }
}
