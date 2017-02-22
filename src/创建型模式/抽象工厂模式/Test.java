package 创建型模式.抽象工厂模式;

/**
 * Created by liec on 2017-02-22.
 */
public class Test {
    public static void main(String[] args) {
        Provider p = new SmsSenderFactory();
        Sender s = p.produce();
        s.sendMail();
    }
}
