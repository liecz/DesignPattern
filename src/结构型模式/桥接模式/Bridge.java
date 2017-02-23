package 结构型模式.桥接模式;

/**
 * Created by liec on 2017-02-23.
 */
public abstract class Bridge {
    private Sourceable sourceable;

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    public void method() {
        sourceable.method();
    }
}
