package 结构型模式.代理模式;

import java.util.Random;

/**
 * Created by liec on 2017-02-23.
 */
public class GirlAgent implements Girl {
    private Girl girl;

    public GirlAgent(Girl girl) {
        this.girl = girl;
    }

    /*
    * 代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。
    * 而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。
    * */
    @Override
    public void behavior() {
        System.out.println("girl agent.");
        Random r = new Random();
        if (r.nextInt(10) > 5) {
            System.out.println("hi girl.");
            girl.behavior();
        } else {
            System.out.println("she goes away.");
        }
    }
}
