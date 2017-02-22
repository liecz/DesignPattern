package 创建型模式.单例模式;

/**
 * Created by liec on 2017-02-22.
 */
public class Singleton {
    private Singleton() {
    }

    private static class SingletonFactory {
        public static final Singleton singleton = new Singleton();
    }

    /*
    * 这种方式同样利用了classloder的机制来保证初始化instance时只有一个线程
    * 并且保证lazy loading
    * */
    public static Singleton getInstance() {
        return SingletonFactory.singleton;
    }


    private static volatile Singleton singleton;

    /*
    * 双重检查加锁：
    * “双重检查加锁“的方式可以既实现线程安全，又能够使性能不受到很大的影响。
    * 那么什么是”双重检查加锁“机制呢？
    *        所谓双重检查加锁机制，指的是：并不是每次进入getInstance方法都需要同步，
    * 而是先不同步，进入方法过后，先检查实例是否存在，如果不存在才进入下面的同步块，
    * 这是第一重检查。进入同步块后，再次检查实例是否存在，如果不存在，就在同步的
    * 情况下创建一个实例，这是第二重检查。这样一来，就只需要同步一次了，从而减少了
    * 多次在同步情况下进行判断所浪费的时间。
    *       双重检查加锁机制的实现会使用一个关键字volatile，它的意思是：被volatile
    * 修饰的变量的值，将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而
    * 确保多个线程能正确的处理该变量。
    *
    * 说明：由于volatile关键字可能会屏蔽掉虚拟机中的一些必要的代码优化，所以运行效率并不是
    * 很高。因此一般建议，没有特别的需要，不要使用。也就是说，虽然可以使用”双重检查加锁“
    * 机制来实现线程安全的单例，但并不建议大量采用，可以根据情况来选用
    **/
    public static Singleton getInstance1() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
