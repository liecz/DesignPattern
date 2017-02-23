package 结构型模式.适配器模式;

import 结构型模式.适配器模式.接口适配器模式.ISource;
import 结构型模式.适配器模式.接口适配器模式.SourceImpl;

/**
 * Created by liec on 2017-02-23.
 */
public class Test {
    public static void main(String[] args) {
        Targetable t = new ClassAdaptor();
        t.method1();
        t.method2();

        t = new ObjectAdaptor(new Source());
        t.method1();
        t.method2();

        ISource s = new SourceImpl();
        s.method2();
        s.method1();
    }
}
