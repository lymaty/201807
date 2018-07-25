package bao.java.chuxue;

import bao.java.tongyonglei.ATM;

public class Study180720 {
	public static void main(String[] args){
		Child c1 = new Child();
		Child c2 = new Child();
		
		}
}
 class Person{
	Person(){
		System.out.println("父类构造方法");}
	static{
	System.out.println("父类静态代码块");
	}
	{
	System.out.println("父类非静态代码块");
	}
	}
 class Child extends Person{
	Child(){
	System.out.println("子类构造方法");
	}
	static{
	System.out.println("子类静态代码块");
	}
	{
	System.out.println("子类非静态代码块");
	}

	}