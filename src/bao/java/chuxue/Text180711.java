package bao.java.chuxue;
import java.util.*;
import bao.java.tongyonglei.*;
public class Text180711 {
	 
	public static void main(String[] args) {
		//1.��дһ��Java���򣬲���������Ҫ��  1����дһ��Car�࣬���У�   ���ԣ�Ʒ��(mark)����String����   �۸�price�����ٶȣ�speed������int��
		//2)���ܣ���ʻ��void drive( )��;���ܣ����٣�void speedChange(int newSpeed)���������ٶȸ���speed ��
		//3����������E������main�����д���Car�����������aodi��benchi�Ķ��󲢲������������ԡ�  
		/*Car aodi=new Car("�µ�","50",80);
		aodi.print();
		aodi.drive();
		aodi.speedChange(120);
		Car benci=new Car("����","100",90);
		benci.print();
		benci.drive();
		benci.speedChange(120);*/
		
		//2.����һ��è�� ���е����� Ʒ��type ���� age  ��ɫ color 
		//1��ͨ�����췽������set�����Ը�ֵ 
		//2����ӡ���è��������Ϣ
		/*Cat jiafei=new Cat(8,"�ư�����");
		jiafei.setType("�ӷ�è��");
		jiafei.print();*/
		//3.����һ�����������ƽ��ֵ
		/*Scanner arr=new Scanner(System.in);
		int[] a=new int[10];
		int sum=0;
		double avg;
		//���һ������a
		for(int i=0;i<a.length;i++){
			a[i]=arr.nextInt();	
			sum+=a[i];
		}
		for(int s:a){System.out.printf(s+",");}
		avg=(double)sum/a.length;
		System.out.println("10�����ĺ���"+sum+"��ƽ������"+avg);*/
		//����һ�����飬Ҫ��дһ��expand ��������ԭ������ĳ�������һ����������ԭ������ԭ�е�����
		Random arr=new Random();
		int[] b=new int[10];
		//���һ���������b
		for(int i=0;i<b.length;i++){
			b[i]=arr.nextInt(100);	
		}
		for(int s:b){System.out.print(s+",");}
		System.out.println();
		b=getExpand(b);
		for(int m:b){System.out.print(m+",");}	
	}
	//��չ����,���������鸳ֵ
	public static int[] getExpand (int[] c){
		int[] temp=new int[c.length*2];
		for(int j=0;j<temp.length;j++){
			for(int i=0;i<c.length;i++){
				if(i==j){
					temp[j]=c[i];
				}
				
			}			
		}
		return temp;
		
	}
	
}
