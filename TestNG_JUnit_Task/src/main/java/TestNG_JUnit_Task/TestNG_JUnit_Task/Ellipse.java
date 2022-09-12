package TestNG_JUnit_Task.TestNG_JUnit_Task;

import java.text.DecimalFormat;

public class Ellipse extends Shape{

	double a_axis;
	double b_axis;
	private static final DecimalFormat dfZero = new DecimalFormat("0.000");

	public Ellipse(double a_axis, double b_axis) {
		try {
			if ((a_axis > 0) && (b_axis > 0)) {
				this.a_axis = a_axis;
				this.b_axis = b_axis;
			} else {
				this.a_axis = 0;
				this.b_axis = 0;
			}

		} catch (Exception e) {
			this.a_axis = 0;
			this.b_axis = 0;
		}
	}

	public double getArea() {

		try {
			double result= (Math.PI * (this.a_axis * this.b_axis));
			return Double.parseDouble(dfZero.format(result));
		} catch (Exception e) {
			return 0;
		}

	}

}
