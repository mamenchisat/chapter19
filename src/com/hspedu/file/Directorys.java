package com.hspedu.file;

import org.testng.annotations.Test;

import java.io.File;

/**
 * 项目名：    chapter19
 * 文件名：    Directorys
 * 创建时间：   2022/9/4 15:23
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Directorys {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        String filepath = "d:\\news1.txt";
        File file = new File(filepath);
        if (file.exists()) {
            System.out.println("文件存在");
            if(file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("文件不存在");
        }
    }
}
