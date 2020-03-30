package lambda;
import	java.util.ArrayList;

/**
 * @Description //消费型接口
 * @Author 李项
 * @Date 2020/3/29
 * @Version 1.0
 */
public class TestConsumer {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.forEach(s->{
            System.out.println(s);
        });

    }
}
