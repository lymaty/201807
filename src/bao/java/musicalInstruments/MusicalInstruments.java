package bao.java.musicalInstruments;
/*1)定义一个乐器musical instruments 类 定义一个抽象方法 弹奏
2)定义他的子类 钢琴piano 笛子flute 手封琴accordion  重写父类中的方法 play（） 定义不同的演奏方式
3)通过赋值多态和传参多态的 形式 调用不同的演奏方式 实现动态调用*/
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
