package bao.java.tongyonglei;
//����ͨ��ѧ����ģ�壬�Ա����ʹ�á����������ڰ�����������ø����ֱ�ӵ��ã���������������ã�������import ����.�����������
public class Student {
	//5������һ��ѧ���� ���԰��� ���� ���� ��� ���� �ɼ�  
	//1)ͨ�����췽������set���������Ը�ֵ
	//2)�����ж���һ�����Եķ��� ���������"����"���Գɼ�Ϊ���ɼ���
	//3)��дһ��toString���� �ڷ��������ѧ����ȫ����Ϣ ����Ϊ��������Ϊ��������ǡ�����������
	//4)��main�����н��в��� ����ʱ ��������ѧ����Ķ��� �����Ƿŵ�һ�������в��鿴ÿ���������ϸ��Ϣ�Ϳ��Գɼ�.
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public double getSheight() {
		return sheight;
	}
	public void setSheight(double sheight) {
		this.sheight = sheight;
	}
	public double getSweight() {
		return sweight;
	}
	public void setSweight(double sweight) {
		this.sweight = sweight;
	}
	public double getSgrade() {
		return sgrade;
	}
	public void setSgrade(double sgrade) {
		this.sgrade = sgrade;
	}
	private int sno;
	private String sname;
	private int sage;
	private double sheight;
	private double sweight;
	private double sgrade;
	
	/*public void setSno(int sno){//���幫������ѧ�ŵķ���setSno���÷������β�Ϊint���͵�sno��
		this.sno=sno;//���β�sno1��õ�ֵ��ֵ������sno
		System.out.println("ѧ��Ϊ5");
		}
	public int getSno(){
		return sno;//�����Ѿ�������setSno������sno��ֵ
	}
	public void setSsex(boolean ssex1){
		if (ssex1==true){System.out.println("��");}
		else{System.out.println("Ů");}	
		ssex=ssex1;
	}
	public boolean getSsex(){
		return ssex;
	}*/
	//��������set��get�����Ŀ�����ɷ�ʽ��source--Generate Getters and Setters..
	public Student(){}
	public Student(int sno,String sname,int sage,double sheight,double sweight,double sgrade){
		this.sno=sno;
		this.sname=sname;
		this.sage=sage;
		this.sheight=sheight;
		this.sweight=sweight;
		this.sgrade=sgrade;
	}
	
	/*public void studentExam(){
		System.out.println("ѧ����"+this.sno+"��"+this.sname+"�Ŀ��Գɼ���"+this.sgrade);
	}
	public String toString(){
		return "ѧ��:"+this.sno+",����:"+this.sname+",����"+this.sage+",���"+this.sheight+",����:"+this.sweight+",�ɼ�:"+this.sgrade;
	}*/
	public void studentTable(){
		/*String[][] arrs=new String[3][6];
		for(int i=0;i<3;i++){
				arrs[i][0]=(String)this.sno;
				arrs[i][1]=this.sname;
				arrs[i][2]=this.sage;	
			}
		}*/
		/*String[] arrs=new String[4];
		for(int i=0;i<6;i++){
			arrs[i]="ѧ��:"+this.sno+",����:"+this.sname+",����"+this.sage+",���"+this.sheight+",����:"+this.sweight+",�ɼ�:"+this.sgrade;
		    i++;
		}
		for(String s:arrs){System.out.println(s);}*/
	}

}