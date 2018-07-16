package bao.java.tongyonglei;
//定义通用学生类模板，以便后期使用。若该类所在包的其他类调用该类可直接调用，若其他包内类调用，则需用import 包名.类名导入该类
public class Student {
	//5、定义一个学生类 属性包括 姓名 年龄 身高 体重 成绩  
	//1)通过构造方法或者set方法给属性赋值
	//2)在类中定义一个考试的方法 方法中输出"姓名"考试成绩为“成绩”
	//3)重写一下toString（） 在方法中输出学生的全部信息 姓名为“”年龄为“”身高是。。。。。。
	//4)在main方法中进行测试 测试时 创建三个学生类的对象 把他们放到一个数组中并查看每个对象的详细信息和考试成绩.
	
	
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
	
	/*public void setSno(int sno){//定义公有设置学号的方法setSno，该方法的形参为int类型的sno。
		this.sno=sno;//将形参sno1获得的值赋值给属性sno
		System.out.println("学号为5");
		}
	public int getSno(){
		return sno;//返回已经过方法setSno的属性sno的值
	}
	public void setSsex(boolean ssex1){
		if (ssex1==true){System.out.println("男");}
		else{System.out.println("女");}	
		ssex=ssex1;
	}
	public boolean getSsex(){
		return ssex;
	}*/
	//设置属性set和get方法的快捷生成方式：source--Generate Getters and Setters..
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
		System.out.println("学号是"+this.sno+"的"+this.sname+"的考试成绩是"+this.sgrade);
	}
	public String toString(){
		return "学号:"+this.sno+",姓名:"+this.sname+",年龄"+this.sage+",身高"+this.sheight+",体重:"+this.sweight+",成绩:"+this.sgrade;
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
			arrs[i]="学号:"+this.sno+",姓名:"+this.sname+",年龄"+this.sage+",身高"+this.sheight+",体重:"+this.sweight+",成绩:"+this.sgrade;
		    i++;
		}
		for(String s:arrs){System.out.println(s);}*/
	}

}