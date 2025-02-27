
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double BMI=sc.nextDouble();
        if(BMI<18.5){
            System.out.println("过轻");
        }else if(BMI>=18.5&&BMI<24){
            System.out.println("适中");
        }else if(BMI>=24&&BMI<28){
            System.out.println("偏重");
        }else if(BMI>=28&&BMI<=34){
            System.out.println("肥胖");
        }else{
            System.out.println("非常肥胖");
        }
    }
}
