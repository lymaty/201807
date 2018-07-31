package bao.java.test180719;
//销售人员（Salesman）在基本工资基础上每月还有销售提成；
public class Esalesman extends Employee{
	private double sales;
	private double bsalary;
	private double tic;
	public Esalesman(){}
	public Esalesman(String name, String sex, String date, String type,double sales, double bsalary, double tic) {
		super(name,sex,date,type);
		this.sales = sales;
		this.bsalary = bsalary;
		this.tic = tic;
	}
	@Override
	public void computeSalay(int month) {
		// TODO Auto-generated method stub
		System.out.println(super.getType()+":"+super.getName()+"的第"+month+"月工资是："+(bsalary+sales*tic));
	}
	

}
