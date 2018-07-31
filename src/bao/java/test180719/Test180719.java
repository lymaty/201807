package bao.java.test180719;

import bao.java.test180719.MainPackage.*;
import bao.java.tongyonglei.*;

public class Test180719 {
	public static void main(String[] args) {
		//1，继承
		//创建一个父类Cat和子类Tomcat，父类有一个数据成员，子类继承父类的该数据成员，
		//通过构造函数初始化并显示该数据成员的值。
		/*Tomcat tomcat=new Tomcat("fish");
		System.out.println(tomcat.food);*/
		//2，重写、覆盖、继承
		//建立一个汽车Auto类，包括轮胎个数，汽车颜色，车身重量、速度等属性。并通过不同的构造方法创建实例。?
		//至少要求：??汽车能够加速，减速，停车的功能。
		//再定义一个小汽车类Car，继承Auto，并添加空调、CD等属性，覆盖加速，减速的方法。
		//String mark, String price,int tyrenumber, String color, double weight, double speed,String airConditioner, String cD
		/*Auto a=new Car("aodi","15wan",4,"black",2345,120,"kongtiao","CD");
		System.out.println(a.speedUp(50));
		a.speedDown(40);
		a.stop();
		System.out.println(a);*/
		//3，包、继承
		//创建一个名称为MainPackage的包，使它包含MainClass和MainSubClass类。
		//MainClass类应当包含变量声明，其值从构造方法中输出。MainSubClass类从MainClass派生而来。
		//试执行下列操作：创建一个名称为SamePackage的类，使它导入上述包，并创建一个MainSubClass类的对象。
		/*MainSubClass msc=new MainSubClass(12,"frew");
		System.out.println(msc);*/
		//4、多态。假设要为某个公司编写雇员工资支付程序。
		//一般工人（Worker）按每月工作的天数计算工资；
		//销售人员（Salesman）在基本工资基础上每月还有销售提成；
		//经理（Manager）?每月按固定工资支付，
		//临时工（Floater?）按小时支付。
		//要求设计抽象类（Employee）描述所有雇员的共同特性（如姓名，性别，出生日期，员工类别），含有计算工资的抽象方法computeSalay（），
		//所有员工用该方法计薪。要求用多态实现。
		Employee w=new Eworker("李玉","女","1990-4-6","工人",30,120);
		Employee s=new Esalesman("王毅","男","1989-3-2","销售人员",1200,12000,0.02);
		Employee m=new Emanager("宋玉","男","1987-6-6","经理",10000);
		Employee f=new Efloater("贺礼","女","1992-8-6","小时工",10,40);
		w.computeSalay(6);
		s.computeSalay(7);
		m.computeSalay(8);
		f.computeSalay(9);
		//5、将一个字符串“Hello World!”倒序输出“dlroW olleH”
		String s1=new String("Hello world!e44");
		char[] a=s1.toCharArray();
		StringBuilder s2;
		//方法1
		/*char t;
		for (int i=0;i<(a.length/2);i++) {
			t=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=t;
			System.out.print(a[i]);
		}
		System.out.println();
		for (char c : a) {
			System.out.print(c);
		}*/
	}

}
