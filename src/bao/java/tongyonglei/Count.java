package bao.java.tongyonglei;
import java.util.*;
//4、构造方法与重载，创建一个类，为该类定义三个构造函数，分别执行下列操作：
		//1)传递两个整数值并找出其中较大的一个值 ，2）传递三个double值并求出其乘积，3）在main方法中测试构造函数的调用。
public class Count {
	private int value1;
	private int value2;
	private double i;
	private double j;
	private double k;
	public Count(){
		//赋值用，不要在类里写
		/*Random a=new Random();
		this.value1=a.nextInt(20);
		this.value2=a.nextInt(20);*/	
		/*this.i=input.nextDouble();
		this.j=input.nextDouble();
		this.k=input.nextDouble();*/
			}
	public Count(int a,int b){
		this.value1=a;
		this.value2=b;
	}
	public Count(double i,double j,double k){
		this.i=i;
		this.j=j;
		this.k=k;	
	}
	public void Compear(){
		
		if(this.value1>this.value2){System.out.println("输入的两个数值"+this.value1+"和"+this.value2+"中较大的数是"+this.value1);}
		else{System.out.println("输入的两个数值"+this.value1+"和"+this.value2+"中较大的数是"+this.value2);}
	}
	public void Product(){
		/*double pro=this.i*this.j*this.k;*///尽量减少计算，提高计算效率
		System.out.println("输入的三个数值的乘积是"+this.i*this.j*this.k);
	}

}
