package bao.java.chuxue;

import java.util.*;
import javax.swing.plaf.synth.SynthStyle;
import bao.java.tongyonglei.*;
public class text180710 {
	//��̬����һλ����a[7]������������a
	public int[] input(){
		int[] a=new int[7];
		for(int i=0;i<a.length;i++){
			System.out.println("�������"+(i+1)+"����");
			Scanner arr=new Scanner(System.in);
			a[i]=arr.nextInt();
		}
		return a;
	}
	//����a[i]��ֵ���*�ĸ���
	public void print(int[] a ){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<=a[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//1����ȡ7������1��50��������ֵ��ÿ��ȡһ��ֵ�������ӡ����ֵ�����ģ���
		/*int i=0,a,n;
		Scanner input=new Scanner(System.in);
		while(i<=6){
			 a=input.nextInt(); 
			 if(a>=1&&a<=50){
				 String m="";
				 for(n=0;n<a;n++){
					 m+="*";
					}
				 System.out.print(m);
				 System.out.println(n+"��*");
				}else{System.out.println("������1��50�ڵ�����");}
			i++;
		}*/
		//����2
		text180710 t=new text180710();//��������
		int[] b=t.input();//����input()����
		t.print(b);//����print��������
		
		//2���ж�һ�������ƽ�껹������,1)
		Scanner input=new Scanner(System.in);
		int i=0,j=0;
		while(true){		
			int a=input.nextInt();
			if(i<10&&j<10){
				if(a%4==0&&a%100!=0||a%400==0){System.out.println(a+"������");i++;}
				else{System.out.println(a+"��ƽ��");j++;}
			}else{break;}
		}
		System.out.println(i+"������"+j+"��ƽ��");
		//3���ڿ���̨����ֵ �ж�ֵ�Ĵ�С
		/*Scanner input=new Scanner(System.in);
		int i=0,j=0,k=0,n=0;
		
		while(true){
			double a=input.nextDouble();	
			if(n<5){
				if(-1<=a&&a<0){System.out.println(a+"��-1��0֮���С��");i++;}
				else if(0<=a&&a<=1){System.out.println(a+"��0��1֮���С��");j++;}
				else {System.out.println(a+"����-1��1���С��");k++;}
				n++;
			}else{break;}
		}
		System.out.println("������"+n+"��С��,����"+i+"������-1��0֮���С����"+j+"������0��1֮���С����"+k+"��������-1��1���С����");*/
	   //������Random
		/*Random ran=new Random();
	   int a=ran.nextInt(10);//���ֵ��Χ0-9
	   Scanner input=new Scanner(System.in);//��̬����
	   while(true){
	   int b=input.nextInt();
	   if(b<a){System.out.println("xiaola");
	   }else if(b>a){System.out.println("dala");}
	   else {System.out.println("duila");break;//��a=bʱ����ѭ�� }
	   }System.out.println(a);//����������ֵ*/		
		//4)�����1��ʼ������n����Ȼ��֮�ͣ������ֵ�պó���100ʱ�����������nֵ��
		/*int i=1,sum=0,n=0;
		while(sum<=100){
			sum+=i;
			i++;
			n++;
		}
		System.out.println(n);*/
		//5)����ְԱ��:Ա�����sno Ա������sdepartment ְλpost ���� ����salary ����s working years ѧ��s education background  
		//�Ա� Ա���绰phone ��ͥסַhadress ������ַpermanent residence address ���֤ID  identity card
		//������doWork()
		/*Staff a=new Staff();//Ĭ�ϵ�
		a.setSno(1002);
		a.setSdet("������");
		a.setSpost("�ϰ�");
		a.setSname("������ʱ");
		a.setSalary("100$/��");
		a.setSwy(15);
		a.setSeb("����");
		a.setSex("��");
		a.setPhone("14521541124");
		a.setHadress("�ձ�����������������Ŀ3��");
		a.setPradress("�ձ�����������������Ŀ3��");
		a.setId("14045519930606457J");
		a.doWork();*/
	}
	
}
