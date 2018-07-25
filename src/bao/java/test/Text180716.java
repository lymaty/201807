package bao.java.test;
import java.util.*;
import bao.java.musicalInstruments.*;
import bao.java.tongyonglei.*;
public class Text180716 {
	/*1、1)定义一个乐器musical instruments 类 定义一个抽象方法 弹奏
	2)定义他的子类 钢琴piano 笛子flute 手封琴accordion  重写父类中的方法 play（） 定义不同的演奏方式
	3)通过赋值多态和传参多态的 形式 调用不同的演奏方式 实现动态调用*/
	//传参多态
	/*public static void playway(MusicalInstruments p){
		p.play();//父类play方法
	}*/
	public static void main(String[] args){
		/*//赋值多态
		MusicalInstruments m1=new Piano("piano");
		MusicalInstruments m2=new Flute("flute");
		MusicalInstruments m3=new Accordion("Accordion");
		playway(m1);
		playway(m2);
		playway(m3);*/
		
		/*2、定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。 
		2.1 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值；
		2.2  输出笔记本信息的方法
		2.3  然后编写一个测试类，测试笔记本类的各个方法。*/
		/*Laptop l1=new Laptop('a',20180716);
		System.out.println(l1);*/
		
		/*3、定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，2个构造器Point()和Point(int x0,y0),以及一个movePoint（int dx,int dy）方法实现点的位置移动，
		创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标*/
		/*Point p1=new Point(2,3);
		p1.yidong();
		p1.movePoint(2, 3);
		Point p2=new Point(3,4);
		p2.yidong();
		p2.movePoint(5, 6);*/
		
		/*4、定义两个类，描述如下： 
		4.1定义一个人类Person：
		4.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
		4.1.2有三个属性：名字、身高、体重
		4.2定义一个PersonCreate类：
		4.2.1创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
		4.2.2分别调用对象的sayHello()方法。*/
		/*Person p1=new Person("zhangsan",33,1.73);
		p1.sayHello();
		Person p2=new Person("lishi",44,1.74);
		p2.sayHello();*/
		
		/*编写一个程序，计算邮局汇款的汇费。如果汇款金额小于100元，汇费为一元，如果金额在100元与5000元之间，
		 * 按1%收取汇费，如果金额大于5000元，汇费为50元。汇款金额由命令行输入*/
		/*int i=0;
		while(true){
			Text180716 m=new Text180716();//调用方法：1）创建该类的对象2）将方法设置为static
			double t=m.scan();
			rem(t);
			i++;
			if(i>9){
				System.out.println("汇费已计算10笔，请重新运行");
				break;
			}
		}*/
		//输入一个0～100的分数，如果不是0～100之间，打印分数无效，根据分数等级打印A,B,C,D,E
		/*int i=0;
		while(true){
			Text180716 m=new Text180716();//调用方法：1）创建该类的对象2）将方法设置为static
			double t=m.scan();
			grade(t);
			i++;
			if(i>9){
				System.out.println("分数已计算10笔，请重新运行");
				break;
			}
		}*/
	}
	//Scanner随机输入
	public double scan(){
		Scanner input=new Scanner(System.in);
		double t=input.nextDouble();
		return t;
	}
	//分数等级划分
	public static void grade(double a){
		if(a<=100&&a>80){System.out.println("该生分数为："+a+",分数等级为A级。");}
		else if(a<=80&&a>60){System.out.println("该生分数为："+a+",分数等级为B级。");}
		else if(a<=60&&a>40){System.out.println("该生分数为："+a+",分数等级为C级。");}
		else if(a<=40&&a>20){System.out.println("该生分数为："+a+",分数等级为D级。");}
		else if(a<=20&&a>=0){System.out.println("该生分数为："+a+",分数等级为E级。");}
		else{System.out.println("该生分数："+a+",超出卷面分数，打印无效。");}
	}
	
	/*//汇款汇费计算
	 public static void rem(double a){
		double b=a;
		double s=0;
		if(b<100.0){System.out.println("汇款金额小于100元，汇费为1元");}
		else if(b<=5000.0){
			s=s+0.01*b;
			System.out.println("汇款金额在100元与5000元之间，汇费为"+s);}
		else{System.out.println("汇款金额大于5000元，汇费为50元");}
	}*/


	
}
