package com.hspedu.inputstream_;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 项目名：    chapter19
 * 文件名：    FileInputStream
 * 创建时间：   2022/9/4 16:18
 *
 * @author crazy Chen
 * 描述：   文件--->程序   TODO
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {
        String filePath = "d:\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 使用read(byte[] b)来读取文件，提高效率
     */
    @Test
    public void readFile02() {
        String filePath = "d:\\hello.txt";
        int readLength = 0;
        byte[] buffer = new byte[1024];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //如果读取正常，返回实际读取的字节数
            while ((readLength=fileInputStream.read(buffer)) != -1) {
                System.out.print(new String(buffer,0,readLength));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
