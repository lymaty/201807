package bao.java.musicalInstruments;

public class Flute extends MusicalInstruments  {

	public Flute(){
		super();
	}
	//调用父类构造方法
	public Flute(String name){
		super(name);
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		//调用获得属性值
		System.out.println(super.getName()+"弹奏的方式是吹奏");
	}

}
