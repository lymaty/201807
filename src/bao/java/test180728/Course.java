package bao.java.test180728;
//欢迎进入课程管理系统
//请选择操作：1  增加课程  2.修改课程3.删除课程  4.查询课程 
public class Course {
	private int cno;
	private String cname;
	private double Credit;
	public Course(){}
	public Course(int cno, String cname, double credit) {
		super();
		this.cno = cno;
		this.cname = cname;
		Credit = credit;
	}
	/**
	 * @return the cno
	 */
	public int getCno() {
		return cno;
	}
	/**
	 * @param cno the cno to set
	 */
	public void setCno(int cno) {
		this.cno = cno;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the credit
	 */
	public double getCredit() {
		return Credit;
	}
	/**
	 * @param credit the credit to set
	 */
	public void setCredit(double credit) {
		Credit = credit;
	}
	

}
