package com.demo;

import java.util.*;

class TrainPlatform {

	static int getMinimumNumberOfPlatforms(int arr[], int dep[], int n) {
		Arrays.sort(arr);
		Arrays.sort(dep);

		int platforms = 1;
		int result = 1;
		int i = 1, j = 0;

		while (i < n && j < n) {

			if (arr[i] <= dep[j]) {
				platforms++;
				i++;
			} else if (arr[i] > dep[j]) {
				platforms--;
				j++;
			}

			if (platforms > result) {
				result = platforms;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

		int arr1[] = { 900, 940 };
		int dep1[] = { 910, 1200 };

		int n = arr.length;
		int n1 = arr1.length;
		int result1 = getMinimumNumberOfPlatforms(arr, dep, n);
		int result2 = getMinimumNumberOfPlatforms(arr1, dep1, n1);

		System.out.println("input 1 arrival:"+Arrays.toString(arr));
		System.out.println("input 1 departure:"+Arrays.toString(dep));
		System.out.println("result 1 : " + result1);
		
		System.out.println("input 2 arrival:"+Arrays.toString(arr1));
		System.out.println("input 2 departure:"+Arrays.toString(dep1));		
		System.out.println("result 2 : " + result2);


	}
}