package bao.java.tongyonglei;

public class Staff {
	//����ְԱ��:Ա�����sno Ա������sdepartment ְλpost ���� ����salary ����s working years ѧ��s education background  
	//�Ա� Ա���绰phone ��ͥסַhadress ������ַpermanent residence address ���֤ID  identity card
	//������doWork()
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
	//Ա�����
	public void setSno(int sno1){
		sno=sno1;
	}
	public int getSno(){
		return sno;
	}
	//Ա������
	public void setSdet(String sdep1){
		sdep=sdep1;
	}
	public String getSdep(){
		return sdep;
	}
	//Ա��ְλ
	public void setSpost(String spost1){
		spost=spost1;
	}
	public String getSpost(){
		return spost;
	}
	//Ա������
	public void setSname(String sname1){
		sname=sname1;
	}
	public String getSname(){
		return sname;
	}
	//Ա������
	public void setSalary(String salary1){
		salary=salary1;
	}
	public String getSalary(){
		return salary;
	}
	//Ա������
	public void setSwy(int swy1){
		swy=swy1;
	}
	public int getSwy(){
		return swy;
	}
	//Ա��ѧ��
	public void setSeb(String seb1){
		seb=seb1;
	}
	public String getSeb(){
		return seb;
	}
	//Ա���Ա�
	public void setSex(String sex1){
		sex=sex1;
	}
	public String getSex(){
		return sex;
	}
	//Ա���绰
	public void setPhone(String phone1){
		phone=phone1;
	}
	public String getPhone(){
		return phone;
	}
	//Ա����ͥסַ
	public void setHadress(String hadress1){
		hadress=hadress1;
	}
	public String getHadress(){
		return hadress;
	}
	//Ա��������ַ
	public void setPradress(String pradress1){
		pradress=pradress1;
	}
	public String getPradress(){
		return pradress;
	}
	 
	//Ա�����֤
	public void setId(String id1){
		id=id1;
	}
	public String getId(){
		return id;
	}
	//��������
	public void doWork(){
		String name="����Ϊ";
		System.out.println(name+sname+"���˵Ĺ�����"+sdep+"��"+spost);
	}

}
