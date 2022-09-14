package com.hspedu.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 项目名：    chapter19
 * 文件名：    BufferedReader
 * 创建时间：   2022/9/5 20:43
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class BufferedReader_ {
    public static void main(String[] args) {
        String filePath = "d:\\test02.txt";
        BufferedReader reader = null;
        String line;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            //按行读取，当返回null时，表示读取完毕。
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
