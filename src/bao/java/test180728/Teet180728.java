package bao.java.test180728;

import java.util.Scanner;

// 欢迎进入学生选课系统
//请选择操作：1，学生信息管理   2，课程管理  3，系统推出
//欢迎进入学生信息管理系统
//请选择操作：1.增加学生   2修改学生  3.删除学生  4.查询学生  5.打印学生  6.课程管理（学生选课）
//欢迎进入课程管理系统
//请选择操作：1  增加课程  2.修改课程3.删除课程  4.查询课程 
public class Teet180728 {
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
	            
	        }
	}

}
