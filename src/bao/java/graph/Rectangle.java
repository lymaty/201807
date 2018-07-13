package bao.java.graph;

public class Rectangle extends Graph{
	private double length;
	private double width;
	public Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	
	@Override
	public double graphPerimeter() {
		// TODO Auto-generated method stub
		return 2*(this.length+this.width);
	}
	@Override
	public double graphArea() {
		// TODO Auto-generated method stub
		return this.length*this.width;
	}
	public String toString(){
		return "长方形的周长是"+this.graphPerimeter()+"长方形的面积是"+this.graphArea();
	}

}
