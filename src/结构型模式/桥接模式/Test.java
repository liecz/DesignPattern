package 结构型模式.桥接模式;

/**
 * Created by liec on 2017-02-23.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable s1 = new Source1();
        Sourceable s2 = new Source2();
        Bridge b = new MyBridge();
        b.setSourceable(s1);
        b.method();
        b.setSourceable(s2);
        b.method();
    }
}
