package bao.java.chuxue;
import bao.java.interfaces.*;
import bao.java.tongyonglei.*;
//final 定义只读，一旦定义，不可修改。使用final修饰的类不可被继承。
//implements实现类对接口的继承,类可以继承多个接口，用“，”隔开
public class Study180717 implements FirstInterface,SecondInterface{
	//20180717
		/*
		public static int a;//static优先分配内存
		static{a=10;}//静态代码块，在类加载时优先分配内存，只加载一次。
		public final int b=4;//使用final修饰的变量是只读变量，必须初始化,且不可更改.
		public static final double pi=3.14159265358979323846;//static final 组合使用定义一个常量。优先分配内存。常量不可赋值。
		//使用static{}(静态代码块)赋值。优先分配内存，且值运行一次
		public static final int D;
		static{D=3;}*/
	
	public static void main(String[] args) {
		/*//static final
		System.out.println(D);
		System.out.println(a);
		//static｛｝优先于｛｝非静态代码块优先于构造方法
		Dog dog1=new Dog();
		Pet p2=dog1;
		//instanceof关键字测试p2是否属于Dog类
		if(p2 instanceof Dog){
		 * System.out.println((Dog)p2);
		 * System.out.println("强制转换Pet类的p2为Dog类");
		 * }else{System.out.println("p2不属于Dog类");}*/
}
	
	
	@Override
	public void ader() {
		// TODO Auto-generated method stub
		
	}

}
