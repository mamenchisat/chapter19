package com.hspedu.outputstream;

import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 项目名：    chapter19
 * 文件名：    OutPutStream
 * 创建时间：   2022/9/4 17:12
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class FileOutPutStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() {
        FileOutputStream fileOutputStream = null;
        String filePath = "d:\\test01.txt";
        try {
            //这种方式会覆盖原来的文件
            //fileOutputStream = new FileOutputStream(filePath,true); 写入内容会追加到文件最后
            fileOutputStream = new FileOutputStream(filePath,true);
            //写入字节
            fileOutputStream.write("hello world".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fileOutputStream.close();
            } catch (Exception e) {
            }
        }


    }
}
