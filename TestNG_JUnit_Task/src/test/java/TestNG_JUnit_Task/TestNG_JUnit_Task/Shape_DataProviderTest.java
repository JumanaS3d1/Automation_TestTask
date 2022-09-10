package TestNG_JUnit_Task.TestNG_JUnit_Task;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Shape_DataProviderTest {

//------------------------------------ Data Parsing --------------------- 
	@DataProvider(name = "SquareData")
	public static Object[][] getData_Square() throws Exception {
		return getData_Shape("SquareData.csv");
	}

	@DataProvider(name = "CircleData")
	public static Object[][] getData_Circle() throws Exception {
		return getData_Shape("CircleData.csv");
	}
	
	@DataProvider(name = "EllipseData")
	public static Object[][] getData_Ellipse() throws Exception {
		return getData_Shape("EllipseData.csv");
	}
	
	@DataProvider(name = "ParallelogramData")
	public static Object[][] getData_Parallelogram() throws Exception {
		return getData_Shape("ParallelogramData.csv");
	}
	
	@DataProvider(name = "SectorData")
	public static Object[][] getData_Sector() throws Exception {
		return getData_Shape("SectorData.csv");
	}
	
	@DataProvider(name = "TriangleData")
	public static Object[][] getData_Triangle() throws Exception {
		return getData_Shape("TriangleData.csv");
	}
	
//------------------------------------- Tests -----------------------------
	
	@Test(dataProvider = "SquareData")
	public void testData_Square(String length, String area) {

		double lenInt = Double.parseDouble(length);
		double areaInt = Double.parseDouble(area);
		Square sq = new Square(lenInt);
		assertEquals(sq.getArea(), areaInt);
	}

	@Test(dataProvider = "CircleData")
	public void testData_Circle(String radius, String area) {

		double radiusDouble = Double.parseDouble(radius);
		double areaDouble = Double.parseDouble(area);
		Circle circle = new Circle(radiusDouble);
		assertEquals(circle.getArea(), areaDouble);
	}
	
	@Test(dataProvider = "EllipseData")
	public void testData_Ellipse(String a_axis, String b_axis, String area) {

		double aDouble = Double.parseDouble(a_axis);
		double bDouble = Double.parseDouble(b_axis);
		double areaDouble = Double.parseDouble(area);
		Ellipse ellipse = new Ellipse(aDouble,bDouble);
		assertEquals(ellipse.getArea(), areaDouble);
	}
	
	@Test(dataProvider = "ParallelogramData")
	public void testData_Parallelogram(String base, String height, String area) {

		double baseDouble = Double.parseDouble(base);
		double heightDouble = Double.parseDouble(height);
		double areaDouble = Double.parseDouble(area);
		Parallelogram parallelogram = new Parallelogram(baseDouble,heightDouble);
		assertEquals(parallelogram.getArea(), areaDouble);
	}
	
	@Test(dataProvider = "SectorData")
	public void testData_Sector(String radius, String angle, String area) {

		double radiusDouble = Double.parseDouble(radius);
		double angleDouble = Double.parseDouble(angle);
		double areaDouble = Double.parseDouble(area);
		Sector sector = new Sector(radiusDouble,angleDouble);
		assertEquals(sector.getArea(), areaDouble);
	}
	
	@Test(dataProvider = "TriangleData")
	public void testData_Triangle(String base, String height, String area) {

		double baseDouble = Double.parseDouble(base);
		double heightDouble = Double.parseDouble(height);
		double areaDouble = Double.parseDouble(area);
		Triangle triangle = new Triangle(baseDouble,heightDouble);
		assertEquals(triangle.getArea(), areaDouble);
	}

//-----------------------------------Reading Shape Data ----------------------------------

	public static Object[][] getData_Shape(String fileName) throws Exception {
		List<String[]> lines = ReadCsvFile.readAllLines(fileName);
		lines.remove(0);
		Object[][] data = new Object[lines.size()][lines.get(0).length];
		int index = 0;
		for (String[] line : lines) {
			data[index] = line;
			index++;
		}
		return data;
	}

}
