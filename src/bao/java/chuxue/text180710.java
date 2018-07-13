package bao.java.chuxue;

import java.util.*;
import javax.swing.plaf.synth.SynthStyle;
import bao.java.tongyonglei.*;
public class text180710 {
	//动态输入一位数组a[7]，并返回数组a
	public int[] input(){
		int[] a=new int[7];
		for(int i=0;i<a.length;i++){
			System.out.println("请输入第"+(i+1)+"个数");
			Scanner arr=new Scanner(System.in);
			a[i]=arr.nextInt();
		}
		return a;
	}
	//按照a[i]数值输出*的个数
	public void print(int[] a ){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<=a[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//1）读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。
		/*int i=0,a,n;
		Scanner input=new Scanner(System.in);
		while(i<=6){
			 a=input.nextInt(); 
			 if(a>=1&&a<=50){
				 String m="";
				 for(n=0;n<a;n++){
					 m+="*";
					}
				 System.out.print(m);
				 System.out.println(n+"个*");
				}else{System.out.println("请输入1到50内的数字");}
			i++;
		}*/
		//方法2
		text180710 t=new text180710();//创建对象
		int[] b=t.input();//调用input()方法
		t.print(b);//调用print（）方法
		
		//2）判断一个年份是平年还是闰年,1)
		Scanner input=new Scanner(System.in);
		int i=0,j=0;
		while(true){		
			int a=input.nextInt();
			if(i<10&&j<10){
				if(a%4==0&&a%100!=0||a%400==0){System.out.println(a+"是闰年");i++;}
				else{System.out.println(a+"是平年");j++;}
			}else{break;}
		}
		System.out.println(i+"个闰年"+j+"个平年");
		//3）在控制台输入值 判断值的大小
		/*Scanner input=new Scanner(System.in);
		int i=0,j=0,k=0,n=0;
		
		while(true){
			double a=input.nextDouble();	
			if(n<5){
				if(-1<=a&&a<0){System.out.println(a+"是-1到0之间的小数");i++;}
				else if(0<=a&&a<=1){System.out.println(a+"是0到1之间的小数");j++;}
				else {System.out.println(a+"不是-1到1间的小数");k++;}
				n++;
			}else{break;}
		}
		System.out.println("共输入"+n+"个小数,其中"+i+"个数是-1到0之间的小数，"+j+"个数是0到1之间的小数，"+k+"个数不是-1到1间的小数。");*/
	   //随机输出Random
		/*Random ran=new Random();
	   int a=ran.nextInt(10);//输出值范围0-9
	   Scanner input=new Scanner(System.in);//动态输入
	   while(true){
	   int b=input.nextInt();
	   if(b<a){System.out.println("xiaola");
	   }else if(b>a){System.out.println("dala");}
	   else {System.out.println("duila");break;//当a=b时跳出循环 }
	   }System.out.println(a);//输出随机输入值*/		
		//4)计算从1开始的连续n个自然数之和，当其和值刚好超过100时结束，求这个n值。
		/*int i=1,sum=0,n=0;
		while(sum<=100){
			sum+=i;
			i++;
			n++;
		}
		System.out.println(n);*/
		//5)定义职员类:员工编号sno 员工部门sdepartment 职位post 姓名 工资salary 工龄s working years 学历s education background  
		//性别 员工电话phone 家庭住址hadress 户籍地址permanent residence address 身份证ID  identity card
		//方法：doWork()
		/*Staff a=new Staff();//默认的
		a.setSno(1002);
		a.setSdet("万事屋");
		a.setSpost("老板");
		a.setSname("坂田银时");
		a.setSalary("100$/月");
		a.setSwy(15);
		a.setSeb("高中");
		a.setSex("男");
		a.setPhone("14521541124");
		a.setHadress("日本东京都新宿区二丁目3号");
		a.setPradress("日本东京都新宿区二丁目3号");
		a.setId("14045519930606457J");
		a.doWork();*/
	}
	
}
