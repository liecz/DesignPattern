package 结构型模式.装饰模式;

/**
 * Created by liec on 2017-02-23.
 */
public class Decorator implements Sourceable {
    private Sourceable s;

    public Decorator(Sourceable s) {
        this.s = s;
    }

    /*
    * 代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。
    * 而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，
    * 以加强被装饰对象的功能，仅此而已。
    * */
    @Override
    public void method1() {
        System.out.println("Decorator method1 begin");
        s.method1();
        System.out.println("Decorator method1 end");
    }
}
