package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestFirstTriangle1() {
		Triangle t = new Triangle(5,6,7);
		assertTrue(t.getArea() == Math.pow(216, 0.5));
		assertTrue(t.getPerimeter() == 18);
		assertTrue(t.getSide1() == 5);
		assertTrue(t.getSide2() == 6);
		assertTrue(t.getSide3() == 7);
	}
	@Test
	public void TestFirstTriangle2() {
		Triangle t = new Triangle(3,4,5);
		assertTrue(t.getArea() == 6);
		assertTrue(t.getPerimeter() == 12);
		assertTrue(t.getSide1() == 3);
		assertTrue(t.getSide2() == 4);
		assertTrue(t.getSide3() == 5);
	}
	@Test
	public void TestFirstTriangle3() {
		Triangle t = new Triangle();
		assertTrue(t.getArea() == (Math.pow(3,0.5))/4);
		assertTrue(t.getPerimeter() == 3);
		assertTrue(t.getSide1() == 1);
		assertTrue(t.getSide2() == 1);
		assertTrue(t.getSide3() == 1);
		System.out.println(t.toString());
	}

}
