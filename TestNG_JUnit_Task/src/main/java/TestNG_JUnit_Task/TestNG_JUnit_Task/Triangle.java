package TestNG_JUnit_Task.TestNG_JUnit_Task;

public class Triangle extends Shape {

	double base;
	double height;

	public Triangle(double base, double height) {
		try {
			if ((base > 0) && (height > 0)) {
				this.base = base;
				this.height = height;
			} else {
				throw new Exception("base or height can't be zero");
			}
		} catch (Exception e) {
			this.base = 0;
			this.height = 0;
		}

	}

	@Override
	public double getArea() {
		try {
			return (0.5 * this.base * this.height);
		} catch (Exception e) {
			return 0;
		}

	}

}
