package bao.java.test20180717.copy;

import java.util.Scanner;

public class StudentClass {
	private int sno;
	private String sname;
	private Course grade;
	public StudentClass(){
		Scanner input=new Scanner(System.in);
		int sno=input.nextInt();
		String sname=input.next();
		this.sno=sno;
		this.sname=sname;
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
	 * @return the grade
	 */
	public Course getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(Course grade) {
		this.grade = grade;
	}
	
	/*public String toString(){
		Course grade1=new ClassA();
		Course grade2=new ClassB();
		Course grade3=new ClassC();
		double avg=(grade1.grade()+grade2.grade()+grade3.grade())/3;
		return "ѧ�ţ�"+sno+"����"+sname+"�γ�A�ɼ���"+grade1.grade()+"�γ�B�ɼ���"+grade2.grade()+"�γ�C�ɼ���"+grade3.grade()+"ƽ���ɼ���";
	}*/
	/*public void avage(ClassA a,ClassB b,ClassC c ){
		
		System.out.println((c.grade())/3);
	}*/

}
