package com.ludi.demo001.IO;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        // 这里路径写成'~/ludyling/Desktop/TestData/data/e2f1_NULL/summary.tsv'会返回"文件不存在！"
        File file = new File("/Users/ludyling/Desktop/TestData/data/e2f1_NULL/");
        if (file.exists()){
            System.out.println(file.getName());//e2f1_NULL
            System.out.println(file.length());//192
            System.out.println(file.getParent());//返回上一层目录 /Users/ludyling/Desktop/TestData/data
            System.out.println(file.getParentFile()); // /Users/ludyling/Desktop/TestData/data
            System.out.println(file.getParentFile().isDirectory()); // true
            System.out.println(file.isFile()); // false
            System.out.println(file.getParentFile().isFile()); // false
            System.out.println(file.isDirectory()); // true
            System.out.println(file.getPath());// /Users/ludyling/Desktop/TestData/data/e2f1_NULL
        }else {
            throw new RuntimeException("文件不存在！");
        }
    }
}
