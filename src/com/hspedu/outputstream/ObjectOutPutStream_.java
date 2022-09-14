package com.hspedu.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 项目名：    chapter19
 * 文件名：    ObjectOutPutStream
 * 创建时间：   2022/9/6 9:16
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class ObjectOutPutStream_ {
    public static void main(String[] args) {
        String filePath = "d:\\data.dat";
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(filePath));
            //序列化一个int
            out.writeInt(100);//int->Integer(实现了Serializable)
            out.writeBoolean(true);//boolean->Boolean(实现了Serializable)
            out.writeChar('a');//~~~~~~~~~~~~~~~~
            out.writeDouble(1.02);//~~~~~~~~~~~~~~~~
            out.writeUTF("韩");//String也实现了Serializable
            out.writeObject(new Dog("大黄",4));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class Dog implements Serializable {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}