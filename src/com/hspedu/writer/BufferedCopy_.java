package com.hspedu.writer;

import java.io.*;

/**
 * 项目名：    chapter19
 * 文件名：    BufferedCopy
 * 创建时间：   2022/9/5 21:30
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class BufferedCopy_ {
    //不可用于拷贝二进制文件
    public static void main(String[] args) {
        String srcFilePath = "d:\\test01.txt";
        String destFilePath = "d:\\bufferCopy.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(srcFilePath));
            writer = new BufferedWriter(new FileWriter(destFilePath));
            String line = null;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null && writer != null) {
                try {
                    reader.close();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
