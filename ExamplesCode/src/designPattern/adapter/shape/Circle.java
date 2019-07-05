package designPattern.adapter.shape;

public class Circle implements Shape {

	private double radio;

	public Circle(double radio) {
		super();
		this.radio = radio;
	}
	
	

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}



	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public void resize() {
		System.out.println("Resizing Circle");
	}

	@Override
	public String description() {
		return "Circle object";
	}

	@Override
	public boolean isHide() {
		return false;
	}

	public double area(){
		return radio * radio * 3.14;  ///Decorator Pattern:
	}
}
