package TestNG_JUnit_Task.TestNG_JUnit_Task;

import java.text.DecimalFormat;

public class Sector extends Shape{
	double angle;
	double radius;
	private static final DecimalFormat dfZero = new DecimalFormat("0.000");
	
	public Sector(double radius, double angle) {
	 try {
		if((radius >0) && (angle > 0)) {
			this.radius=radius;
			this.angle = angle;
		}
		else {
			this.angle=0;
			this.radius=0;
		}
	} catch (Exception e) {
		this.angle=0;
		this.radius=0;
	}
	}

	@Override
	public double getArea() {
		try {
			double result = (3.14*radius*radius*angle/360);//(((this.radius*this.radius*0.5)*this.angle)); //the commented function is not right
			return Double.parseDouble(dfZero.format(result));
		} catch (Exception e) {
			return 0;
		}

	}
}
