package bao.java.test180719;
//һ�㹤�ˣ�Worker����ÿ�¹������������㹤�ʣ�
public class Eworker extends Employee{
	private int day;
	private double dsalary;
	public Eworker(){}
	public Eworker(String name, String sex, String date, String type,int day, double dsalary) {
		super(name,sex,date,type);
		this.day = day;
		this.dsalary = dsalary;
	}

	@Override
	public void computeSalay(int month) {
		// TODO Auto-generated method stub
		System.out.println(super.getType()+":"+super.getName()+"�ĵ�"+month+"�¹����ǣ�"+day*dsalary);
	}

}
