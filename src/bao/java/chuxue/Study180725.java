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
		/*System.out.println("����study725�ļ��У�");
		System.out.println(file.mkdir());
		System.out.println("����io.java�ļ���");
		try {
			System.out.println(file1.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//���Ĵ������ַ���
		/*System.out.println("��ȡ�ļ�");
		try {
			Reader read=new FileReader(file1);
			char[] cb=new char[(int)file1.length()];//����char[]����cb
			read.read(cb);//��ȡ���ݵ�char[]��
			System.out.println("�ļ�����Ϊ��"+cb);//��ӡ���
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//����--���뻺�棬����
		System.out.println("����BufferadReaderʵ�ֻ���");
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
