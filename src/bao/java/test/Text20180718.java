package bao.java.test;
import java.util.Scanner;

public class Text20180718 {
	public static void main(String[] args) {
		//1����дһ���������һ���ַ����еĴ�дӢ����ĸ����СдӢ����ĸ���Լ���Ӣ����ĸ����
		//��ʾ:A-Z 65-90,a-z 97-122;�ַ���ת����char[]  c=toCharArray();
		Scanner input=new Scanner(System.in);
		System.out.println("������һ���ַ�����Ҫ�������дӢ����ĸ��СдӢ����ĸ�����ֺ�����");
		String string1=input.nextLine();
		System.out.println("��ӡ���������ַ���");
		System.out.println(string1);
		System.out.println("�ַ����ĳ����ǣ�"+string1.length());
		
		/*//��string1ת����arr[];
		char[] arr=string1.toCharArray();
		//���arr[]
		System.out.println("�������char��������arr[]");
		for(char char1:arr){System.out.print(char1);}
		search(arr);
		//2  ��д���� ��jdk�� ȫ����Ϊ��д,���������Ļ,��ȡ�Ӵ���DK�� ���������Ļ
		//��ʾsubstring(1,4)
		String string2="jdk";
		String string3=string2.toUpperCase();
		System.out.println(string3);
		String string4=string3.substring(1);
		System.out.println(string4);*/
	}
	//��������char[] arr,���Ҵ�д��ĸ��Сд��ĸ�ͷ�Ӣ����ĸ��
	/*public static void search(char[] arr){
		int Anumber=0;
		int anumber=0;
		int onumber=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=90&&arr[i]>=65){//�ж��Ƿ�Ϊ��дӢ����ĸA-Z,65-90
				Anumber++;
				//System.out.print(arr[i]+"�Ǵ�д��ĸ��");
			}else if(arr[i]<=122&&arr[i]>=97){
				anumber++;
				//System.out.print(arr[i]+"��Сд��ĸ��");
				}else{
					onumber++;
					//System.out.print(arr[i]+"�Ƿ�Ӣ����ĸ��");		
			}
		}
		System.out.println("�ַ���string1�еĴ�дӢ����ĸ��Ŀ�ǣ�"+Anumber+",СдӢ����ĸ��Ŀ�ǣ�"+anumber+",��Ӣ����ĸ��Ŀ�ǣ�"+onumber);
	}*/
}
