package net.franckbenault.testcatchexception.pk1;


import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.googlecode.catchexception.CatchException.*;

public class FooTestCase {

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
	public void test() {
		List<String> myList = new ArrayList<String>();
			
		verifyException(myList, IndexOutOfBoundsException.class).get(1);
	}

}
