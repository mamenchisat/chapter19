package com.hspedu.properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 项目名：    chapter19
 * 文件名：    Properties03
 * 创建时间：   2022/9/6 18:16
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        //使用Properties创建配置文件，修改文件内容
        Properties properties = new Properties();
        //文件不存在set就是创建，文件存在set就是修改
        properties.setProperty("charset","utf-8");
        properties.setProperty("user","汤姆丁");//保存是汤姆的unicode码
        properties.setProperty("pwd","abc111");
        //将k-v存储到文件中即可
        properties.store(new FileWriter("src\\mysql02.properties"),null);
        System.out.println("保存成功");

    }
}
