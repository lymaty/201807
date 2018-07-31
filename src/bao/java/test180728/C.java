package bao.java.test180728;

public class C {
		 long ID;
		 String name;
		 public static int mark=0;
		 public C(String name) {
		        this.ID=++mark;
		        this.name=name;
		    }
		    public void ChangeId(int a) {
		        this.ID=a;
		    }
		    public C() {
		    }
}
