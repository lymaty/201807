package bao.java.interfaces;

public interface FirstInterface extends SecondInterface {//�����ʵ��implements�ӿڣ��ӿڼ��ܼ̳�extends,
	int t=0;//Ĭ��Ϊpublic static final���εĳ�����
	final int cpu=8;//�ӿ���ֻ����public/static/final���α���
	
	public void ader();//Ĭ��Ϊabstract ����
	/*//Ϊʲôģ�����ӿ��л���ʾ��error exist  required project
	 * public static void main(String[] args) {
		System.out.println("w");
	}*/

}
