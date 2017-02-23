package 结构型模式.适配器模式;

/**
 * Created by liec on 2017-02-23.
 */
public class ObjectAdaptor implements Targetable {

    private Source source;

    public ObjectAdaptor(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("ClassAdaptor method2");
    }
}
