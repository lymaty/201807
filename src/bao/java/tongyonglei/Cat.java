package bao.java.tongyonglei;
//2.����һ��è�� ���е����� Ʒ��type ���� age  ��ɫ color 
	//1��ͨ�����췽������set�����Ը�ֵ 
	//2����ӡ���è��������Ϣ
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
		return "Ʒ����"+super.getType()+"��������"+super.getAge()+"����ɫ��"+super.getColor();
	}
	
	public void print(){
		System.out.println();
	}

}
