package bao.java.test180719;
//��ʱ����Floater?����Сʱ֧����
public class Efloater extends Employee{
	private double hours;
	private double hsalary;
	public Efloater(){}
	public Efloater(String name, String sex, String date, String type,double hours, double hsalary) {
		super(name,sex,date,type);
		this.hours = hours;
		this.hsalary = hsalary;
	}
	@Override
	public void computeSalay(int month) {
		// TODO Auto-generated method stub
		System.out.println(super.getType()+":"+super.getName()+"�ĵ�"+month+"�¹����ǣ�"+(hours*hsalary));
	}
	

}
