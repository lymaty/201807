package bao.java.chuxue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Study180725 {
	public static void main(String[] args) {
		//File file=new File("D:\\javacode\\study0725");
		File file1=new File("D:\\javacode\\study0725\\io.java");
		/*System.out.println("创建study725文件夹：");
		System.out.println(file.mkdir());
		System.out.println("创建io.java文件：");
		try {
			System.out.println(file1.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//中文传输用字符流
		/*System.out.println("读取文件");
		try {
			Reader read=new FileReader(file1);
			char[] cb=new char[(int)file1.length()];//定义char[]对象cb
			read.read(cb);//读取内容到char[]中
			System.out.println("文件内容为："+cb);//打印输出
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//缓冲--放入缓存，换行
		System.out.println("利用BufferadReader实现换行");
		Reader read1;
		try {
			read1 = new FileReader(file1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//BufferedReader bread=new BufferedReader(read1);
	}

}
