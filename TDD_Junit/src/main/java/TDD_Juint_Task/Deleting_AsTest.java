package TDD_Juint_Task;
import static org.junit.Assert.*;

import org.junit.Test;



public class Deleting_AsTest {

	@Test
	public void test1() {
		assertEquals("BCD",Deleting_As.del("ABCD"));
	}
	@Test
	public void test2() {
		assertEquals("CD",Deleting_As.del("AACD"));
	}
	@Test
	public void test3() {
		assertEquals("BCD",Deleting_As.del("BACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",Deleting_As.del("BBAA"));
	}
	@Test
	public void test5() {
		assertEquals("BAA",Deleting_As.del("AABAA"));
	}
	@Test
	public void test6() {
		assertEquals("",Deleting_As.del(""));
	}
	@Test
	public void test7() {
		assertEquals("",Deleting_As.del("A"));
	}

}
