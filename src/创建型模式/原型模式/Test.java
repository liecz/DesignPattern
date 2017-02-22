package 创建型模式.原型模式;

/**
 * Created by liec on 2017-02-22.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Property property = new Property("123");
        Prototype p = new Prototype("abc", property);
        Prototype p2 = p.clone();
        System.out.println(String.valueOf(p == p2) + "  " + String.valueOf(p.getProperty() == p2.getProperty()));
    }
}
