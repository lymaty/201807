package bao.java.chuxue;

import java.util.*;
import java.io.*;
public class Study180724 {
	public static void main(String[] args) {
		//Set���� 1�����򼯺�2��Ԫ�ز��ظ�
		/*Set <String> set1=new HashSet<>();//����HashCode��ֵ���
		for(int i=0;i<=10;i++){
			set1.add("abc"+i+",");//�������
		}
		set1.add("abc012,");//���ظ�
		for (String string1 : set1) {//����鿴ɫͼset1
			System.out.print(string1);
		}
		System.out.println();
		Iterator it=set1.iterator();//����������setֵ��ԭ��˳������������
		while(it.hasNext()){//set1.iterator().hasNext();--ÿ��ѭ����ȡһ��set1.iterator;
			System.out.print(it.next());
		}
		System.out.println();
		boolean contains = set1.contains("abc"+10+",");
		int size = set1.size();
		int hashCode = set1.hashCode();
		System.out.println(contains+"��"+size+"��"+hashCode);
		Set<String> set2=new LinkedHashSet<>();  //��������˳�����
		//set2=(LinkedHashSet)set1;--LinkedHashSet extends HashSet,���set1ǿ��ת��Ϊset2��������ת�ͣ����������ת���쳣��
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
		//map(k,v);����
		//Map<Integer,String> map=new map<>();
		//file
		/*File file4=new File("D:\\hh\\h\\h.java");
		System.out.println(file4.mkdir());;
		try {
			System.out.println(file4.createNewFile());;//�����ļ�
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		File file2=new File("D:\\lisa\\eclipse\\pro\\20180709chuxue\\src\\bao\\java\\chuxue\\Study180717.java");
		File file1 =new File("D:/�γ���Ƶ/java/2018-7-9/7-9��ҵ.txt");
	/*	Reader raed=new FileReader(file2);*/
		/*System.out.println(file1.isHidden());
		System.out.println(file1.length());
		System.out.println(file1.setReadOnly());//�����ļ�����Ϊֻ��
		System.out.println(file1.canExecute());
		System.out.println(file1.getCanonicalPath());//�׳��쳣IOException
		System.out.println(file1.isDirectory());//�ж��Ƿ�Ϊ�ļ���
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.isFile());
		System.out.println(file1.canWrite());
		System.out.println(file1.canRead());*/
		/*try {
			//��Java��Ӳ�̼佨��һ��ͨ��//�׳��쳣FileNotFoundException
			InputStream io1=new FileInputStream(file1);//file1�ĵ�ַ
			//��ȡ�ļ�������
			byte[] b=new byte[(int) file1.length()];
			int a=io1.read(b);//���ļ����ݷ���byte[] b�С�//�׳��쳣IOException
			//System.out.println(io1.read());//�����ļ���һ���ֽڵ����ݡ����ֽ��ѱ���ȡ���򷵻�-1.
			System.out.println(a);*///����a�����ļ��Ĵ�С����byte[] b�Ĵ�С��
			//�鿴�ļ����ݡ�1������for����ļ����ݣ�����Ϊacsii����ſ�ǿתΪchar��2������ַ���String
			//String c=new String(b);//���ֽ�����bת�����ַ���c���ļ����뼶��Java����Ӧ�õı��뼶��ͬ�򲻻���ֽ�����
			//System.out.print(c);
//			System.out.println();
//			for (byte d : b) {
//				System.out.print((char)d);//����Ϊacsii(0~127,����������(UtF-8))����ſ�ǿתΪchar                                                                                            
//			}
//			io1.close();//�ر�ͨ��
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		File file3=new File("D://javacode//java0724.java");
		try {
			//����ͨ��
			OutputStream op1=new FileOutputStream(file3);//�Զ������ļ�file3
			String sy="public class Add{public static void main(String[] args){System.out.println('hello world!i'm ����,nice to meet you.')}}";
			byte[] b=sy.getBytes();//���ַ���ת��Ϊbyte[]
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
