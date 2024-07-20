package com.scribbleexample.demo;

public class MoveZero {

	public static void main(String[] args) {
		int[] arr = {1, 2, 0,  4, 0, 3, 0, 0, 8, 0,6, 5};
		
		printArr(arr);
		moveZero(arr);
		// swap(arr, 1, 3);
		printArr(arr);
	}

	private static void moveZero(int[] arr) {
		
		int i=0;
		while(i < arr.length) {
			if(arr[i] == 0) {
				i += 1;
				continue;
			}
			int j = i - 1;
			while(j >= 0 && arr[j] == 0) {
				swap(arr, j+1, j);
				j -= 1;
			}
			i +=1;
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	

	private static void printArr(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
