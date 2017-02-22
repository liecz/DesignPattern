package 创建型模式.建造者模式;

/**
 * Created by liec on 2017-02-22.
 */
public class KFCWaitor {
    private MealBuilder builder;

    public void setBuilder(MealBuilder builder) {
        this.builder = builder;
    }

    public Meal construct() {
        builder.buildFood();
        builder.buildDrink();
        return builder.getMeal();
    }
}
