package bao.java.test;
import java.util.*;

import bao.java.chuxue.Firstclasses;
import bao.java.graph.*;
import bao.java.tongyonglei.*;
public class Text20180712 {
	public static void main(String[] args) {
		Pet p1=new Cat();
		Pet p2=new Dog();
		Firstclasses.test(p2);
	    //1����д������һ��forѭ������ 1+3+5+7��+99��ֵ���������������
		/*int a,sum=0;
		for(a=1;a<=100;a+=2){
			sum+=a;
		}
		System.out.println(sum);*/
		//2�����1~100��ǰ5�����Ա�3����������
		/*int i=1;
		for(int a=1;a<=100;a++){
			if(i<=5){	
				if(a%3==0){
					System.out.println(a+"���Ա�3����");
					i++;
					}
				}
			}*/
		//3��switch��ϰ
		// ������������0-6,��������������0--->��������գ�1--->�������һ��2--->������ڶ���3--->����������� 4--->��������ģ�5--->��������壬6--->���������
		/*Scanner input=new Scanner(System.in);
		while(true){
			int a=input.nextInt();
			switch(a){
			case 0:System.out.println("������");
			break;
			case 1:System.out.println("����һ");
			break;
			case 2:System.out.println("���ڶ�");
			break;
			case 3:System.out.println("������");
			break;
			case 4:System.out.println("������");
			break;
			case 5:System.out.println("������");
			break;
			case 6:System.out.println("������");
			break;	
			default:System.out.println("������0��6������,��ϣ������������1000");
			break;
			case 1000:System.out.println("��������");
			return;
			}
		}*/
		//4�����췽�������أ�����һ���࣬Ϊ���ඨ���������캯�����ֱ�ִ�����в�����
		//1)������������ֵ���ҳ����нϴ��һ��ֵ ��2����������doubleֵ�������˻���3����main�����в��Թ��캯���ĵ��á�
		
		/*Random rand=new Random();
		int value1=rand.nextInt(20);
		int value2=rand.nextInt(20);	
		Count c=new Count(value1,value2);
		c.Compear();
		Scanner input=new Scanner(System.in);
		double i=input.nextDouble();
		double j=input.nextDouble();
		double k=input.nextDouble();
		Count a=new Count(i,j,k);
		a.Product();*/
		
		//5������һ��ѧ���� ���԰���ѧ��int�� ����string, ����int, ���double, ����double, �ɼ�double  
		//1)ͨ�����췽������set���������Ը�ֵ
		//2)�����ж���һ�����Եķ��� ���������"����"���Գɼ�Ϊ���ɼ���
		//3)��дһ��toString���� �ڷ��������ѧ����ȫ����Ϣ ����Ϊ��������Ϊ��������ǡ�����������
		//4)��main�����н��в��� ����ʱ ��������ѧ����Ķ��� �����Ƿŵ�һ�������в��鿴ÿ���������ϸ��Ϣ�Ϳ��Գɼ�.
		/*Student a=new Student(20180626,"�",18,165,50.5,592.5);
		a.studentExam();
		System.out.println(a);*/
		Student stu1=new Student();
		Student stu2=new Student();
		Student stu3=new Student();
		stu1.setSage(12);
		stu1.setSname("d");
		stu2.setSgrade(567);
		stu3.setSname("ewde");
		Student[] stu=new Student[]{stu1,stu2,stu3};//�����������stu[]��
		for(Student m :stu ){System.out.println(m);}
		System.out.println(stu1);
		/*System.out.println(stu[0].getSage()+stu[1].getSgrade()+stu[2].getSname());
				new Student(20180627,"��Ԩ",19,180,65,570);*/
		/*stu[1]=new Student(20180601,"���",17,170,55,740);
		stu[2]=new Student(20180627,"����",18,185,64,600);*/
		/*for(Student s:stu){System.out.println(s);}*/
		//6�� ����һ��ͼ���� 
		//1)�м�������ͼ����ܳ��ĳ��󷽷�
		//2)����ͼ��������� Բ�� ������ ������ �ֱ����Լ��ļ�������ͼ����ܳ�
		//3)����main���� ���в���
		/*Circle a=new Circle(3.4);
		Rectangle b=new Rectangle(34,45);*/
		/*Square c=new Square(8);*/
		/*System.out.println("Բ�ε��ܳ���"+a.graphPerimeter()+"Բ�ε������"+a.graphArea());
		System.out.println("�����ε��ܳ���"+b.graphPerimeter()+"�����ε������"+b.graphArea());
		System.out.println("�����ε��ܳ���"+c.graphPerimeter()+"�����ε������"+c.graphArea());
		System.out.println(a+";"+b+";"+c+".");*/
	
	}

}

