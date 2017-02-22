package 创建型模式.原型模式;

import java.io.Serializable;

/**
 * Created by liec on 2017-02-22.
 */
public class Property implements Serializable {
    private String key;

    public Property(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
