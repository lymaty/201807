package bao.java.tongyonglei;
     //1.��дһ��Java���򣬲���������Ҫ��  1����дһ��Car�࣬���У�   ���ԣ�Ʒ��(mark)����String����   �۸�price�����ٶȣ�speed������int��
	//2)���ܣ���ʻ��void drive( )��;���ܣ����٣�void speedChange(int newSpeed)���������ٶȸ���speed ��
	//3����������E������main�����д���Car�����������aodi��benchi�Ķ��󲢲������������ԡ�  
	//4�����Ч�����£� 
public class Car extends Auto{
	//�ٶ���һ��С������Car���̳�Auto������ӿյ���CD�����ԣ����Ǽ��٣����ٵķ�����
	private String airConditioner;
	private String CD;
	public Car(){}
	public Car(String mark, String price,int tyrenumber, String color, double weight, double speed,String airConditioner, String cD) {
		super(mark,price,tyrenumber,color,weight, speed);//�̳и��๹�췽����ֵ
		this.airConditioner = airConditioner;
		CD = cD;
	}
	public String toString(){
		return super.toString()+airConditioner+CD;//�̳и���toString����
	}
	/*private String mark;
	private String price;
	private int speed;
	//����Ʒ������
	public void setMark(String mark){
		this.mark=mark;
	}
	//���Ʒ������
	public String getMark(){
		return mark;
	}
	//���췽��,��ֵ
	public  Car(String mark,String price,int speed){
		this.mark=mark;
		this.price=price;
		this.speed=speed;
	}
	//��ӡ
	public void print(){
		System.out.println("������Ʒ����"+this.mark+","+this.mark+"���ļ۸���"+this.price+","+this.mark+"��ԭ�����ٶ���"+this.speed);
	}
	public void drive(){
		System.out.println("�������ڼ�ʻ");
	}
	public void speedChange(int newSpeed){
		this.speed=newSpeed;
		System.out.println(this.mark+"�����ڵ��ٶ���"+this.speed);
	}*/
	public double accelarete(double speed) {
		// TODO Auto-generated method stub
			return speed;
	}
	@Override
	public String speedUp(double speed) {
		// TODO Auto-generated method stub
		return "�Ѽ���:"+(super.getSpeed()+speed);//���ø��෽������ٶ����Ե�ֵ
	}
	@Override
	public void speedDown(double speed) {
		// TODO Auto-generated method stub
		System.out.println("�Ѽ���:"+speed);
	}

}
