package bao.java.tongyonglei;
/*4�����������࣬�������£� 
4.1����һ������Person��
4.1.1����һ������sayHello()��������Է������ʺ��hello,my name is XXX��
4.1.2���������ԣ����֡���ߡ�����
4.2����һ��PersonCreate�ࣺ
4.2.1�����������󣬷ֱ���zhangsan��33�꣬1.73��lishi��44��1.74
4.2.2�ֱ���ö����sayHello()������*/
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
