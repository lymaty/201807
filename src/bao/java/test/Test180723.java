package bao.java.test;
import java.util.*;
import bao.java.tongyonglei.*;
public class Test180723 {
	public static void main(String[] args){
		/*MyClass myc1,myc2,myc3;
		myc1=new MyClass(10);
		myc2=new MyClass(20);
		myc3=new MyClass(30);
		List list=new ArrayList();
		list.add(0, myc1);
		list.add(1, myc2);
		list.add(2, myc3);
		MyClass myc4=(MyClass)list.get(1);
		//jvm内存模型？查找资料，引用数据类型-传址，赋值的是地址，
		//所以myc2对象与myc4对象地址相同，更新myc4的值时，即更新myc4对应地址的值，
		//因为myc4与myc2地址相同，故调用myc2时，调用的是value=50。
		myc4.value=50;
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		//创建一个List，在List 中增加三个工人，
		//基本信息如下： 姓名 年龄 工资 zhang3 18 3000； li4 25 3500； wang5 22 3200 
	
		Worker w1,w2,w3;
		w1=new Worker("张三五",18,3000);
		w2=new Worker("李四七",25,3500);
		w3=new Worker("王武",22,3200);
		Worker w4=new Worker();
		w4.setName("赵五四");
		w4.setAge(24);
		w4.setSalary(3300);
		List list1=new LinkedList();
		list1.add(0,"工人信息目录：");
		list1.add(1, w1);
		list1.add(2,w2);
		list1.add(3, w3);
		// 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300；
		list1.add(3, "姓名："+w4.getName()+",年龄："+w4.getAge()+",工资："+w4.getSalary());
		//删除wang5 的信息 ；
		list1.remove(4);
		//利用for 循环遍历，打印List 中所有工人的信息；
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
	
	}
}
/*class MyClass{
	 int value;//默认修饰符，可在相同包中调用
	public MyClass(){}
	public MyClass(int value){
		this.value=value;
	}
	public String toString(){
		return "值为："+value;
	}
}*/