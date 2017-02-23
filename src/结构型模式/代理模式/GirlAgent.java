package 结构型模式.代理模式;

import java.util.Random;

/**
 * Created by liec on 2017-02-23.
 */
public class GirlAgent implements Girl {
    private Girl girl;

    public GirlAgent() {
        this.girl = new PrettyGirl();
    }

    /*
    * 然而，实际上，在装饰器模式和代理模式之间还是有很多差别的。装饰器模式关注于在一个对象上动态的添加方法，
    * 然而代理模式关注于控制对对象的访问。换句话 说，用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息。
    * 因此，当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。并且，当我们使用装饰器模 式的时候，
    * 我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。
    *    我们可以用另外一句话来总结这些差别：使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。
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
