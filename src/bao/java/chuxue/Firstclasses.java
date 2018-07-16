package bao.java.chuxue;
import java.util.*;
import bao.java.tongyonglei.*;
public class Firstclasses {
	/**
	 * @param args
	 */
	public static void test(Pet p){
		
	}
	//所有待执行语句应写入main方法中
	public static void main(String[] args){
		Pet p1=new Cat();
		Pet p2=new Dog();
		
		//180712--继承
		/*Cat jiafei=new Cat("加菲猫类",8,"黄白条纹");
		jiafei.setType("加菲猫类");
	jiafei.print();
		System.out.println(jiafei);*/
		
		//acsii表
		/*char a='z';
		 * int b=a-3;
		 * char c=(char)(a-3);
		 * System.out.println(a);
		 * System.out.println(b);*/
		//运算
		/*int m=1234;
		int a,b,c,d,n;
		a=m/1000;
		b=m%1000/100;
		c=m%100/10;
		d=m%10;
		n=d*1000+c*100+b*10+a;
		System.out.println(n);*/
		
		//动态输入scanner
		/*
		 scanner input=new scanner(system.in);
		 int a=input.nextInt();
		 System.out.println(a);
		 */
		//流程控制语句-条件语句		
		/*if(a<4){
			System.out.println("a>4");
		}*/
		//选择语句
		/*switch(a){
		case 1:System.out.println("a=1");
		break;
		case 2:System.out.println("a=2");
		case 3:System.out.println("a=3");
		break;
		default:System.out.println("buchengli");
		break;
		}*/
		/*while(a<=10){
			System.out.println(a);
			a++;
		}*/
		//a++先用再执行/++a先执行后用/a--/--a
		/*int a=2,b=1;
		System.out.println(a);//2,1
		a=a++;
		a=++a;
		b=b++;
		System.out.println(a);
		System.out.println(b);*///3,1		
		//循环语句
		/*do{
			@SuppressWarnings("resource")
			Scanner input=new Scanner(System.in);
			a=input.nextInt();
			int b=0;
			while(a<=10){
				a=++a;
				System.out.println(a);
				b++;			
			}
			System.out.println(b);
				
		}while(true);*/
		//三目运算符int c=条件？值1：值2（若条件为真则取值1，若为假则取值2）
		/*int a,b,j=0,c;
		double t=12.23;
		Scanner input=new Scanner(System.in);//scanner动态输入
		do{ 
			a=input.nextInt();
			b=input.nextInt();
			c=input.nextInt();
			System.out.printf("%d %d %d\n",a,b,c);//同时输出多个变量
			System.out.println(a+""+b+""+c+"");
			int m= a<b&&a<c++?1:0;
			System.out.println(m);
			System.out.println(c);
			j++;
		}while(j<3);*/
		/*Student stu = new Student();//用new关键字创建Student类的对象stu
		//stu.sno=20180605;//将4赋值给对象stu的sno属性，即学号为4的学生
		stu.setSno(5);
		System.out.println(stu.getSno());
		stu.setSsex(true);
		System.out.println(stu.getSsex());
		int a=3,b=4,c=5,d=2;
		boolean m=!(a+b>=d)&&b-a<d?true:false;
		byte n=-34;
		char t=(char)n;
		System.out.println();*/
		
		/*//定义数组a长度为20，
		int[] a=new int[20];
		//数组下标从0开始，可用数组属性.length获得数组长度。
		for(int i=0;i<a.length;i+=2){
			a[i]=i+10;
			System.out.println(i);
			System.out.println(a[i]);
		}
		//查看数组内容，可用增强for
		for(int s : a){System.out.println(s);}*/
		//键盘输入数组arr[]{23,3,56,7,89,90,2,12,54,43}
		/*int[] arr=new int[10];
		Scanner input=new Scanner(System.in);
		for(int n=0;n<arr.length;n++)
		{
			arr[n]=input.nextInt();
			System.out.print(arr[n]+",");
		}
		System.out.println();
		//冒泡排序：相邻位置数据两两比较，排序次数递减，比较次数递增；
		//排序循环次数
		for(int i=0;i<arr.length-1;i++){
			//比较算法
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}		
		}
		for(int s:arr){
			System.out.print(s+",");
		}*/
		
		
	}

}
