package bao.java.chuxue;
import java.util.*;
import java.lang.*;
public class text180709 {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		/*1����Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
		*���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η��� 
		*1.�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��*/
		/*int a,b,c,sum,i=0,j=0;
		for(int m=100;m<=999; m++){
			a=m/100;
			b=m%100/10;
			c=m%10;
			//sum=(int)(Math.pow((double)a, (double)3)+Math.pow((double)b, (double)3)+Math.pow((double)c, (double)3));
			if(m==Math.pow(a,3)+Math.pow(b, 3)+Math.pow(c, 3)){//
				System.out.println(m+"��ˮ�ɻ���");
				i++;
			}
			//if(m==sum){
			//	System.out.println(m+"��ˮ�ɻ���");
			//	i++;
			//}else{//System.out.println(m+"����ˮ�ɻ���");j++;
				
			//}
		}
	System.out.println("100��999��ˮ�ɻ����ĸ�����"+i);/*
		/*2)��Ŀ�����������������Ƕ������ɴ��⣺
		 * ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ�� */
        /*int a,b,c,n=0;
        Scanner input=new Scanner(System.in);
		while(true){
			a=input.nextInt();
			if(a>=90){System.out.println(a+"��A");
			}else if(a>=60){System.out.println(a+"��B");
			}else{System.out.println(a+"��C");
			}
			n++;
			if(n==3){System.out.println("�����������ͬѧ�ɼ�");continue;}//���β�ִ��ѭ��������ִ��n==3ʱ��ѭ����䡣
			if(n==5){System.out.println("���������ͬѧ�ɼ�����");return;}//��������������������ֵ
			if(n==10){System.out.println("10��ͬѧ�ɼ����ж����");break;}//������ѭ��	
					
		}*/
		/*3����Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣� 
		 * 1.��������������ڰ�λ��ʮλ����λ�����ֶ���1��2��3��4��������е����к���ȥ �����������������С�* */
		/*int a=1,b=1,c=1,d,n=0,s;
		//int m=a*100+b*10+c;
		for(a=1;a<=4;a++){
			for(b=1;b<=4;b++){
				if(a!=b){//�ų�a��b������,
					for(c=1;c<=4;c++){
						if��a!=c&&b!=c)//�ų�c/a/b����������ֱ���ڴ�һ���ж�a��=b��������Ҫ��bѭ�������жϡ�
							{
							s=a*100+b*10+c;
							//if(s!=m){�������ݣ�ֻ��100�Աȣ����������������á�
								System.out.println(s);
								n++;
								//}
							}
						}
				}
			}
		}
		System.out.println("1��2��3��4����ɵĻ�����ͬ�����ظ����ֵ���λ���ĸ���Ϊ"+n);*/
		/*4)����9����product* */
		/*int a,product=1,n=0;
		for(a=20;a>+0;a--){
			product=s*a;//��ͬ��s*=a;
			n++;
		}
		System.out.println("20!="+s+",������׳˴���"+n);*/
		/*5)�ֱ����1-100֮��������� ��ż����//n+=2����n=n+2*/
		/*int n,s=0,t=0,i=0,j=0;
		for(n=1;n<=100;n++){//=int n=1;for(;n<100;n++){}
			if(n%2!=0){
				System.out.println(n+"��ż��");
				t=t+n;
				i++;
			}else{
				System.out.println(n+"������");
				s=s+n;
				j++;
			}
		}
		System.out.println("1-100��ż������Ϊ"+i+","+"ż����"+t+";"+"1-100��ż������Ϊ"+j+","+"������"+s+"��");*/
		/*6)һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��*/
		/*int a,b,c,d,e,m;
		 Scanner input=new Scanner(System.in);
		while(true){ m=input.nextInt();
		 a=m/10000;//��λ
		 b=m%10000/1000;//ǧλ
		 c=m%1000/100;//��λ
		 d=m%100/10;//ʮλ
		 e=m%10;//��λ
		 if(a==e&&b==d){
			 System.out.println(m+"�ǻ�����");
		 }else{System.out.println(m+"���ǻ�����");}}*/
  
	}
}
