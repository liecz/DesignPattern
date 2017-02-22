package 创建型模式.工厂模式;

/**
 * Created by liec on 2017-02-22.
 */
public class Test {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender s = factory.produce("sms");
        s.sendMail();
        s = factory.produce("mail");
        s.sendMail();
    }
}
