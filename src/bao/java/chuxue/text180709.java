package bao.java.chuxue;
import java.util.*;
import java.lang.*;
public class text180709 {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		/*1）题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
		*例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
		*1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。*/
		/*int a,b,c,sum,i=0,j=0;
		for(int m=100;m<=999; m++){
			a=m/100;
			b=m%100/10;
			c=m%10;
			//sum=(int)(Math.pow((double)a, (double)3)+Math.pow((double)b, (double)3)+Math.pow((double)c, (double)3));
			if(m==Math.pow(a,3)+Math.pow(b, 3)+Math.pow(c, 3)){//
				System.out.println(m+"是水仙花数");
				i++;
			}
			//if(m==sum){
			//	System.out.println(m+"是水仙花数");
			//	i++;
			//}else{//System.out.println(m+"不是水仙花数");j++;
				
			//}
		}
	System.out.println("100到999中水仙花数的个数是"+i);/*
		/*2)题目：利用条件运算符的嵌套来完成此题：
		 * 学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。 */
        /*int a,b,c,n=0;
        Scanner input=new Scanner(System.in);
		while(true){
			a=input.nextInt();
			if(a>=90){System.out.println(a+"是A");
			}else if(a>=60){System.out.println(a+"是B");
			}else{System.out.println(a+"是C");
			}
			n++;
			if(n==3){System.out.println("不输出第三名同学成绩");continue;}//本次不执行循环，即不执行n==3时的循环语句。
			if(n==5){System.out.println("输入第五名同学成绩结束");return;}//结束整个方法，做返回值
			if(n==10){System.out.println("10名同学成绩已判断完毕");break;}//跳出死循环	
					
		}*/
		/*3）题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 
		 * 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。* */
		/*int a=1,b=1,c=1,d,n=0,s;
		//int m=a*100+b*10+c;
		for(a=1;a<=4;a++){
			for(b=1;b<=4;b++){
				if(a!=b){//排除a与b相等情况,
					for(c=1;c<=4;c++){
						if（a!=c&&b!=c)//排除c/a/b相等情况，可直接在此一起判断a！=b，而不需要在b循环中先判断。
							{
							s=a*100+b*10+c;
							//if(s!=m){无用数据，只有100对比，而对其他数字无用。
								System.out.println(s);
								n++;
								//}
							}
						}
				}
			}
		}
		System.out.println("1、2、3、4可组成的互不相同且无重复数字的三位数的个数为"+n);*/
		/*4)计算9！积product* */
		/*int a,product=1,n=0;
		for(a=20;a>+0;a--){
			product=s*a;//等同于s*=a;
			n++;
		}
		System.out.println("20!="+s+",共计算阶乘次数"+n);*/
		/*5)分别计算1-100之间的奇数和 和偶数和//n+=2等于n=n+2*/
		/*int n,s=0,t=0,i=0,j=0;
		for(n=1;n<=100;n++){//=int n=1;for(;n<100;n++){}
			if(n%2!=0){
				System.out.println(n+"是偶数");
				t=t+n;
				i++;
			}else{
				System.out.println(n+"是奇数");
				s=s+n;
				j++;
			}
		}
		System.out.println("1-100内偶数个数为"+i+","+"偶数和"+t+";"+"1-100内偶数个数为"+j+","+"奇数和"+s+"。");*/
		/*6)一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。*/
		/*int a,b,c,d,e,m;
		 Scanner input=new Scanner(System.in);
		while(true){ m=input.nextInt();
		 a=m/10000;//万位
		 b=m%10000/1000;//千位
		 c=m%1000/100;//百位
		 d=m%100/10;//十位
		 e=m%10;//个位
		 if(a==e&&b==d){
			 System.out.println(m+"是回文数");
		 }else{System.out.println(m+"不是回文数");}}*/
  
	}
}
