package bao.java.chuxue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Study180718 {
	//API
	public static void main(String[] args) {
	//String
		/*String a=new String();//String的底层是一个final修饰的char[]数组，数组一旦定义便只读不可修改。
		String b=new String("12");//new创建的对象值存放在堆区的new区域。
		a="Hello world! My name is lisa,Nice to meet you.";//数组“asdfdsgh4wer”存放在堆区的常量池中。只读，不可更改.
		//+拼接字符串的缺点不可释放内存。
		a=a+"What is your name ?";//在堆区的常量池中新建了一个常量放“asdfdsgh4wer123”，而原常量“asdfdsgh4wer”扔在常量池中没有改变。
		char c=a.charAt(11);//检索指定索引的char值，返回char类型
		System.out.println(c);
		String d=a.substring(0, 5);
		System.out.println(d);*/
	/*//Exception 异常-可解决；
		//erro 错误-不可解决，虚拟机错误；
		//手动人为捕获异常
		try{
			int a=9/0;
		    System.out.println(a);
		}catch(Exception e){
			System.out.println("出现异常，0不能做除数");
		}
	//Date类
		Date date=new Date();//引入util.Date;Date的new方法进行过运算，可按ctrl右键查看Date类。
		Date d1=new Date(0);
		System.out.println(d1);
		date.getYear();
		//删除线表示不推荐使用.month从0开始计算到11.getday()从0到6，但星期日为0；getyear()指从1900到现在的年份。
		System.out.println(date.getTime());
		System.out.println(date.getYears());//返回118，从1900到2018
		
		//时间格式化工具--自定义时间输出格式。
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd");//引入txt.SimpleDateFormat;
		String date1=sdf.format(date);//将Date类转换为String类,结果为2018-07-18
		//将String类转换为Class类。
		//要求：1）手动捕获异常即try{}catch(){}；
		//2）add exception declaration添加异常声明，在main方法后加throws ParseException，变为public static void main(String[] args) throws ParseException。
	//throws抛出一个声明
		try {
			Date date2=sdf.parse("eq");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	/*//Scanner--在API中查询Scanner类的其他属性和方法
		//nex()在接收键盘输入的数据时，只能接收数据，回车会留在控制台，next（）下的nextline（）直接接收回收回车。而不执行输出语句.
		//因此一般不将nextline()和next()一起用。
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
