package com.hspedu.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 项目名：    chapter19
 * 文件名：    BufferedWriter_
 * 创建时间：   2022/9/5 21:10
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class BufferedWriter_ {
    public static void main(String[] args) {
        String filePath = "d:\\news1.txt";
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
            bufferedWriter.write("hello.world!");
            bufferedWriter.newLine();
            bufferedWriter.write("hello.world!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
