package bao.java.test180728;

import java.util.Scanner;
public class ToSelect {
	 public static void main(String[] args) {
	        //Init The Class
	        AllCourse allcourse=new AllCourse();
	        S student=new S();
	        SCListGo e=new SCListGo();
	        C god=new C();
	        Scanner console=new Scanner(System.in);
	        allcourse.CourseInit();
	        int num;
	        int id;
	        String name;        
	        while(true) {
	            System.out.println(" ��ӭ����ѧ��ѡ��ϵͳ");
	            System.out.println("���������ѧ��");
	            num=console.nextInt();
	            id=num;
	           /* if (num == 19921210) {
	                System.out.println("��ã�����Ա�����������Ա����");
	                num=console.nextInt();
	               int flag=0;
	                while(num!=888888){
	                    System.out.println("����Ա�����������������");
	                    System.out.println("����54138�˳�����Աģʽ");
	                    num=console.nextInt();
	                    if(num==54138) {
	                        flag=1;
	                        break;
	                    }
	                }
	                if (flag==1) continue;

  //************************************����Աģʽ����*****************************************
	                System.out.println("��ã�����Ա��������Ҫִ�еĲ�������");
	                while(true) {
	                    System.out.println("1 �鿴�γ�");
	                    System.out.println("2 ��ӿγ�");
	                    System.out.println("3 �鿴����ѧ����ѡ����Ϣ");
	                    System.out.println("4 �˳�����Աģʽ");
	                    int tmp;
	                    tmp=console.nextInt();
	                    while (tmp<=0 || tmp>=5) {
	                        System.out.println("�������������1��4֮��Ĵ���");
	                    }
	                    if (tmp == 4) break;
	                    if (tmp == 1) {
	                        allcourse.PrintCourseList();
	                        continue;
	                    }
	                    //String Tmp=new String();
	                }
	            }*/
	        }
	 }
}
	                    