package bao.java.test20180717.copy;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Text180717 {
	
	
	public static void main(String[] args){
		//2.
		/*double h=100.0;
		flip(h);	*/	
		//1�������ѧ����ÿ��ѧ����3�ſεĳɼ����Ӽ��������������ݣ�����ѧ���ţ����������ſγɼ����������ƽ���ɼ�.
		//�������������һ��ѧ���࣬ѧ�������ԡ��������ԺͿγ��࣬�ڿγ����ж�������γ̣����벻ͬ�ɼ���
		
		String[] stu1=new String[5];
		for(int i=0;i<5;i++){
			StudentClass stu=new StudentClass();
			Course grade1=new ClassA();
			Course grade2=new ClassB();
			Course grade3=new ClassC();
			stu1[i]="ѧ�ţ�"+stu.getSno()+",����:"+stu.getSname()+",�γ�A�ɼ���"+grade1.grade()+",�γ�B�ɼ���"+grade2.grade()+",�γ�C�ɼ���"+grade3.grade()+",ƽ���ɼ���";
		System.out.println(stu1[i]);
		}
		//for(String s:stu1){System.out.println(s);}
		/*double h=100.0;
		Scanner input =new Scanner(System.in);
		int count=input.nextInt();
		flip(h,count);*/
	}
	
	//2��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������� ��10�����ʱ�������������ף���10�η�����ߣ�
	//�����������10����صľ����Ϊ100+9�η����ĸ߶ȵ�2������10�η���Ϊ��11����صĸ߶ȡ�
	public static void flip(double h,int count){
		double s=0.0;
		int n;
		/*while(h>0){
			h=0.5*h;
			s=100+s+h*2;
			n++;
			System.out.println((n-1)+"�η���"+h);
			System.out.println(n+"����صľ���"+s);
			if(n==10){System.out.println("��10�η���С�򹲾���"+s+"�ף���10�η�����"+(h*0.5)+"�׸ߡ�");break;}
		}*/
		for(n=1;n<=count;n++){
			s=s+h+h/2;
			h=h/2;
			System.out.println(n+"�η���"+h);
			System.out.println(n+"����صľ���"+s);
		}
		System.out.println("��"+(n-1)+"�η���С�򹲾���"+(s-h)+"�ף���"+(n-1)+"�η�����"+h+"�׸ߡ�");
	}

}