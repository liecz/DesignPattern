package 结构型模式.适配器模式.接口适配器模式;

/**
 * Created by liec on 2017-02-23.
 */
public abstract class InterfaceAdaptor implements ISource {
    @Override
    public void method1() {
        System.out.println("do nothing");
    }

    @Override
    public void method2() {
        System.out.println("do nothing");
    }
}
