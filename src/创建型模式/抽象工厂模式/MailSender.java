package 创建型模式.抽象工厂模式;

/**
 * Created by liec on 2017-02-22.
 */
public class MailSender implements Sender {
    @Override
    public void sendMail() {
        System.out.println("MailSender send mail.");
    }
}
