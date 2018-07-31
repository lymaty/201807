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
	            System.out.println(" 欢迎进入学生选课系统");
	            System.out.println("请输入你的学号");
	            num=console.nextInt();
	            id=num;
	           /* if (num == 19921210) {
	                System.out.println("你好，管理员，请输入管理员密码");
	                num=console.nextInt();
	               int flag=0;
	                while(num!=888888){
	                    System.out.println("管理员密码错误，请重新输入");
	                    System.out.println("输入54138退出管理员模式");
	                    num=console.nextInt();
	                    if(num==54138) {
	                        flag=1;
	                        break;
	                    }
	                }
	                if (flag==1) continue;

  //************************************管理员模式代码*****************************************
	                System.out.println("你好，管理员！请输入要执行的操作代码");
	                while(true) {
	                    System.out.println("1 查看课程");
	                    System.out.println("2 添加课程");
	                    System.out.println("3 查看所有学生及选课信息");
	                    System.out.println("4 退出管理员模式");
	                    int tmp;
	                    tmp=console.nextInt();
	                    while (tmp<=0 || tmp>=5) {
	                        System.out.println("代码错误，请输入1到4之间的代码");
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
	                    