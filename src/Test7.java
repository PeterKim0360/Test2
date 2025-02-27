import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test7 implements jieko1{
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",18);
        System.out.println(map.get("张三"));
//        String s1="abcdefg";
//        String s2="hijklmn";
//        int pos=3;
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<s1.length();i++){
//            if(i==pos){
//                sb.append(s2);
//            }
//            sb.append(s1.charAt(i));
//        }
//        System.out.println(sb.toString());
    }

    @Override
    public int returnNo() {
        return 0;
    }
}
interface jieko1{
    int returnNo() throws IOException;
}