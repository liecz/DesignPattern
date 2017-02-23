package 结构型模式.装饰模式;

/**
 * Created by liec on 2017-02-23.
 */
public class Decorator implements Sourceable {
    private Sourceable s;

    public Decorator(Sourceable s) {
        this.s = s;
    }

    @Override
    public void method1() {
        System.out.println("Decorator method1 begin");
        s.method1();
        System.out.println("Decorator method1 end");
    }
}
