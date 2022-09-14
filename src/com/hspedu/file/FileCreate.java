package com.hspedu.file;

import java.io.File;
import java.io.IOException;

/**
 * 项目名：    chapter19
 * 文件名：    FileCreat
 * 创建时间：   2022/9/4 14:52
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class FileCreate {
    public static void main(String[] args) {
        create01();
        create02();
        create03();

    }
    public static void create01(){
        String path = "D:\\news1.txt";
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("文件创建成功");
    }
    public static void create02() {
        File parentFile = new File("d:\\");
        String filename = "news2.txt";
        File file = new File(parentFile, filename);//到这里file对象只是一个java虚拟机里的对象；
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void create03() {
        String parentPath = "d:\\";
        String filename = "news3.txt";
        File file = new File(parentPath, filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
