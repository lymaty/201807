package bao.java.test180719;

import bao.java.tongyonglei.*;

public class Tomcat extends Cat{
	//1���̳�
	//����һ������Cat������Tomcat��������һ�����ݳ�Ա������̳и���ĸ����ݳ�Ա��
	//ͨ�����캯����ʼ������ʾ�����ݳ�Ա��ֵ��
    public Tomcat(){}
	public Tomcat(String food){
		super.food=food;
	}
	public String food(){
		return super.food;
	}
	

}
