package bao.java.tongyonglei;

public class Dog extends Pet{
	public Dog(){
		super();
	}
	
	public Dog(String type, int age, String color) {
		super(type, age, color);
	}
	@Override
	public  void getSound(){
		System.out.println("wangwang");	
	};
	
	

}
