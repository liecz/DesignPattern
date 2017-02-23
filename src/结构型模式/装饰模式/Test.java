package 结构型模式.装饰模式;

/**
 * Created by liec on 2017-02-23.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable decorator = new Decorator(source);
        decorator.method1();
    }
}
