package 结构型模式.桥接模式;

/**
 * 将两个角色之间的继承关系改为聚合关系，就是将它们之间的强关联改换成为弱关联。因此，桥梁模式中的所谓脱耦，
 * 就是指在一个软件系统的抽象化和实现化之间使用组合/聚合关系而不是继承关系，
 * 从而使两者可以相对独立地变化。这就是桥梁模式的用意。
 * 共同点：桥接和适配器都是让两个东西配合工作
 * 不同点：出发点不同。
 * 　　适配器：改变已有的两个接口，让他们相容。
 * 　　桥接模式：分离抽象化和实现，使两者的接口可以不同，目的是分离。
 * Created by liec on 2017-02-23.
 */
public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSourceable().method();
    }
}
