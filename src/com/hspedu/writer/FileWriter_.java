package com.hspedu.writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 项目名：    chapter19
 * 文件名：    FileWriter
 * 创建时间：   2022/9/5 10:19
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String srcPath = "d:\\test02.txt";
        String destPath = "d:\\test01.txt";
        char[] chars = new char[1024];
        int len = 0;
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fw = new FileWriter(destPath);
            fr = new FileReader(srcPath);
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
