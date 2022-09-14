package com.hspedu.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 项目名：    chapter19
 * 文件名：    FileReader_
 * 创建时间：   2022/9/5 9:56
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class FileReader_ {
    public static void main(String[] args) {
        int dataLength = 0;
        char[] fileContent = new char[1024];
        String filePath = "d:\\test01.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            while ((dataLength = fileReader.read(fileContent)) != -1) {
                System.out.print(new String(fileContent,0,dataLength));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
