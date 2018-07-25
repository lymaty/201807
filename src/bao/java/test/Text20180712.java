package bao.java.test;
import java.util.*;

import bao.java.chuxue.Firstclasses;
import bao.java.graph.*;
import bao.java.tongyonglei.*;
public class Text20180712 {
	public static void main(String[] args) {
		Pet p1=new Cat();
		Pet p2=new Dog();
		Firstclasses.test(p2);
	    //1、编写程序，用一个for循环计算 1+3+5+7…+99的值，并输出计算结果。
		/*int a,sum=0;
		for(a=1;a<=100;a+=2){
			sum+=a;
		}
		System.out.println(sum);*/
		//2、输出1~100内前5个可以被3整除的数。
		/*int i=1;
		for(int a=1;a<=100;a++){
			if(i<=5){	
				if(a%3==0){
					System.out.println(a+"可以被3整除");
					i++;
					}
				}
			}*/
		//3、switch练习
		// 键盘输入数字0-6,满足以下条件。0--->输出星期日，1--->输出星期一，2--->输出星期二，3--->输出星期三， 4--->输出星期四，5--->输出星期五，6--->输出星期六
		/*Scanner input=new Scanner(System.in);
		while(true){
			int a=input.nextInt();
			switch(a){
			case 0:System.out.println("星期日");
			break;
			case 1:System.out.println("星期一");
			break;
			case 2:System.out.println("星期二");
			break;
			case 3:System.out.println("星期三");
			break;
			case 4:System.out.println("星期四");
			break;
			case 5:System.out.println("星期五");
			break;
			case 6:System.out.println("星期六");
			break;	
			default:System.out.println("请输入0到6的数字,若希望结束可输入1000");
			break;
			case 1000:System.out.println("结束输入");
			return;
			}
		}*/
		//4、构造方法与重载，创建一个类，为该类定义三个构造函数，分别执行下列操作：
		//1)传递两个整数值并找出其中较大的一个值 ，2）传递三个double值并求出其乘积，3）在main方法中测试构造函数的调用。
		
		/*Random rand=new Random();
		int value1=rand.nextInt(20);
		int value2=rand.nextInt(20);	
		Count c=new Count(value1,value2);
		c.Compear();
		Scanner input=new Scanner(System.in);
		double i=input.nextDouble();
		double j=input.nextDouble();
		double k=input.nextDouble();
		Count a=new Count(i,j,k);
		a.Product();*/
		
		//5、定义一个学生类 属性包括学号int， 姓名string, 年龄int, 身高double, 体重double, 成绩double  
		//1)通过构造方法或者set方法给属性赋值
		//2)在类中定义一个考试的方法 方法中输出"姓名"考试成绩为“成绩”
		//3)重写一下toString（） 在方法中输出学生的全部信息 姓名为“”年龄为“”身高是。。。。。。
		//4)在main方法中进行测试 测试时 创建三个学生类的对象 把他们放到一个数组中并查看每个对象的详细信息和考试成绩.
		/*Student a=new Student(20180626,"李芳",18,165,50.5,592.5);
		a.studentExam();
		System.out.println(a);*/
		Student stu1=new Student();
		Student stu2=new Student();
		Student stu3=new Student();
		stu1.setSage(12);
		stu1.setSname("d");
		stu2.setSgrade(567);
		stu3.setSname("ewde");
		Student[] stu=new Student[]{stu1,stu2,stu3};//创建数组对象stu[]。
		for(Student m :stu ){System.out.println(m);}
		System.out.println(stu1);
		/*System.out.println(stu[0].getSage()+stu[1].getSgrade()+stu[2].getSname());
				new Student(20180627,"林渊",19,180,65,570);*/
		/*stu[1]=new Student(20180601,"深白",17,170,55,740);
		stu[2]=new Student(20180627,"深蓝",18,185,64,600);*/
		/*for(Student s:stu){System.out.println(s);}*/
		//6、 定义一个图形类 
		//1)有计算面积和计算周长的抽象方法
		//2)创建图形类的子类 圆形 长方形 正方形 分别定义自己的计算面积和计算周长
		//3)创建main方法 进行测试
		/*Circle a=new Circle(3.4);
		Rectangle b=new Rectangle(34,45);*/
		/*Square c=new Square(8);*/
		/*System.out.println("圆形的周长是"+a.graphPerimeter()+"圆形的面积是"+a.graphArea());
		System.out.println("长方形的周长是"+b.graphPerimeter()+"长方形的面积是"+b.graphArea());
		System.out.println("正方形的周长是"+c.graphPerimeter()+"正方形的面积是"+c.graphArea());
		System.out.println(a+";"+b+";"+c+".");*/
	
	}

}

