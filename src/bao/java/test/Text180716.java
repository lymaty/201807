package bao.java.test;
import java.util.*;
import bao.java.musicalInstruments.*;
import bao.java.tongyonglei.*;
public class Text180716 {
	/*1��1)����һ������musical instruments �� ����һ�����󷽷� ����
	2)������������ ����piano ����flute �ַ���accordion  ��д�����еķ��� play���� ���岻ͬ�����෽ʽ
	3)ͨ����ֵ��̬�ʹ��ζ�̬�� ��ʽ ���ò�ͬ�����෽ʽ ʵ�ֶ�̬����*/
	//���ζ�̬
	/*public static void playway(MusicalInstruments p){
		p.play();//����play����
	}*/
	public static void main(String[] args){
		/*//��ֵ��̬
		MusicalInstruments m1=new Piano("piano");
		MusicalInstruments m2=new Flute("flute");
		MusicalInstruments m3=new Accordion("Accordion");
		playway(m1);
		playway(m2);
		playway(m3);*/
		
		/*2������һ���ʼǱ��࣬��������ɫ��char����cpu�ͺţ�int���������ԡ� 
		2.1 �޲κ��вε��������췽�����вι��췽�������ڴ��������ͬʱΪÿ�����Ը�ֵ��
		2.2  ����ʼǱ���Ϣ�ķ���
		2.3  Ȼ���дһ�������࣬���ԱʼǱ���ĸ���������*/
		/*Laptop l1=new Laptop('a',20180716);
		System.out.println(l1);*/
		
		/*3������һ������Point������2����Ա����x��y�ֱ��ʾx��y���꣬2��������Point()��Point(int x0,y0),�Լ�һ��movePoint��int dx,int dy������ʵ�ֵ��λ���ƶ���
		��������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2������*/
		/*Point p1=new Point(2,3);
		p1.yidong();
		p1.movePoint(2, 3);
		Point p2=new Point(3,4);
		p2.yidong();
		p2.movePoint(5, 6);*/
		
		/*4�����������࣬�������£� 
		4.1����һ������Person��
		4.1.1����һ������sayHello()��������Է������ʺ��hello,my name is XXX��
		4.1.2���������ԣ����֡���ߡ�����
		4.2����һ��PersonCreate�ࣺ
		4.2.1�����������󣬷ֱ���zhangsan��33�꣬1.73��lishi��44��1.74
		4.2.2�ֱ���ö����sayHello()������*/
		/*Person p1=new Person("zhangsan",33,1.73);
		p1.sayHello();
		Person p2=new Person("lishi",44,1.74);
		p2.sayHello();*/
		
		/*��дһ�����򣬼����ʾֻ��Ļ�ѡ���������С��100Ԫ�����ΪһԪ����������100Ԫ��5000Ԫ֮�䣬
		 * ��1%��ȡ��ѣ����������5000Ԫ�����Ϊ50Ԫ�������������������*/
		/*int i=0;
		while(true){
			Text180716 m=new Text180716();//���÷�����1����������Ķ���2������������Ϊstatic
			double t=m.scan();
			rem(t);
			i++;
			if(i>9){
				System.out.println("����Ѽ���10�ʣ�����������");
				break;
			}
		}*/
		//����һ��0��100�ķ������������0��100֮�䣬��ӡ������Ч�����ݷ����ȼ���ӡA,B,C,D,E
		/*int i=0;
		while(true){
			Text180716 m=new Text180716();//���÷�����1����������Ķ���2������������Ϊstatic
			double t=m.scan();
			grade(t);
			i++;
			if(i>9){
				System.out.println("�����Ѽ���10�ʣ�����������");
				break;
			}
		}*/
	}
	//Scanner�������
	public double scan(){
		Scanner input=new Scanner(System.in);
		double t=input.nextDouble();
		return t;
	}
	//�����ȼ�����
	public static void grade(double a){
		if(a<=100&&a>80){System.out.println("��������Ϊ��"+a+",�����ȼ�ΪA����");}
		else if(a<=80&&a>60){System.out.println("��������Ϊ��"+a+",�����ȼ�ΪB����");}
		else if(a<=60&&a>40){System.out.println("��������Ϊ��"+a+",�����ȼ�ΪC����");}
		else if(a<=40&&a>20){System.out.println("��������Ϊ��"+a+",�����ȼ�ΪD����");}
		else if(a<=20&&a>=0){System.out.println("��������Ϊ��"+a+",�����ȼ�ΪE����");}
		else{System.out.println("����������"+a+",���������������ӡ��Ч��");}
	}
	
	/*//����Ѽ���
	 public static void rem(double a){
		double b=a;
		double s=0;
		if(b<100.0){System.out.println("�����С��100Ԫ�����Ϊ1Ԫ");}
		else if(b<=5000.0){
			s=s+0.01*b;
			System.out.println("�������100Ԫ��5000Ԫ֮�䣬���Ϊ"+s);}
		else{System.out.println("��������5000Ԫ�����Ϊ50Ԫ");}
	}*/


	
}
