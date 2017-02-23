package 结构型模式.适配器模式;

/**
 * Created by liec on 2017-02-23.
 */
public class ClassAdaptor extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("ClassAdaptor method2");
    }
}
