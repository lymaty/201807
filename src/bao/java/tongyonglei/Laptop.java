package bao.java.tongyonglei;
/*2������һ���ʼǱ��࣬��������ɫ��char����cpu�ͺţ�int���������ԡ� 
3.1 �޲κ��вε��������췽�����вι��췽�������ڴ��������ͬʱΪÿ�����Ը�ֵ��
3.2  ����ʼǱ���Ϣ�ķ���
3.3  Ȼ���дһ�������࣬���ԱʼǱ���ĸ���������*/
public class Laptop {
	private char color;
	private int cpu;
	public Laptop(){
		super();
	}
	public Laptop(char color,int cpu){
		super();
		this.color=color;
		this.cpu=cpu;
	}
	public String toString(){
		return "�ʼǱ�����ɫ��"+this.color+"���ʼǱ���CPU�ͺ���"+this.cpu;
	}
	

}
