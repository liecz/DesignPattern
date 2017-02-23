package 结构型模式.代理模式;

/**
 * Created by liec on 2017-02-23.
 */
public class PrettyGirl implements Girl {
    @Override
    public void behavior() {
        System.out.println("举止优雅，落落大方");
    }
}
