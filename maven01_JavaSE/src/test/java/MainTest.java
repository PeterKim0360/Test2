import com.bjpowernode.Main;
import com.bjpowernode.service.Common;
import org.junit.Test;

public class MainTest {
    @Test
    public void testSayHi(){
        Common common =new Common();
        common.sayHi();
    }
    @Test
    public void testSum(){
        Main main1=new Main();
        System.out.println(main1.sum(2,5));
    }
    @Test
    public void testSum2(){
        Main main1=new Main();
        System.out.println(main1.sum(10,5));
    }

}
