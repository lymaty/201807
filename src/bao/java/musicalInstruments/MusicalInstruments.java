package bao.java.musicalInstruments;
/*1)����һ������musical instruments �� ����һ�����󷽷� ����
2)������������ ����piano ����flute �ַ���accordion  ��д�����еķ��� play���� ���岻ͬ�����෽ʽ
3)ͨ����ֵ��̬�ʹ��ζ�̬�� ��ʽ ���ò�ͬ�����෽ʽ ʵ�ֶ�̬����*/
public abstract class MusicalInstruments {
	private String name;
	public MusicalInstruments(){
		super();
	}
	public MusicalInstruments(String name){
		this.name=name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public abstract void play();

}
