package bao.java.test180728;

import java.util.ArrayList;
import java.util.List;

public class AllCourse {
	List<C> CourseList = new ArrayList<C>();
    public void AddCourse(C a) {
        this.CourseList.add(a);
    }

    public boolean CourseExist(String a) {
        for (int i=0;i<CourseList.size();i++) {
            C tmp = (C)CourseList.get(i);
            if (tmp.name == a) return true;
        }
        return false;
    }

    public boolean CourseExist(int id) {
        C a=new C();
        if (id>0 && id<=a.mark) {
            return true;
        }
        return false;

    }

    public void PrintCourseList() {
        for (int i=0;i<CourseList.size();i++) {
            C a=(C)CourseList.get(i);
            System.out.println(a.ID+" "+a.name);
        }
        if (CourseList.size()==0) {
            System.out.println("你还没有选择任何课程");
        }
    }

    public void CourseInit() {

        C a = new C("高等数学");
        CourseList.add(a);
        C b = new C("大学英语");
        CourseList.add(b);
        C c = new C("Java");
        CourseList.add(c);
        C d = new C("C++");
        CourseList.add(d);
    }

    public String ReturnCourseName(int aa) {
        C a=new C();
        for (int i=0;i<CourseList.size();i++) {
            a=(C)CourseList.get(i);
            if (a.ID==aa) break;
        }
        return a.name;
    }


}