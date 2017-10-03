import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeometricTest {
	Geometric obj;
	int r;
	@Before
	public void setUp() throws Exception {
		obj = new Geometric();
		r = 14;
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		r = 0;
	}

	@Test
	public void testDiameter() {
		assertEquals(28.0,obj.circleDiameter(r),0.1);
	}

	@Test
	public void testCirclePerimeter() {
		assertEquals(88.0,obj.circlePerimeter(r),0.1);
	}

	@Test
	public void testCircleArea() {
		assertEquals(616.0,obj.circleArea(r),0.1);
	}

}
