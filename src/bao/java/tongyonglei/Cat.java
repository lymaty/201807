package bao.java.tongyonglei;
//2.����һ��è�� ���е����� Ʒ��type ���� age  ��ɫ color 
	//1��ͨ�����췽������set�����Ը�ֵ 
	//2����ӡ���è��������Ϣ
public class Cat extends Pet{
	private String name;
	private int food;
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
	public Cat(int food){
		this.food=food;
	}
	public Cat(int food,String name){
		this(food);
		this.name=name;
	}
	@Override
	public void getSound(){
		System.out.println("miaomaio");
		
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
