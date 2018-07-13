package bao.java.graph;
//6、 定义一个图形类 
//1)有计算面积area和计算周长perimeter的抽象方法
//2)创建图形类的子类 圆形 长方形 正方形 分别定义自己的计算面积和计算周长
//3)创建main方法 进行测试
//
public abstract class Graph {
	//图形的属性不同，面积和周长是方法；
	private double perimeter;
	private double area;
	//父类的构造方法会自动传递给子类
	public Graph(){
		/*System.out.println("弗雷德构造方法");*/
	};
	
	public abstract double graphPerimeter();
	public abstract double graphArea();

	

	
}
