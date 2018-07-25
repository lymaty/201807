package bao.java.tongyonglei;

public class Dog extends Pet{//加载Dog类，加载Pet类
	static{System.out.println("Dog静态代码块");}//执行父类静态代码块，执行子类静态代码块
	{System.out.println("Dog非静态代码块");}//执行父类非静态代码块，父类构造方法，子类非静态代码块，子类构造方法
	public Dog(){//运行构造方法
		super();//执行父类构造方法
		System.out.println("Dog构造方法");
	}
	
	public Dog(String type, int age, String color) {
		super(type, age, color);
	}
	@Override
	public  void getSound(){
		System.out.println("wangwang");	
	};
	

}
