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
		System.out.println("���๹�췽��");}
	static{
	System.out.println("���ྲ̬�����");
	}
	{
	System.out.println("����Ǿ�̬�����");
	}
	}
 class Child extends Person{
	Child(){
	System.out.println("���๹�췽��");
	}
	static{
	System.out.println("���ྲ̬�����");
	}
	{
	System.out.println("����Ǿ�̬�����");
	}

	}