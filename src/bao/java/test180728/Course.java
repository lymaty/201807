package bao.java.test180728;
//��ӭ����γ̹���ϵͳ
//��ѡ�������1  ���ӿγ�  2.�޸Ŀγ�3.ɾ���γ�  4.��ѯ�γ� 
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
