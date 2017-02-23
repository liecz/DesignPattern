package 结构型模式.外观模式;

/**
 * Created by liec on 2017-02-23.
 */
public class Test {
    public static void main(String[] args) {
        Facade f = new SwitchFacade();
        f.method1();
        f.method2();
    }
}
