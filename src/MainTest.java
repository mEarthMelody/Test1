import junit.framework.TestCase;


public class MainTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		assertEquals(3,Main.lengthOfSubString("abcabcabc"));
		assertEquals(1,Main.lengthOfSubString("ddddddddd"));
		assertEquals(3,Main.lengthOfSubString("vvvvasvvv"));
		assertEquals(5,Main.lengthOfSubString("shbhewfbh"));
		assertEquals(4,Main.lengthOfSubString("mnbc"));
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
