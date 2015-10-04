package quiz3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testTriangle {

	Triangle t;
	
	@Before
	public void setUp() throws Exception {
		
		t = new Triangle(3, 4, 5);
	
	}
	@After
	public void tearDown() throws Exception {
		
		t = null;
	}

	@Test
	public void test() {
		
		System.out.println(t.getArea());
		assertEquals(6.0, t.getArea(), 0);
		
		assertEquals(12.0, t.getPerimeter(), 0);
	}

}
