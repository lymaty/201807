package bao.java.musicalInstruments;

public class Flute extends MusicalInstruments  {

	public Flute(){
		super();
	}
	//���ø��๹�췽��
	public Flute(String name){
		super(name);
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		//���û������ֵ
		System.out.println(super.getName()+"����ķ�ʽ�Ǵ���");
	}

}
