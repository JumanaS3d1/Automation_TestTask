package TestNG_JUnit_Task.TestNG_JUnit_Task;

public class Sector extends Shape{
	double angle;
	double radius;
	
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
			return (((this.radius*this.radius*0.5)*this.angle));
		} catch (Exception e) {
			return 0;
		}

	}
}
