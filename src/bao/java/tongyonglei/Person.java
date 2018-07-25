package bao.java.tongyonglei;
/*4、定义两个类，描述如下： 
4.1定义一个人类Person：
4.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
4.1.2有三个属性：名字、身高、体重
4.2定义一个PersonCreate类：
4.2.1创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
4.2.2分别调用对象的sayHello()方法。*/
public class Person {
	private String name;
	private int age;
	private double height;	
	public Person(){
		super();
	}
	public Person(String name,int age,double height){
		this.name=name;
		this.height=height;
		this.age=age;
	}

	public void sayHello(){
		System.out.println("hello,my name is:"+this.name);
	}

}
