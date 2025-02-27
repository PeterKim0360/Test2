import java.util.*;
import java.util.function.Supplier;

public class Test8 {
    public static void main(String[] args) {
        teacher t=new teacher("张三");
        Supplier<String> supplier=t::getName;
        System.out.println(supplier.get());
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    }
}
class teacher{
    private String name;
    public teacher(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
