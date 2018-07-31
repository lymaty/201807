package bao.java.test180719;

import bao.java.tongyonglei.*;

public class Tomcat extends Cat{
	//1，继承
	//创建一个父类Cat和子类Tomcat，父类有一个数据成员，子类继承父类的该数据成员，
	//通过构造函数初始化并显示该数据成员的值。
    public Tomcat(){}
	public Tomcat(String food){
		super.food=food;
	}
	public String food(){
		return super.food;
	}
	

}
