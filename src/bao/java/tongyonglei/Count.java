package bao.java.tongyonglei;
import java.util.*;
//4�����췽�������أ�����һ���࣬Ϊ���ඨ���������캯�����ֱ�ִ�����в�����
		//1)������������ֵ���ҳ����нϴ��һ��ֵ ��2����������doubleֵ�������˻���3����main�����в��Թ��캯���ĵ��á�
public class Count {
	private int value1;
	private int value2;
	private double i;
	private double j;
	private double k;
	public Count(){
		//��ֵ�ã���Ҫ������д
		/*Random a=new Random();
		this.value1=a.nextInt(20);
		this.value2=a.nextInt(20);*/	
		/*this.i=input.nextDouble();
		this.j=input.nextDouble();
		this.k=input.nextDouble();*/
			}
	public Count(int a,int b){
		this.value1=a;
		this.value2=b;
	}
	public Count(double i,double j,double k){
		this.i=i;
		this.j=j;
		this.k=k;	
	}
	public void Compear(){
		
		if(this.value1>this.value2){System.out.println("�����������ֵ"+this.value1+"��"+this.value2+"�нϴ������"+this.value1);}
		else{System.out.println("�����������ֵ"+this.value1+"��"+this.value2+"�нϴ������"+this.value2);}
	}
	public void Product(){
		/*double pro=this.i*this.j*this.k;*///�������ټ��㣬��߼���Ч��
		System.out.println("�����������ֵ�ĳ˻���"+this.i*this.j*this.k);
	}

}
