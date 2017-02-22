package 创建型模式.工厂模式;

/**
 * Created by liec on 2017-02-22.
 */
public class SenderFactory {
    /*
    * 普通工厂模式
    * */
    public Sender produce(String type) {
        if (type.equals("mail"))
            return new MailSender();
        else if (type.equals("sms"))
            return new SmsSender();
        return null;
    }

    /*
    * 方法工厂模式
    * */
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

    /*
    * 静态方法工厂模式
    * */
    public static Sender sProduceMail() {
        return new MailSender();
    }

    public static Sender sProduceSms() {
        return new SmsSender();
    }
}
