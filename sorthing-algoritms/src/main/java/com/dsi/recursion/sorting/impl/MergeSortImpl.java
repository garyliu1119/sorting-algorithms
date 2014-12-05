package com.dsi.recursion.sorting.impl;

import com.dsi.recursion.sorting.MergeSort;

public class MergeSortImpl implements MergeSort {
	private int [] input;
	private int [] output;
	
	public int[] mergeSort(int [] input) 
	{
		if (input == null) return null;
		this.input = input;
		this.output = new int [input.length];
		this.doMergeSort(0, input.length-1);
		return this.output;
	}
	
	private void doMergeSort(int lowerIndex, int higherIndex) {
		if( lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex)/2;
			doMergeSort(lowerIndex, middle);
			doMergeSort(middle+1, higherIndex);
			merge(lowerIndex, middle, higherIndex);
		}
		
	}
	
	public void merge(int start, int middle, int end) {
		
		int k = start;
		int j = middle;
		int i = start;
		
		while ( i<middle && j < end) {
			if(input[i] < input[j]) {
				output[k] = input[i] ;
				i++;
			} else {
				output[k] = input[j];
				j++;
			}
			k++;
		}
		
		for (int l = j; l<end+1; l++ ) {
			output[l] = input[l];
		}
		
		for (int m = i; m < middle; m++) {
			output[m] = input[m];
		}
	}

}
