package com.hspedu.file;

import org.testng.annotations.Test;

import java.io.File;

/**
 * 项目名：    chapter19
 * 文件名：    FileInformation
 * 创建时间：   2022/9/4 15:11
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info() {
        File file = new File("d:\\news1.txt");
        System.out.println(file.getName());
        System.out.println(file.length());
    }
}

