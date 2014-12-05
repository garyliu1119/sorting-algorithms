package com.dsi.recursion.sorting;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dsi.recursion.sorting.MergeSort;
import com.dsi.recursion.sorting.impl.MergeSortImpl;

public class MergeSortTest {
	
	private MergeSort mergeSort;
	
	@Before
	public void init() {
		mergeSort = new MergeSortImpl();
	}
	
	@Test
	public void testMerge () {
		int [] inArray = {1, 4, 6, 2, 3, 5, 7, 8 };
		
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int [] outArray = this.mergeSort.mergeSort(inArray);
		
		Assert.assertTrue(Arrays.equals(outArray, expected));
		
	}

}
