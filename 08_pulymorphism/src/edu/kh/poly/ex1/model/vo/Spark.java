package edu.kh.poly.ex1.model.vo;

public class Spark extends Car {
	private double disscountOffer ; // 할인 혜택
	
	public Spark() {}

	public Spark(int wheel, int seat, String fuel, double disscountOffer) {
		super(wheel, seat, fuel);
		this.disscountOffer = disscountOffer;
	}
	public double getDisscountOffer() {
		return disscountOffer;
	}
	public void setDisscountOffer(double disscountOffer) {
		this.disscountOffer = disscountOffer;
	}
	
	@Override
	public String toString() {
		return super.toString()  + " / 할인 혜택 : " + disscountOffer;
				
	}

	public void dc() {
		System.out.println(" 할인이 됩니다. ");
		
	}


}


