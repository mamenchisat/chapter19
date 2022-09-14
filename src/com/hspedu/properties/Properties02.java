package com.hspedu.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 项目名：    chapter19
 * 文件名：    Properties02
 * 创建时间：   2022/9/6 18:08
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        //使用Properties类读取mysql.properties
        Properties p = new Properties();
        //加载指定配置文件
        p.load(new FileReader("src\\mysql.properties"));
        //把k-v值显示控制台
        //p.list(System.out);
        //根据k获取对应的值
        String user = p.getProperty("user");
        String psw = p.getProperty("pwd");
        System.out.println(user+psw);
    }
}
