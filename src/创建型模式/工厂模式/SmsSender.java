package 创建型模式.工厂模式;

/**
 * Created by liec on 2017-02-22.
 */
public class SmsSender implements Sender {

    @Override
    public void sendMail() {
        System.out.println("SmsSender send a mail.");
    }
}
