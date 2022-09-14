package com.hspedu.decorator;

/**
 * 项目名：    chapter19
 * 文件名：    Reader_
 * 创建时间：   2022/9/5 11:25
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public abstract class Reader_ {
    public abstract void readFile();
}
class FileReader_ extends Reader_ {//节点流
    @Override
    public void readFile(){
        System.out.println("读取文件");
    }
}
class StringReader_ extends Reader_ {//节点流
    @Override
    public void readFile() {
        System.out.println("读取字符串");
    }
}
class BufferedReader_ extends Reader_ {//做成处理流
    private Reader_ reader;

    public BufferedReader_(Reader_ reader) {
        this.reader = reader;
    }

    public void readFile(){
        reader.readFile();
    }
    public void readFiles(int nums) {
        for (int i = 0; i < nums; i++) {
            reader.readFile();
        }
    }

}

class test{
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFile();
        bufferedReader_.readFiles(3);
        BufferedReader_ bufferedReader_1 = new BufferedReader_(new StringReader_());
        bufferedReader_1.readFile();
        bufferedReader_1.readFiles(3);
    }
}