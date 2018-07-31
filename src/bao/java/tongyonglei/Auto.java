package bao.java.tongyonglei;

public abstract class Auto {
	//����һ������Auto�࣬������̥������������ɫ�������������ٶȵ����ԡ���ͨ����ͬ�Ĺ��췽������ʵ����
	private String mark;
	private String price;
	private int tyrenumber;
	private String color;
	private double weight;
	private double speed;
	public Auto(){}
	

	public Auto(String mark, String price,int tyrenumber, String color, double weight, double speed) {
		super();
		this.mark = mark;
		this.price = price;
		this.tyrenumber = tyrenumber;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	
	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the tyrenumber
	 */
	public int getTyrenumber() {
		return tyrenumber;
	}

	/**
	 * @param tyrenumber the tyrenumber to set
	 */
	public void setTyrenumber(int tyrenumber) {
		this.tyrenumber = tyrenumber;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Auto [mark=" + mark + ", price=" + price + ", tyrenumber=" + tyrenumber + ", color=" + color
				+ ", weight=" + weight + ", speed=" + speed + "]";
	}

	////����Ҫ��??�����ܹ����٣����٣�ͣ���Ĺ��ܡ�
	public abstract String speedUp(double speed);
	public abstract void speedDown(double speed);
	public String stop(){
		return this.mark+"������ֹͣ,��ʱ�ٶ�Ϊ��"+this.speed;
	};

}
