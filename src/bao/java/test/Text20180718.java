package bao.java.test;
import java.util.Scanner;

public class Text20180718 {
	public static void main(String[] args) {
		//1，编写一个程序，输出一个字符串中的大写英文字母数，小写英文字母数以及非英文字母数。
		//提示:A-Z 65-90,a-z 97-122;字符串转数组char[]  c=toCharArray();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个字符串，要求包括大写英文字母、小写英文字母、数字和其他");
		String string1=input.nextLine();
		System.out.println("打印输出定义的字符串");
		System.out.println(string1);
		System.out.println("字符串的长度是："+string1.length());
		
		/*//将string1转换成arr[];
		char[] arr=string1.toCharArray();
		//输出arr[]
		System.out.println("输出数组char类型数组arr[]");
		for(char char1:arr){System.out.print(char1);}
		search(arr);
		//2  编写程序将 “jdk” 全部变为大写,并输出到屏幕,截取子串”DK” 并输出到屏幕
		//提示substring(1,4)
		String string2="jdk";
		String string3=string2.toUpperCase();
		System.out.println(string3);
		String string4=string3.substring(1);
		System.out.println(string4);*/
	}
	//遍历数组char[] arr,查找大写字母、小写字母和非英文字母。
	/*public static void search(char[] arr){
		int Anumber=0;
		int anumber=0;
		int onumber=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=90&&arr[i]>=65){//判断是否为大写英文字母A-Z,65-90
				Anumber++;
				//System.out.print(arr[i]+"是大写字母，");
			}else if(arr[i]<=122&&arr[i]>=97){
				anumber++;
				//System.out.print(arr[i]+"是小写字母，");
				}else{
					onumber++;
					//System.out.print(arr[i]+"是非英文字母，");		
			}
		}
		System.out.println("字符串string1中的大写英文字母数目是："+Anumber+",小写英文字母数目是："+anumber+",非英文字母数目是："+onumber);
	}*/
}
