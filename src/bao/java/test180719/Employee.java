package bao.java.test180719;
//4、多态。假设要为某个公司编写雇员工资支付程序。
		//临时工（Floater?）按小时支付。
		//要求设计抽象类（Employee）描述所有雇员的共同特性（如姓名，性别，出生日期，员工类别），含有计算工资的抽象方法computeSalay（），
		//所有员工用该方法计薪。要求用多态实现。
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
