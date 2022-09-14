package com.hspedu.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 项目名：    chapter19
 * 文件名：    FileCopy
 * 创建时间：   2022/9/5 9:03
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝
        String imgPath = "d:\\xiaogong.png";
        String destPath = "d:\\图片\\xiaogong.png";
        int readLength = 0;
        byte[] imgData = new byte[1024];
        FileOutputStream fos = null;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(imgPath);
            fos = new FileOutputStream(destPath);
            while ((readLength=fileInputStream.read(imgData))!=-1){
                fos.write(imgData, 0, readLength);
            }
            System.out.println("成功拷贝");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
