package bao.java.graph;
//6�� ����һ��ͼ���� 
//1)�м������area�ͼ����ܳ�perimeter�ĳ��󷽷�
//2)����ͼ��������� Բ�� ������ ������ �ֱ����Լ��ļ�������ͼ����ܳ�
//3)����main���� ���в���
//
public abstract class Graph {
	//ͼ�ε����Բ�ͬ��������ܳ��Ƿ�����
	private double perimeter;
	private double area;
	//����Ĺ��췽�����Զ����ݸ�����
	public Graph(){
		/*System.out.println("���׵¹��췽��");*/
	};
	
	public abstract double graphPerimeter();
	public abstract double graphArea();

	

	
}
