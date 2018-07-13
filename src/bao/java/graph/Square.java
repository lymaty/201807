package bao.java.graph;

public class Square extends Graph{
	private double side;
	public Square(double side){
		this.side=side;
	}

	@Override
	public double graphPerimeter() {
		// TODO Auto-generated method stub
		return 4*this.side;
	}

	@Override
	public double graphArea() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}
	public String toString(){
		return "方形的周长是"+this.graphPerimeter()+"方形的面积是"+this.graphArea();
	}

}
