package TestNG_JUnit_Task.TestNG_JUnit_Task;

public class Square extends Shape {

	double length;

	public Square(double length) {
		try {
			if (length > 0) {
				this.length = length;
			} else
				throw new Exception("length can't be zero");
		} catch (Exception e) {
			this.length = 0;
		}
		
	}

	@Override
	public double getArea() {
		try {
			return this.length * this.length;
		} catch (Exception e) {
			return 0;
		}

	}

}
