package bao.java.tongyonglei;

public abstract class Auto {
	//建立一个汽车Auto类，包括轮胎个数，汽车颜色，车身重量、速度等属性。并通过不同的构造方法创建实例。
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

	////至少要求：??汽车能够加速，减速，停车的功能。
	public abstract String speedUp(double speed);
	public abstract void speedDown(double speed);
	public String stop(){
		return this.mark+"汽车已停止,此时速度为："+this.speed;
	};

}
