package bao.java.test180728;
//欢迎进入学生信息管理系统
//请选择操作：1.增加学生   2修改学生  3.删除学生  4.查询学生  5.打印学生  6.课程管理（学生选课）
public class Student {
	private int sno;
	private String sname;
	private String dept;
	public Student(){}
	public Student(int sno, String sname, String dept) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.dept = dept;
	}
	/**
	 * @return the sno
	 */
	public int getSno() {
		return sno;
	}
	/**
	 * @param sno the sno to set
	 */
	public void setSno(int sno) {
		this.sno = sno;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
