package 结构型模式.适配器模式.接口适配器模式;

/**
 * Created by liec on 2017-02-23.
 */
public class SourceImpl extends InterfaceAdaptor {
    @Override
    public void method1() {
        System.out.println("SourceImpl method1");
    }
}
