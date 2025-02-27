import java.awt.*;
import java.net.StandardSocketOptions;

public class Test5 {
    public static void main(String[] args) {
        Season[] values = Season.values();
        for(Season season1:values){
            System.out.println(season1);
        }
        Season season=Season.SUMMER;
        System.out.println(season);
        if(season==Season.AUTUMN){
            System.out.println("夏天");
        }
    }
}
