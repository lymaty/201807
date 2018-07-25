package bao.java.interfaces;

public interface FirstInterface extends SecondInterface {//类可以实现implements接口，接口间能继承extends,
	int t=0;//默认为public static final修饰的常量。
	final int cpu=8;//接口中只能用public/static/final修饰变量
	
	public void ader();//默认为abstract 方法
	/*//为什么模版类或接口中会提示：error exist  required project
	 * public static void main(String[] args) {
		System.out.println("w");
	}*/

}
