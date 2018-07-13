package bao.java.chuxue;
import java.util.*;
import bao.java.tongyonglei.*;
public class Text180711 {
	 
	public static void main(String[] args) {
		//1.编写一个Java程序，并满足如下要求：  1）编写一个Car类，具有：   属性：品牌(mark)——String类型   价格（price）、速度（speed）——int型
		//2)功能：驾驶（void drive( )）;功能：变速（void speedChange(int newSpeed)），把新速度赋给speed 。
		//3）定义主类E，在其main方法中创建Car类的两个对象：aodi和benchi的对象并测试其对象的特性。  
		/*Car aodi=new Car("奥迪","50",80);
		aodi.print();
		aodi.drive();
		aodi.speedChange(120);
		Car benci=new Car("奔驰","100",90);
		benci.print();
		benci.drive();
		benci.speedChange(120);*/
		
		//2.创建一个猫类 具有的属性 品种type 年龄 age  颜色 color 
		//1）通过构造方法给和set给属性赋值 
		//2）打印输出猫的所有信息
		/*Cat jiafei=new Cat(8,"黄白条纹");
		jiafei.setType("加菲猫类");
		jiafei.print();*/
		//3.计算一个整数数组的平均值
		/*Scanner arr=new Scanner(System.in);
		int[] a=new int[10];
		int sum=0;
		double avg;
		//获得一个数组a
		for(int i=0;i<a.length;i++){
			a[i]=arr.nextInt();	
			sum+=a[i];
		}
		for(int s:a){System.out.printf(s+",");}
		avg=(double)sum/a.length;
		System.out.println("10个数的和是"+sum+"，平均数是"+avg);*/
		//给定一个数组，要求写一个expand 函数，把原有数组的长度扩容一倍，并保留原有数组原有的内容
		Random arr=new Random();
		int[] b=new int[10];
		//获得一个随机数组b
		for(int i=0;i<b.length;i++){
			b[i]=arr.nextInt(100);	
		}
		for(int s:b){System.out.print(s+",");}
		System.out.println();
		b=getExpand(b);
		for(int m:b){System.out.print(m+",");}	
	}
	//扩展数组,并对新数组赋值
	public static int[] getExpand (int[] c){
		int[] temp=new int[c.length*2];
		for(int j=0;j<temp.length;j++){
			for(int i=0;i<c.length;i++){
				if(i==j){
					temp[j]=c[i];
				}
				
			}			
		}
		return temp;
		
	}
	
}
