import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double pi=3.14;
        double s=pi*r*r;
        double c=2*pi*r;
        System.out.printf("%.2f\n",s);
        System.out.println("圆的周长为："+c);
    }
}
