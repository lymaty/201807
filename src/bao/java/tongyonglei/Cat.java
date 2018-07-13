package bao.java.tongyonglei;
//2.创建一个猫类 具有的属性 品种type 年龄 age  颜色 color 
	//1）通过构造方法给和set给属性赋值 
	//2）打印输出猫的所有信息
public class Cat extends Pet{
	/*private String type;
	private int age;
	private String color;
	
	public void seType(String type){
		this.type=type;
	}
	public String getType(){
		return type;
	}*/
	public Cat(){}
	public Cat(String type, int age,String color){
		super(type,age,color);
	}
	public String toString(){
		return "品类是"+super.getType()+"，年龄是"+super.getAge()+"，颜色是"+super.getColor();
	}
	
	public void print(){
		System.out.println();
	}

}
