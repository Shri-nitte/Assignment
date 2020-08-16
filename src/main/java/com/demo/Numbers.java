package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {

	static List<Integer> getMaxOfcontiguousArray(int arr[], int n, int k) {

		int i = 0;
		int j = 0;

		ArrayList<Integer> maxNumbersList = new ArrayList<Integer>();

		while (i < (n - k + 1)) {
			int maxNumber = arr[i];
			for (j = 0; j < k; j++) {
				if (maxNumber < arr[i + j]) {
					maxNumber = arr[i + j];
				}
			}
			maxNumbersList.add(maxNumber);
			i++;
			j = 0;
		}
		return maxNumbersList;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int k = 3;
		int arr1[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
		int k1 = 4;

		int n = arr.length;
		int n1 = arr1.length; 
		List<Integer> result1 = getMaxOfcontiguousArray(arr, n, k);
		List<Integer> result2 = getMaxOfcontiguousArray(arr1, n1, k1);

		System.out.println("input 1:"+Arrays.toString(arr));
		System.out.println("result 1 : " + result1);
		System.out.println("input 2:"+Arrays.toString(arr1));
		System.out.println("result 2 : " + result2);

	}

}
