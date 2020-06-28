package com.ludi.demo001.IO;
// 新建文件，文件重命名

import java.io.File;
import java.io.IOException;

public class FileOperate {
    public static void main(String[] args) throws IOException {

        /*

        // 创建新文件
        File file1 = new File("/Users/ludyling/Documents/4_inforTechNote/JAVAweb/TestData/file01.txt");
        if (file1.exists()){
            System.out.println("File is exists!");
        }else {
            boolean newFile = file1.createNewFile();
            System.out.println(newFile);// true
        }

        // 给文件重命名
        // 面向对象的思想：需要先创建一个新文件名的对象(哪怕不存在)并且与file1在同一个路径下，然后再使用'renameTo'方法
        File file2 = new File("/Users/ludyling/Documents/4_inforTechNote/JAVAweb/TestData/file02.txt");
        boolean b = file1.renameTo(file2);
        System.out.println(b);// true
        // 新建文件夹
        File Dir1 = new File("/Users/ludyling/Documents/4_inforTechNote/JAVAweb/TestData/Dir1");
        if (Dir1.exists()){
            System.out.println("Directory is exists!");
        }else {
            boolean mkdirs = Dir1.mkdirs();
            System.out.println(mkdirs);
        }
        // 如果路径不一样会发生什么？？
        // file02被剪切到新文件夹并且被重命名为file03
        File file3 = new File("/Users/ludyling/Documents/4_inforTechNote/JAVAweb/TestData/Dir1/file03.txt");
        boolean b1 = file2.renameTo(file3);
        System.out.println(b1);

        // 创建多个文件备后续使用
        for (int i = 1; i < 5; i++) {
            File newfile = new File("/Users/ludyling/Documents/4_inforTechNote/JAVAweb/TestData/Dir1/file0"+i+".txt");
            if (newfile.exists()){
                System.out.println("File is exists!");
            }else {
                boolean newFile = newfile.createNewFile();
                if (newFile==true){
                    System.out.println("New file 'file0" + i + " is created!");
                }
            }
        }
        */


        // 遍历文件夹下的文件
        File file = new File("/Users/ludyling/Documents/4_inforTechNote/JAVAweb/TestData");
        File[] children = file.listFiles();
        for (File f:children){
            if (f.isDirectory()){
                System.out.println(f + " 是一个文件夹。\n"+f.getName()+" 里面的文件有：");
                File subfilePath = new File(file.getPath()+"/"+f.getName());
                File[] subfile = subfilePath.listFiles();
                for (File sf:subfile){
                    String name = sf.getName();
                    // 指定多个分隔符使用'|'表示或者，有的分隔符需要使用'\\'进行转译
                    String num = name.split("0|\\.")[1];
                    System.out.println("\t0" + num + " : " + sf.getName());
                }
            }else {
                System.out.println(f.getName() + " is a file.");
            }
        }
    }
}

