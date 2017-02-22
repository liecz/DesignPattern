package 创建型模式.原型模式;

import java.io.*;

/**
 * Created by liec on 2017-02-22.
 */
public class Prototype implements Cloneable, Serializable {
    private String name;
    private Property property;

    public Prototype(String name, Property property) {
        this.name = name;
        this.property = property;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);
            ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bai);
            return (Prototype) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
