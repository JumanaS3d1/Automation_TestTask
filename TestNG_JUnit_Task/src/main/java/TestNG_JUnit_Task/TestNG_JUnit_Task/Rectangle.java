package TestNG_JUnit_Task.TestNG_JUnit_Task;

public class Rectangle extends Shape {
	double width;
	double height;

	public Rectangle(double width, double height) {
		try {
			if (width > 0 && height > 0) {
				this.width = width;
				this.height = height;
			} else
				throw new Exception("width or height can't be zero");
		} catch (Exception e) {
			this.width = 0;
			this.height = 0;
		}
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
