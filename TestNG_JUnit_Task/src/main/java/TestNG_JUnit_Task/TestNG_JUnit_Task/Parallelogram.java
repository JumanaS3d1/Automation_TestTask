package TestNG_JUnit_Task.TestNG_JUnit_Task;

public class Parallelogram extends Shape {

	double base;
	double height;

	public Parallelogram(double base, double height) {
		try {
			if ((base > 0)&&(height > 0)) {
				this.base = base;
				this.height = height;
			}else {
				this.base = 0;
				this.height = 0;
			}
		} catch (Exception e) {
			this.base = 0;
			this.height = 0;
		}

	}

	@Override
	public double getArea() {
		try {
			return (this.base*this.height);
		} catch (Exception e) {
			return 0;
		}
	}

}
