package bao.java.test180719;
//������Ա��Salesman���ڻ������ʻ�����ÿ�»���������ɣ�
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
		System.out.println(super.getType()+":"+super.getName()+"�ĵ�"+month+"�¹����ǣ�"+(bsalary+sales*tic));
	}
	

}
