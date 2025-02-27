import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class Test4 {
    public static void main(String[] args) {
//        LocalDate date=LocalDate.of(2024,10,10);
//        LocalTime time=LocalTime.of(20,20,20);
//        LocalDateTime date1=LocalDateTime.of(date,time);
//        System.out.println(date1);
//        Duration between=Duration.between(date1,date2);
//        System.out.println(between.toDays());
//        LocalTime time1 = LocalTime.of(9, 30); // 09:30
//        LocalTime time2 = LocalTime.of(14, 45); // 14:45
//
//        Duration duration = Duration.between(time1, time2);
//
//        System.out.println("Hours: " + duration.toHours()); // 输出小时数
//        System.out.println("Minutes: " + duration.toMinutes()); // 输出分钟数
//        System.out.println("Seconds: " + duration.getSeconds()); // 输出秒数
//


//        LocalDate date2=LocalDate.of(2024,2,20);
//        LocalDate date3 = date2.withMonth(10);
//        System.out.println(date3);
//        LocalDate date3=LocalDate.now();
//        Period period =Period.between(date2,date3);
//        System.out.println(period.getDays());



//        int n=10;
//        int[][] pc={
//                {1,3},
//                {2,2},
//                {1,2}
//        };
//
//        Arrays.sort(pc,0,1,(a,b)->(a[1]-b[1]));
//        for(int[] nums:pc){
//            System.out.println(Arrays.toString(nums));
//        }
//        Map<Integer,String> map=new HashMap<>();
//        map.put(1,"张三");
//        map.put(2,"李四");
//        map.put(3,"王五");
//        map.put(4,"王五1");
//        map.put(5,"王五2");
//        map.put(6,"王五3");
////        Set<Integer> ks = map.keySet();
////        for(int key:ks){
////            System.out.println(key+" "+map.get(key));
////        }
//
//        for(Map.Entry<Integer,String> entry:map.entrySet()){
//            int key=entry.getKey();
//            String value=entry.getValue();
//            System.out.println(key+" "+value);
//        }
        int date=20241112;
        String s=String.valueOf(date);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate date1=LocalDate.parse(s,dtf);
        System.out.println(date1);


        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yyyyMMdd");
        String s2=dtf2.format(date1);
        System.out.println(s2);
    }

}
