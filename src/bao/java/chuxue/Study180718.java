package bao.java.chuxue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Study180718 {
	//API
	public static void main(String[] args) {
	//String
		/*String a=new String();//String�ĵײ���һ��final���ε�char[]���飬����һ�������ֻ�������޸ġ�
		String b=new String("12");//new�����Ķ���ֵ����ڶ�����new����
		a="Hello world! My name is lisa,Nice to meet you.";//���顰asdfdsgh4wer������ڶ����ĳ������С�ֻ�������ɸ���.
		//+ƴ���ַ�����ȱ�㲻���ͷ��ڴ档
		a=a+"What is your name ?";//�ڶ����ĳ��������½���һ�������š�asdfdsgh4wer123������ԭ������asdfdsgh4wer�����ڳ�������û�иı䡣
		char c=a.charAt(11);//����ָ��������charֵ������char����
		System.out.println(c);
		String d=a.substring(0, 5);
		System.out.println(d);*/
	/*//Exception �쳣-�ɽ����
		//erro ����-���ɽ�������������
		//�ֶ���Ϊ�����쳣
		try{
			int a=9/0;
		    System.out.println(a);
		}catch(Exception e){
			System.out.println("�����쳣��0����������");
		}
	//Date��
		Date date=new Date();//����util.Date;Date��new�������й����㣬�ɰ�ctrl�Ҽ��鿴Date�ࡣ
		Date d1=new Date(0);
		System.out.println(d1);
		date.getYear();
		//ɾ���߱�ʾ���Ƽ�ʹ��.month��0��ʼ���㵽11.getday()��0��6����������Ϊ0��getyear()ָ��1900�����ڵ���ݡ�
		System.out.println(date.getTime());
		System.out.println(date.getYears());//����118����1900��2018
		
		//ʱ���ʽ������--�Զ���ʱ�������ʽ��
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd");//����txt.SimpleDateFormat;
		String date1=sdf.format(date);//��Date��ת��ΪString��,���Ϊ2018-07-18
		//��String��ת��ΪClass�ࡣ
		//Ҫ��1���ֶ������쳣��try{}catch(){}��
		//2��add exception declaration����쳣��������main�������throws ParseException����Ϊpublic static void main(String[] args) throws ParseException��
	//throws�׳�һ������
		try {
			Date date2=sdf.parse("eq");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	/*//Scanner--��API�в�ѯScanner����������Ժͷ���
		//nex()�ڽ��ռ������������ʱ��ֻ�ܽ������ݣ��س������ڿ���̨��next�����µ�nextline����ֱ�ӽ��ջ��ջس�������ִ��������.
		//���һ�㲻��nextline()��next()һ���á�
		Scanner input=new Scanner(System.in);
		String a=input.next();
		System.out.println("next()"+a);
		String d=input.nextLine();
		System.out.println("nextline1()"+d);
		String c=input.next();
		System.out.println("next2()"+c);
		String b=input.nextLine();
		System.out.println("nextline2()"+b);*/
	}
	
	

}
