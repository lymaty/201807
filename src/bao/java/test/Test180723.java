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
		//jvm�ڴ�ģ�ͣ��������ϣ�������������-��ַ����ֵ���ǵ�ַ��
		//����myc2������myc4�����ַ��ͬ������myc4��ֵʱ��������myc4��Ӧ��ַ��ֵ��
		//��Ϊmyc4��myc2��ַ��ͬ���ʵ���myc2ʱ�����õ���value=50��
		myc4.value=50;
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		//����һ��List����List �������������ˣ�
		//������Ϣ���£� ���� ���� ���� zhang3 18 3000�� li4 25 3500�� wang5 22 3200 
	
		Worker w1,w2,w3;
		w1=new Worker("������",18,3000);
		w2=new Worker("������",25,3500);
		w3=new Worker("����",22,3200);
		Worker w4=new Worker();
		w4.setName("������");
		w4.setAge(24);
		w4.setSalary(3300);
		List list1=new LinkedList();
		list1.add(0,"������ϢĿ¼��");
		list1.add(1, w1);
		list1.add(2,w2);
		list1.add(3, w3);
		// ��li4 ֮ǰ����һ�����ˣ���ϢΪ��������zhao6�����䣺24������3300��
		list1.add(3, "������"+w4.getName()+",���䣺"+w4.getAge()+",���ʣ�"+w4.getSalary());
		//ɾ��wang5 ����Ϣ ��
		list1.remove(4);
		//����for ѭ����������ӡList �����й��˵���Ϣ��
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
	
	}
}
/*class MyClass{
	 int value;//Ĭ�����η���������ͬ���е���
	public MyClass(){}
	public MyClass(int value){
		this.value=value;
	}
	public String toString(){
		return "ֵΪ��"+value;
	}
}*/