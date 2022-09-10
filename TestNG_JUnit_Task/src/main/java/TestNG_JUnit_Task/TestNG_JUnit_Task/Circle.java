package TestNG_JUnit_Task.TestNG_JUnit_Task;

public class Circle extends Shape {

	double r;

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
			return (Math.PI * Math.pow(this.r, 2));
		} catch (Exception e) {
			return 0;
		}
	}

}
