package bao.java.musicalInstruments;

public class Accordion extends MusicalInstruments{
	public Accordion(){
		super();
	}
	//���ø��๹�췽��
	public Accordion(String name){
		super(name);
		}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"����ķ�ʽ������");
	}

}
