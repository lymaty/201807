package bao.java.test180719;
//一般工人（Worker）按每月工作的天数计算工资；
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
		System.out.println(super.getType()+":"+super.getName()+"的第"+month+"月工资是："+day*dsalary);
	}

}
