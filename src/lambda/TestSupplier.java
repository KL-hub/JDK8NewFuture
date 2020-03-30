package lambda;

import java.util.stream.Stream;

/**
 * @Description //供给型接口（无参有返回值）
 * @Author 李项
 * @Date 2020/3/29
 * @Version 1.0
 */
public class TestSupplier {
    public static void main(String[] args) {
        Stream<Double> generate = Stream.generate(() -> Math.random());
        generate.forEach(s->{
            System.out.println(s);
        });

    }
}
