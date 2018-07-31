package bao.java.test180728;
import java.util.ArrayList;
import java.util.List;
public class SCListGo {
	 public static int NowPos = 0;
	    List<S> SCList = new ArrayList<S>();
	    public void AddStudent(S a) {
	        SCList.add(a);
	        NowPos=SCList.size()-1;
	    }
	    public String StudentExist(int a) {
	        for (int i=0;i<SCList.size();i++) {
	            S tmp2 = (S)SCList.get(i);
	            if (a == tmp2.ID) {
	                NowPos=i;
	                return tmp2.name;
	            }
	        }
	    return "111111";
	    }

	    public boolean StudentCourseExist(int CID) {
	        S b=(S)SCList.get(NowPos);
	        for (int i=0;i<b.CourseSelected.size();i++) {
	            C c=b.CourseSelected.get(i);
	            if (c.ID==CID) return true;
	        }
	        return false;
	    }

	    public void CourseDelete(int CID) {
	        S b=SCList.get(NowPos);
	        for (int i=0;i<b.CourseSelected.size();i++) {
	            C c=b.CourseSelected.get(i);
	            if (c.ID==CID) {
	                b.CourseSelected.remove(i); 
	                return;
	            }
	         }      
	    }

	    public void AddCourse(C a) {
	        S b=(S)SCList.get(NowPos);
	        C c=new C();
	        for (int i=0;i<b.CourseSelected.size();i++) {
	            c=b.CourseSelected.get(i);      
	        }
	        b.CourseSelected.add(a);
	        for (int i=0;i<b.CourseSelected.size();i++) {
	            a=b.CourseSelected.get(i);
	        }
	        SCList.set(NowPos, b);
	    }

	    public static int Compare(S aa,S bb) {
	        if (aa.ID>bb.ID) return 1;
	        if (aa.ID<bb.ID) return -1;
	        return 1;
	    }
	    public void PrintSCInfo() {
	        int flag1=0;
	        int flag2=0;
	        for (int i=0;i<SCList.size();i++) {
	            flag1=1;
	            S b = (S)SCList.get(i);
	            System.out.println("Ñ§ºÅ£º"+b.ID+"  ÐÕÃû£º"+b.name);
	            System.out.println();}
	    }
}