package bao.java.chuxue;
import java.util.*;
import bao.java.tongyonglei.*;
public class Firstclasses {
	/**
	 * @param args
	 */
	public static void test(Pet p){
		
	}
	//���д�ִ�����Ӧд��main������
	public static void main(String[] args){
		Pet p1=new Cat();
		Pet p2=new Dog();
		
		//180712--�̳�
		/*Cat jiafei=new Cat("�ӷ�è��",8,"�ư�����");
		jiafei.setType("�ӷ�è��");
	jiafei.print();
		System.out.println(jiafei);*/
		
		//acsii��
		/*char a='z';
		 * int b=a-3;
		 * char c=(char)(a-3);
		 * System.out.println(a);
		 * System.out.println(b);*/
		//����
		/*int m=1234;
		int a,b,c,d,n;
		a=m/1000;
		b=m%1000/100;
		c=m%100/10;
		d=m%10;
		n=d*1000+c*100+b*10+a;
		System.out.println(n);*/
		
		//��̬����scanner
		/*
		 scanner input=new scanner(system.in);
		 int a=input.nextInt();
		 System.out.println(a);
		 */
		//���̿������-�������		
		/*if(a<4){
			System.out.println("a>4");
		}*/
		//ѡ�����
		/*switch(a){
		case 1:System.out.println("a=1");
		break;
		case 2:System.out.println("a=2");
		case 3:System.out.println("a=3");
		break;
		default:System.out.println("buchengli");
		break;
		}*/
		/*while(a<=10){
			System.out.println(a);
			a++;
		}*/
		//a++������ִ��/++a��ִ�к���/a--/--a
		/*int a=2,b=1;
		System.out.println(a);//2,1
		a=a++;
		a=++a;
		b=b++;
		System.out.println(a);
		System.out.println(b);*///3,1		
		//ѭ�����
		/*do{
			@SuppressWarnings("resource")
			Scanner input=new Scanner(System.in);
			a=input.nextInt();
			int b=0;
			while(a<=10){
				a=++a;
				System.out.println(a);
				b++;			
			}
			System.out.println(b);
				
		}while(true);*/
		//��Ŀ�����int c=������ֵ1��ֵ2��������Ϊ����ȡֵ1����Ϊ����ȡֵ2��
		/*int a,b,j=0,c;
		double t=12.23;
		Scanner input=new Scanner(System.in);//scanner��̬����
		do{ 
			a=input.nextInt();
			b=input.nextInt();
			c=input.nextInt();
			System.out.printf("%d %d %d\n",a,b,c);//ͬʱ����������
			System.out.println(a+""+b+""+c+"");
			int m= a<b&&a<c++?1:0;
			System.out.println(m);
			System.out.println(c);
			j++;
		}while(j<3);*/
		/*Student stu = new Student();//��new�ؼ��ִ���Student��Ķ���stu
		//stu.sno=20180605;//��4��ֵ������stu��sno���ԣ���ѧ��Ϊ4��ѧ��
		stu.setSno(5);
		System.out.println(stu.getSno());
		stu.setSsex(true);
		System.out.println(stu.getSsex());
		int a=3,b=4,c=5,d=2;
		boolean m=!(a+b>=d)&&b-a<d?true:false;
		byte n=-34;
		char t=(char)n;
		System.out.println();*/
		
		/*//��������a����Ϊ20��
		int[] a=new int[20];
		//�����±��0��ʼ��������������.length������鳤�ȡ�
		for(int i=0;i<a.length;i+=2){
			a[i]=i+10;
			System.out.println(i);
			System.out.println(a[i]);
		}
		//�鿴�������ݣ�������ǿfor
		for(int s : a){System.out.println(s);}*/
		//������������arr[]{23,3,56,7,89,90,2,12,54,43}
		/*int[] arr=new int[10];
		Scanner input=new Scanner(System.in);
		for(int n=0;n<arr.length;n++)
		{
			arr[n]=input.nextInt();
			System.out.print(arr[n]+",");
		}
		System.out.println();
		//ð����������λ�����������Ƚϣ���������ݼ����Ƚϴ���������
		//����ѭ������
		for(int i=0;i<arr.length-1;i++){
			//�Ƚ��㷨
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}		
		}
		for(int s:arr){
			System.out.print(s+",");
		}*/
		
		
	}

}
