package bao.java.test180728;
//��ӭ����ѧ����Ϣ����ϵͳ
//��ѡ�������1.����ѧ��   2�޸�ѧ��  3.ɾ��ѧ��  4.��ѯѧ��  5.��ӡѧ��  6.�γ̹���ѧ��ѡ�Σ�
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
