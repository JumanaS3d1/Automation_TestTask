package TestNG_JUnit_Task.TestNG_JUnit_Task;

import java.text.DecimalFormat;

public class Circle extends Shape {

	double r;
	private static final DecimalFormat dfZero = new DecimalFormat("0.000");
	

	public Circle(double r) {
		try {
			if (r > 0) {
				this.r = r;
			} else
				this.r = 0;
		} catch (Exception e) {
			this.r = 0;
		}
	}

	@Override
	public double getArea() {

		try {
			double result =(Math.PI * Math.pow(this.r, 2));
			return Double.parseDouble(dfZero.format(result));
		} catch (Exception e) {
			return 0;
		}
	}

}
