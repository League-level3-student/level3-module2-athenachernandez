package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	String[] words = {"one", "two", "three", "four", "five"};
	int[] nums = {1, 2, 3, 4, 5};
	int[] moreNums = {6, 12, 18, 24, 30};
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(2, _00_LinearSearch.linearSearch(words, "three"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "six"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(2, _01_BinarySearch.binarySearch(nums, 1, 5, 3));
		assertEquals(2, _01_BinarySearch.binarySearch(nums, 1, 4, 3));
		assertEquals(-1, _01_BinarySearch.binarySearch(nums, 3, 4, 1));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(moreNums, 2));
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(moreNums, 6));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(nums, 2));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(nums, 6));
	}
}
