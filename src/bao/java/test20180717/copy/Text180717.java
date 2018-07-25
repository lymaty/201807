package bao.java.test20180717.copy;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Text180717 {
	
	
	public static void main(String[] args){
		//2.
		/*double h=100.0;
		flip(h);	*/	
		//1、有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩.
		//程序分析：构建一个学生类，学生号属性、姓名属性和课程类，在课程类中定义数组课程，输入不同成绩。
		
		String[] stu1=new String[5];
		for(int i=0;i<5;i++){
			StudentClass stu=new StudentClass();
			Course grade1=new ClassA();
			Course grade2=new ClassB();
			Course grade3=new ClassC();
			stu1[i]="学号："+stu.getSno()+",姓名:"+stu.getSname()+",课程A成绩："+grade1.grade()+",课程B成绩："+grade2.grade()+",课程C成绩："+grade3.grade()+",平均成绩：";
		System.out.println(stu1[i]);
		}
		//for(String s:stu1){System.out.println(s);}
		/*double h=100.0;
		Scanner input =new Scanner(System.in);
		int count=input.nextInt();
		flip(h,count);*/
	}
	
	//2、一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
	//程序分析：第10次落地的距离和为100+9次反弹的高度的2倍；第10次反弹为第11次落地的高度。
	public static void flip(double h,int count){
		double s=0.0;
		int n;
		/*while(h>0){
			h=0.5*h;
			s=100+s+h*2;
			n++;
			System.out.println((n-1)+"次反弹"+h);
			System.out.println(n+"次落地的距离"+s);
			if(n==10){System.out.println("第10次反弹小球共经过"+s+"米，第10次反弹有"+(h*0.5)+"米高。");break;}
		}*/
		for(n=1;n<=count;n++){
			s=s+h+h/2;
			h=h/2;
			System.out.println(n+"次反弹"+h);
			System.out.println(n+"次落地的距离"+s);
		}
		System.out.println("第"+(n-1)+"次反弹小球共经过"+(s-h)+"米，第"+(n-1)+"次反弹有"+h+"米高。");
	}

}