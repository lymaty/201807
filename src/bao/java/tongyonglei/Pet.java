package bao.java.tongyonglei;

public abstract class Pet {
	private String type;
	private int age;
	private String color;
	static{
		System.out.println("Pet��̬�����");
	}
	{
		System.out.println("Pet�Ǿ�̬�����");
	}
	public Pet(){
		super();
		System.out.println("Pet���췽��");
	}
	public Pet(String type,int age,String color){
		this.type=type;
		this.age=age;
		this.color=color;	
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract void getSound();
}
