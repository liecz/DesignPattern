package 创建型模式.建造者模式;

/**
 * Created by liec on 2017-02-22.
 */
public class MealB extends MealBuilder {
    @Override
    public void buildFood() {
        getMeal().setFood("老北京卷饼");
    }

    @Override
    public void buildDrink() {
        getMeal().setDrink("奶茶");
    }
}
