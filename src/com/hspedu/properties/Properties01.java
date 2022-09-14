package com.hspedu.properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 项目名：    chapter19
 * 文件名：    Properties01
 * 创建时间：   2022/9/6 17:52
 *
 * @author crazy Chen
 * 描述：  读取Properties文件    TODO
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split("=");
            System.out.println(split[0] + "的值是: " + split[1]);
        }
        bufferedReader.close();
    }
}
