package bao.java.test180719;
//����Manager��?ÿ�°��̶�����֧����
public class Emanager extends Employee {
	private double basesalary;
	public Emanager(){}
	public Emanager(String name, String sex, String date, String type,double basesalary) {
		super(name,sex,date,type);
		this.basesalary = basesalary;
	}

	@Override
	public void computeSalay(int month) {
		// TODO Auto-generated method stub
		System.out.println(super.getType()+":"+super.getName()+"�ĵ�"+month+"�¹����ǣ�"+basesalary);
	}
	

}
