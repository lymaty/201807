package bao.java.tongyonglei;

public class Worker {
	private int wno;
	private String name;
	private int age;
	private double salary;
	private Address address;
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	public Worker(){}
	public Worker(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public Worker(String name,int age,double salary,Address address){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	/**
	 * @return the wno
	 */
	public int getWno() {
		return wno;
	}
	/**
	 * @param wno the wno to set
	 */
	public void setWno(int wno) {
		this.wno = wno;
	}
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void work(){
		System.out.println("����Ϊ"+wno+"��"+name+"����"+"work");
	}
	public String toString(){
		return "������"+this.name+",���䣺"+this.age+",���ʣ�"+this.salary+",��ַ��"+this.address;
	}

}
