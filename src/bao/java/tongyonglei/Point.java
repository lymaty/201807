package bao.java.tongyonglei;
/*3、定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，
2个构造器Point()和Point(int x0,y0),以及一个movePoint（int dx,int dy）方法实现点的位置移动，
创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标*/

public class Point {
	public static int x;
	public static int y;
	public Point(){super();}
	public Point(int x0,int y0){
		super();
		this.x=x0;
		this.y=y0;
	}
	public void yidong(){
		System.out.println("移动前的点坐标是("+this.x+","+this.y+").");
	}
	public void movePoint(int dx,int dy){
		int d1=dx;
		int d2=dy;
		this.x+=dx;
		this.y+=dy;
		
		System.out.println("移动后的点坐标是("+this.x+","+this.y+").");
	}

}
