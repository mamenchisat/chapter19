package com.hspedu.transformation;

import java.io.*;

/**
 * 项目名：    chapter19
 * 文件名：    OutputStreamWriter_
 * 创建时间：   2022/9/6 17:36
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\saveGbk.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "gbk"));
        bufferedWriter.write("我是一个测试");
        bufferedWriter.newLine();
        bufferedWriter.write("我是一个测试");
        bufferedWriter.close();
    }
}
