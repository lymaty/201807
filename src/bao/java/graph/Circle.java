package bao.java.graph;
//Բ��
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
		
		return "Բ�ε��ܳ���"+this.graphPerimeter()+"Բ�ε������"+this.graphArea();
	}

}
