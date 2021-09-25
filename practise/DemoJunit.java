package code;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class DemoJunit {
	@Test
	public void testMethod() {

		String msg = "Test this string";
		assertEquals("Test this string", msg);
	}
}
