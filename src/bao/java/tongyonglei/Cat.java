package bao.java.tongyonglei;
//2.����һ��è�� ���е����� Ʒ��type ���� age  ��ɫ color 
	//1��ͨ�����췽������set�����Ը�ֵ 
	//2����ӡ���è��������Ϣ
public class Cat extends Pet{
	public String food;
	private String name;
	/*private int age;
	private String color;
	
	public void seType(String type){
		this.type=type;
	}
	public String getType(){
		return type;
	}*/
	public Cat(){
		super();
	}
	public Cat(String food){
		this.food=food;
	}
	public Cat(String food,String name){
		this(food);
		this.name=name;
	}
	@Override
	public void getSound(){
		System.out.println(this.getType()+"miaomaio");
		
	};
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return "Ʒ����"+super.getType()+"��������"+super.getAge()+"����ɫ��"+super.getColor();
	}
	
	public void print(){
		System.out.println();
	}

}
