package bao.java.tongyonglei;
//定义通用学生类模板，以便后期使用。若该类所在包的其他类调用该类可直接调用，若其他包内类调用，则需用import 包名.类名导入该类
public class Student {
	/*public int sno;//定义学生类公用属性学号，公有属性可被其他类直接调用
	public String sname;//定义公有属性学生姓名
	public int sgrade;//定义公有属性学生成绩*/
	private int sno;//私有属性仅对当前类有效
	private String sname;
	private boolean ssex;
	private String sclass;
	private int sgrade;
	public void setSno(int sno1){//定义公有设置学号的方法setSno，该方法的形参为int类型的sno。
		sno=sno1;//将形参sno1获得的值赋值给属性sno
		System.out.println("学号为5");
	}
	public int getSno(){
		return sno;//返回已经过方法setSno的属性sno的值
	}
	/*public void setSname(String sname1){
		sname=sname1;
		
	}
	public String getSname(){
		return sname;
	}
	
	public void setSsex(boolean ssex1){
		if (ssex1==true){System.out.println("男");}
		else{System.out.println("女");}	
		ssex=ssex1;
	}
	public boolean getSsex(){
		return ssex;
	}
	public String getSsex(boolean ssex1){
		if (ssex1==true){ssex="男";}
		else{ssex="女";}
		return ssex;		
	}
	public void setSclass(String sclass1){
		sclass=sclass1;
	}*/
	//设置属性set和get方法的快捷生成方式：source--Generate Getters and Setters..
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