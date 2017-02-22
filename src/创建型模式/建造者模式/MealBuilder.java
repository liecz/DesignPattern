package 创建型模式.建造者模式;

/**
 * Created by liec on 2017-02-22.
 */
public abstract class MealBuilder {
    Meal m = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return m;
    }
}
