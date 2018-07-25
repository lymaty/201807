package bao.java.musicalInstruments;

public class Accordion extends MusicalInstruments{
	public Accordion(){
		super();
	}
	//调用父类构造方法
	public Accordion(String name){
		super(name);
		}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"弹奏的方式是手拉");
	}

}
