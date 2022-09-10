package TestNG_JUnit_Task.TestNG_JUnit_Task;

public class Trapezoid extends Shape{

	double shortA;
	double longB;
	double height;
	
	public Trapezoid(double shortA, double longB, double height) {
		try {
			if(((shortA+longB)>0)&& (height>0)) {
				this.shortA=shortA;
				this.longB=longB;
				this.height=height;
			}
			else {
				this.shortA=0;
				this.longB=0;
				this.height=0;
			}
		} catch (Exception e) {
			this.shortA=0;
			this.longB=0;
			this.height=0;
		}
	}
	@Override
	public double getArea() {
	try {
		return (((this.shortA+this.longB)*.5)*this.height);
	} catch (Exception e) {
		return 0;
	}
	}

}
