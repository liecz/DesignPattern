package 创建型模式.建造者模式;

/**
 * Created by liec on 2017-02-22.
 */
public class MealA extends MealBuilder {
    @Override
    public void buildFood() {
        getMeal().setFood("鸡腿汉堡");
    }

    @Override
    public void buildDrink() {
        getMeal().setDrink("可乐");
    }
}
