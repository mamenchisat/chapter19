package com.hspedu.transformation;

import java.io.*;

/**
 * 项目名：    chapter19
 * 文件名：    CodeQuestion
 * 创建时间：   2022/9/6 10:41
 *
 * @author crazy Chen
 * 描述：
 * 转换流可以将InputStream包装成Reader
 * 也可以将OutPutStream包装成Writer
 * TODO
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\testgbk01.txt";
//        BufferedReader reader = new BufferedReader(new FileReader(filePath));
//        String line = reader.readLine();
//        //默认情况下读取文件按UTF-8编码,但是有乱码问题
//        System.out.println("读取到的内容：" + line);
//        reader.close();
//        InputStreamReader streamReader = new InputStreamReader(new FileInputStream(filePath), "gbk");
//        BufferedReader bufferedReader = new BufferedReader(streamReader);//整合如下
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
