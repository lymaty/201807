package bao.java.tongyonglei;
//����ͨ��ѧ����ģ�壬�Ա����ʹ�á����������ڰ�����������ø����ֱ�ӵ��ã���������������ã�������import ����.�����������
public class Student {
	/*public int sno;//����ѧ���๫������ѧ�ţ��������Կɱ�������ֱ�ӵ���
	public String sname;//���幫������ѧ������
	public int sgrade;//���幫������ѧ���ɼ�*/
	private int sno;//˽�����Խ��Ե�ǰ����Ч
	private String sname;
	private boolean ssex;
	private String sclass;
	private int sgrade;
	public void setSno(int sno1){//���幫������ѧ�ŵķ���setSno���÷������β�Ϊint���͵�sno��
		sno=sno1;//���β�sno1��õ�ֵ��ֵ������sno
		System.out.println("ѧ��Ϊ5");
	}
	public int getSno(){
		return sno;//�����Ѿ�������setSno������sno��ֵ
	}
	/*public void setSname(String sname1){
		sname=sname1;
		
	}
	public String getSname(){
		return sname;
	}
	
	public void setSsex(boolean ssex1){
		if (ssex1==true){System.out.println("��");}
		else{System.out.println("Ů");}	
		ssex=ssex1;
	}
	public boolean getSsex(){
		return ssex;
	}
	public String getSsex(boolean ssex1){
		if (ssex1==true){ssex="��";}
		else{ssex="Ů";}
		return ssex;		
	}
	public void setSclass(String sclass1){
		sclass=sclass1;
	}*/
	//��������set��get�����Ŀ�����ɷ�ʽ��source--Generate Getters and Setters..
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public boolean isSsex() {
		return ssex;
	}
	public void setSsex(boolean ssex) {
		this.ssex = ssex;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public int getSgrade() {
		return sgrade;
	}
	public void setSgrade(int sgrade) {
		this.sgrade = sgrade;
	}
	

}