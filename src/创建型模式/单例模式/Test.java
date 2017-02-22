package 创建型模式.单例模式;

/**
 * Created by liec on 2017-02-22.
 */
public class Test {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance1();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton s2 = Singleton.getInstance1();
                System.out.println(s == s2);
            }
        });
        t.start();
    }
}
