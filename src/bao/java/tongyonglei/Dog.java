package bao.java.tongyonglei;

public class Dog extends Pet{//����Dog�࣬����Pet��
	static{System.out.println("Dog��̬�����");}//ִ�и��ྲ̬����飬ִ�����ྲ̬�����
	{System.out.println("Dog�Ǿ�̬�����");}//ִ�и���Ǿ�̬����飬���๹�췽��������Ǿ�̬����飬���๹�췽��
	public Dog(){//���й��췽��
		super();//ִ�и��๹�췽��
		System.out.println("Dog���췽��");
	}
	
	public Dog(String type, int age, String color) {
		super(type, age, color);
	}
	@Override
	public  void getSound(){
		System.out.println("wangwang");	
	};
	

}
