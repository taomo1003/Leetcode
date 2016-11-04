package leetcoder;

import org.junit.*;

public class test {
	
	@Test
	public void testCase1() {
		no_207 test = new no_207();
		int numCourses = 4;
		int[][] prerequisites = {{0,1},{1,2},{2,3}};
		Assert.assertTrue(test.canFinish(numCourses, prerequisites));
	}
}
