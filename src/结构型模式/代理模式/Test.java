package 结构型模式.代理模式;

/**
 * Created by liec on 2017-02-23.
 */
public class Test {
    public static void main(String[] args) {
        Girl ga = new GirlAgent();
        ga.behavior();

    }
}
