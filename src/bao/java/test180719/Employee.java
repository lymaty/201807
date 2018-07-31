package bao.java.test180719;
//4����̬������ҪΪĳ����˾��д��Ա����֧������
		//��ʱ����Floater?����Сʱ֧����
		//Ҫ����Ƴ����ࣨEmployee���������й�Ա�Ĺ�ͬ���ԣ����������Ա𣬳������ڣ�Ա����𣩣����м��㹤�ʵĳ��󷽷�computeSalay������
		//����Ա���ø÷�����н��Ҫ���ö�̬ʵ�֡�
public abstract class Employee {
	private String name;
	private String sex;
	private String date;
	private String type;
	
	public Employee(){}
	public Employee(String name, String sex, String date, String type) {
		super();
		this.name = name;
		this.sex = sex;
		this.date = date;
		this.type = type;
	}
	public abstract void computeSalay(int month);
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
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	

}
