package bao.java.test180719.MainPackage;

public class MainClass {
	private int no;
	private String name;
	
	public MainClass() {
		super();
	}

	public MainClass(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MainClass [no=" + no + ", name=" + name + "]";
	}
	

}
