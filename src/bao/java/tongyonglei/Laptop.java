package bao.java.tongyonglei;
/*2、定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。 
3.1 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值；
3.2  输出笔记本信息的方法
3.3  然后编写一个测试类，测试笔记本类的各个方法。*/
public class Laptop {
	private char color;
	private int cpu;
	public Laptop(){
		super();
	}
	public Laptop(char color,int cpu){
		super();
		this.color=color;
		this.cpu=cpu;
	}
	public String toString(){
		return "笔记本的颜色是"+this.color+"，笔记本的CPU型号是"+this.cpu;
	}
	

}
