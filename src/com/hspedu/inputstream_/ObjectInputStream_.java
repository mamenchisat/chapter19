package com.hspedu.inputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 项目名：    chapter19
 * 文件名：    ObjectInputStream_
 * 创建时间：   2022/9/6 10:07
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //指定反序列化的文件
        String filePath = "d:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        //注意：读取的顺序一定要和保存的顺序一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        System.out.println(ois.readObject());

        //如果Dog下面的方法要被使用，应该将Dog类放在可以引入的地方

        ois.close();
    }
}
