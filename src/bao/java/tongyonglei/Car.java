package bao.java.tongyonglei;
     //1.编写一个Java程序，并满足如下要求：  1）编写一个Car类，具有：   属性：品牌(mark)——String类型   价格（price）、速度（speed）——int型
	//2)功能：驾驶（void drive( )）;功能：变速（void speedChange(int newSpeed)），把新速度赋给speed 。
	//3）定义主类E，在其main方法中创建Car类的两个对象：aodi和benchi的对象并测试其对象的特性。  
	//4）输出效果如下： 
public class Car {
	private String mark;
	private String price;
	private int speed;
	
	/*//设置品牌属性
	public void setMark(String mark){
		this.mark=mark;
	}
	//获得品牌属性
	public String getMark(){
		return mark;
	}*/
	//构造方法,赋值
	public  Car(String mark,String price,int speed){
		this.mark=mark;
		this.price=price;
		this.speed=speed;
	}
	//打印
	public void print(){
		System.out.println("本车的品牌是"+this.mark+","+this.mark+"车的价格是"+this.price+","+this.mark+"车原来的速度是"+this.speed);
	}
	public void drive(){
		System.out.println("本车正在驾驶");
	}
	public void speedChange(int newSpeed){
		this.speed=newSpeed;
		System.out.println(this.mark+"车现在的速度是"+this.speed);
	}

}
