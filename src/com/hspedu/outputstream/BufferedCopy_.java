package com.hspedu.outputstream;

import java.io.*;

/**
 * 项目名：    chapter19
 * 文件名：    BufferedCopy_
 * 创建时间：   2022/9/6 8:40
 *
 * @author crazy Chen
 * 描述：
 * 使用包装字节流对二进制文件进行复制
 * 字节流可以操作二进制文件，也可以操作文本文件
 * TODO
 */
public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "d:\\xiaogong.png";
        String destFilePath = "src\\xiaogongdest.png";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        int length = 0;
        byte[] buffer = new byte[1024];
        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
            while ((length = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bis!= null) {
                    bis. close();
                }
                if (bos!= null) {
                    bos. close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
