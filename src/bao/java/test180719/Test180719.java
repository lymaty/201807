package bao.java.test180719;

import bao.java.test180719.MainPackage.*;
import bao.java.tongyonglei.*;

public class Test180719 {
	public static void main(String[] args) {
		//1���̳�
		//����һ������Cat������Tomcat��������һ�����ݳ�Ա������̳и���ĸ����ݳ�Ա��
		//ͨ�����캯����ʼ������ʾ�����ݳ�Ա��ֵ��
		/*Tomcat tomcat=new Tomcat("fish");
		System.out.println(tomcat.food);*/
		//2����д�����ǡ��̳�
		//����һ������Auto�࣬������̥������������ɫ�������������ٶȵ����ԡ���ͨ����ͬ�Ĺ��췽������ʵ����?
		//����Ҫ��??�����ܹ����٣����٣�ͣ���Ĺ��ܡ�
		//�ٶ���һ��С������Car���̳�Auto������ӿյ���CD�����ԣ����Ǽ��٣����ٵķ�����
		//String mark, String price,int tyrenumber, String color, double weight, double speed,String airConditioner, String cD
		/*Auto a=new Car("aodi","15wan",4,"black",2345,120,"kongtiao","CD");
		System.out.println(a.speedUp(50));
		a.speedDown(40);
		a.stop();
		System.out.println(a);*/
		//3�������̳�
		//����һ������ΪMainPackage�İ���ʹ������MainClass��MainSubClass�ࡣ
		//MainClass��Ӧ������������������ֵ�ӹ��췽���������MainSubClass���MainClass����������
		//��ִ�����в���������һ������ΪSamePackage���࣬ʹ��������������������һ��MainSubClass��Ķ���
		/*MainSubClass msc=new MainSubClass(12,"frew");
		System.out.println(msc);*/
		//4����̬������ҪΪĳ����˾��д��Ա����֧������
		//һ�㹤�ˣ�Worker����ÿ�¹������������㹤�ʣ�
		//������Ա��Salesman���ڻ������ʻ�����ÿ�»���������ɣ�
		//����Manager��?ÿ�°��̶�����֧����
		//��ʱ����Floater?����Сʱ֧����
		//Ҫ����Ƴ����ࣨEmployee���������й�Ա�Ĺ�ͬ���ԣ����������Ա𣬳������ڣ�Ա����𣩣����м��㹤�ʵĳ��󷽷�computeSalay������
		//����Ա���ø÷�����н��Ҫ���ö�̬ʵ�֡�
		Employee w=new Eworker("����","Ů","1990-4-6","����",30,120);
		Employee s=new Esalesman("����","��","1989-3-2","������Ա",1200,12000,0.02);
		Employee m=new Emanager("����","��","1987-6-6","����",10000);
		Employee f=new Efloater("����","Ů","1992-8-6","Сʱ��",10,40);
		w.computeSalay(6);
		s.computeSalay(7);
		m.computeSalay(8);
		f.computeSalay(9);
		//5����һ���ַ�����Hello World!�����������dlroW olleH��
		String s1=new String("Hello world!e44");
		char[] a=s1.toCharArray();
		StringBuilder s2;
		//����1
		/*char t;
		for (int i=0;i<(a.length/2);i++) {
			t=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=t;
			System.out.print(a[i]);
		}
		System.out.println();
		for (char c : a) {
			System.out.print(c);
		}*/
	}

}
