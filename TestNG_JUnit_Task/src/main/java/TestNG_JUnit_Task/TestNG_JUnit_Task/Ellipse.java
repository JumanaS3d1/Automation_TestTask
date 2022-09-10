package TestNG_JUnit_Task.TestNG_JUnit_Task;

public class Ellipse extends Shape{

	double a_axis;
	double b_axis;

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
			return (Math.PI * (this.a_axis * this.b_axis));
		} catch (Exception e) {
			return 0;
		}

	}

}
