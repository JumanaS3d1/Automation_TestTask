package TestNG_JUnit_Task.TestNG_JUnit_Task;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestRectangleWithparameters {
	@Parameters({ "width", "height", "area" })
	@Test
	public void testRectangleWithParams(String width, String height, String area) {

		double testHeight = Double.parseDouble(height);
		double testWidth = Double.parseDouble(width);
		double testArea = Double.parseDouble(area);

		Rectangle rectangle = new Rectangle(testWidth, testHeight);
		assertEquals(rectangle.getArea(), testArea);
	}

}
