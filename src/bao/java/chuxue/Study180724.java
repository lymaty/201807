package bao.java.chuxue;

import java.util.*;
import java.io.*;
public class Study180724 {
	public static void main(String[] args) {
		//Set集合 1》无序集合2》元素不重复
		/*Set <String> set1=new HashSet<>();//按照HashCode的值输出
		for(int i=0;i<=10;i++){
			set1.add("abc"+i+",");//添加数据
		}
		set1.add("abc012,");//不重复
		for (String string1 : set1) {//输出查看色图set1
			System.out.print(string1);
		}
		System.out.println();
		Iterator it=set1.iterator();//迭代器：将set值按原有顺序放入迭代器。
		while(it.hasNext()){//set1.iterator().hasNext();--每次循环获取一次set1.iterator;
			System.out.print(it.next());
		}
		System.out.println();
		boolean contains = set1.contains("abc"+10+",");
		int size = set1.size();
		int hashCode = set1.hashCode();
		System.out.println(contains+"，"+size+"，"+hashCode);
		Set<String> set2=new LinkedHashSet<>();  //按照输入顺序输出
		//set2=(LinkedHashSet)set1;--LinkedHashSet extends HashSet,因此set1强制转换为set2属于向下转型，会出现类型转换异常。
		for(int i=1;i<set1.size()-1;i+=2){
			set2.add("er"+i+",");
		}
		for (String s2 : set2) {
			System.out.print(s2);
		}
		System.out.println();
		Iterator<String> ite2 = set2.iterator();
		while(ite2.hasNext()){
			System.out.print(ite2.next());
		}
		System.out.println();
		Set<String> set3=new TreeSet();
		for(int i=1;i<set1.size()*2;i++){
			set3.add("er"+i+",");
		}
		for (String s3 : set3) {
			System.out.print(s3);
		}
		System.out.println();
		set3.remove("er1,");
		Iterator<String> ite3 = set3.iterator();
		while(ite3.hasNext()){
			System.out.print(ite3.next());
		}
		System.out.println();
		set3.clear();
		while(ite3.hasNext()){
			System.out.print(ite3.next());
		}
		System.out.println(set3.size());*/
		//map(k,v);集合
		//Map<Integer,String> map=new map<>();
		//file
		/*File file4=new File("D:\\hh\\h\\h.java");
		System.out.println(file4.mkdir());;
		try {
			System.out.println(file4.createNewFile());;//创建文件
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		File file2=new File("D:\\lisa\\eclipse\\pro\\20180709chuxue\\src\\bao\\java\\chuxue\\Study180717.java");
		File file1 =new File("D:/课程视频/java/2018-7-9/7-9作业.txt");
	/*	Reader raed=new FileReader(file2);*/
		/*System.out.println(file1.isHidden());
		System.out.println(file1.length());
		System.out.println(file1.setReadOnly());//设置文件属性为只读
		System.out.println(file1.canExecute());
		System.out.println(file1.getCanonicalPath());//抛出异常IOException
		System.out.println(file1.isDirectory());//判断是否为文件夹
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.isFile());
		System.out.println(file1.canWrite());
		System.out.println(file1.canRead());*/
		/*try {
			//在Java与硬盘间建立一个通道//抛出异常FileNotFoundException
			InputStream io1=new FileInputStream(file1);//file1的地址
			//读取文件中内容
			byte[] b=new byte[(int) file1.length()];
			int a=io1.read(b);//将文件内容放入byte[] b中。//抛出异常IOException
			//System.out.println(io1.read());//返回文件的一个字节的内容。当字节已被获取，则返回-1.
			System.out.println(a);*///定义a接收文件的大小，即byte[] b的大小。
			//查看文件内容。1）利用for输出文件内容，内容为acsii表序号可强转为char。2）输出字符串String
			//String c=new String(b);//将字节数组b转换成字符串c，文件编码级与Java程序应用的编码级相同则不会错，字节问题
			//System.out.print(c);
//			System.out.println();
//			for (byte d : b) {
//				System.out.print((char)d);//内容为acsii(0~127,不包括汉字(UtF-8))表序号可强转为char                                                                                            
//			}
//			io1.close();//关闭通道
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		File file3=new File("D://javacode//java0724.java");
		try {
			//创建通道
			OutputStream op1=new FileOutputStream(file3);//自动创建文件file3
			String sy="public class Add{public static void main(String[] args){System.out.println('hello world!i'm 李明,nice to meet you.')}}";
			byte[] b=sy.getBytes();//将字符串转换为byte[]
			op1.write(b);
			op1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
}
