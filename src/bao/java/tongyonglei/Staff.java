package bao.java.tongyonglei;

public class Staff {
	//定义职员类:员工编号sno 员工部门sdepartment 职位post 姓名 工资salary 工龄s working years 学历s education background  
	//性别 员工电话phone 家庭住址hadress 户籍地址permanent residence address 身份证ID  identity card
	//方法：doWork()
	private int sno;
	private String sdep;
	private String spost;
	private String sname;
	private String salary;
	private int swy;
	private String seb;
	private String sex;
	private String phone;
	private String hadress;
	private String pradress;
	private String id;
	//员工编号
	public void setSno(int sno1){
		sno=sno1;
	}
	public int getSno(){
		return sno;
	}
	//员工部门
	public void setSdet(String sdep1){
		sdep=sdep1;
	}
	public String getSdep(){
		return sdep;
	}
	//员工职位
	public void setSpost(String spost1){
		spost=spost1;
	}
	public String getSpost(){
		return spost;
	}
	//员工姓名
	public void setSname(String sname1){
		sname=sname1;
	}
	public String getSname(){
		return sname;
	}
	//员工工资
	public void setSalary(String salary1){
		salary=salary1;
	}
	public String getSalary(){
		return salary;
	}
	//员工工龄
	public void setSwy(int swy1){
		swy=swy1;
	}
	public int getSwy(){
		return swy;
	}
	//员工学历
	public void setSeb(String seb1){
		seb=seb1;
	}
	public String getSeb(){
		return seb;
	}
	//员工性别
	public void setSex(String sex1){
		sex=sex1;
	}
	public String getSex(){
		return sex;
	}
	//员工电话
	public void setPhone(String phone1){
		phone=phone1;
	}
	public String getPhone(){
		return phone;
	}
	//员工家庭住址
	public void setHadress(String hadress1){
		hadress=hadress1;
	}
	public String getHadress(){
		return hadress;
	}
	//员工户籍地址
	public void setPradress(String pradress1){
		pradress=pradress1;
	}
	public String getPradress(){
		return pradress;
	}
	 
	//员工身份证
	public void setId(String id1){
		id=id1;
	}
	public String getId(){
		return id;
	}
	//工作介绍
	public void doWork(){
		String name="姓名为";
		System.out.println(name+sname+"的人的工作是"+sdep+"的"+spost);
	}

}
