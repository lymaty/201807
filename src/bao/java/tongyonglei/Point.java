package bao.java.tongyonglei;
/*3������һ������Point������2����Ա����x��y�ֱ��ʾx��y���꣬
2��������Point()��Point(int x0,y0),�Լ�һ��movePoint��int dx,int dy������ʵ�ֵ��λ���ƶ���
��������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2������*/

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
		System.out.println("�ƶ�ǰ�ĵ�������("+this.x+","+this.y+").");
	}
	public void movePoint(int dx,int dy){
		int d1=dx;
		int d2=dy;
		this.x+=dx;
		this.y+=dy;
		
		System.out.println("�ƶ���ĵ�������("+this.x+","+this.y+").");
	}

}
