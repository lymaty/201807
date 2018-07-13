package bao.java.graph;
//圆形
public class Circle extends Graph{
	private double radius;
	public Circle(){}
	public Circle(double radius){
		/*super();*/
		this.radius=radius;
	}

	@Override
	public double graphPerimeter() {
		
		// TODO Auto-generated method stub
		
		return 2*radius*Math.PI;
	}

	@Override
	public double graphArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	public String toString(){
		
		return "圆形的周长是"+this.graphPerimeter()+"圆形的面积是"+this.graphArea();
	}

}
