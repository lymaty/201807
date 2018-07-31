package bao.java.test180728;
import java.util.ArrayList;
import java.util.List;
public class S {
		int ID;
	    String name;
	    List<C> CourseSelected = new ArrayList<C>();
	    public S(int num,String name) {
	        this.ID=num;
	        this.name=name;
	    }

	    public S() {

	    }
	    public int compare(S aa,S bb) {
	        if (aa.ID>bb.ID) return 1;
	        if (aa.ID<bb.ID) return -1;
	        return 1;
	    

	}
}
