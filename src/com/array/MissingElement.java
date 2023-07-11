package com.array;


public class MissingElement {
		static void missingElement(int [] arr) {
			int sumOfArr=0;
			for (int i=0; i<arr.length; i++) {
				sumOfArr = sumOfArr + arr[i];
			}
			System.out.println("Missing element between 1-10 is : "+(55-sumOfArr));
		}
		
		static void checkDuplicate(int [] arr) {
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						System.out.print(arr[j]+" ");
					}
				}
			}
		}
		
		static void largestSmallestElement(int [] arr) {
			int largest = arr[0];
			int smallest = arr[0];
			
			for(int i=1; i<arr.length; i++) {
				if (arr[i]>largest) {
					largest = arr[i];
				}
				if(arr[i]<smallest) {
					smallest = arr[i];
				}
			}
			System.out.println("largest : "+largest+"  and Smallest : "+smallest);
		}
		
		static void targetesSum(int[] arr, int sum) {
			
			for (int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if (arr[i]+arr[j]==sum) {
						System.out.println(arr[i]+", "+arr[j]);
					}
				}
			}
		}
		
		static void duplicateElemets(int[] arr) {
			for (int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if (arr[i]==arr[j]) {
						System.out.print(arr[i]+" ");
						break;
					}
				}
			}
			
		}
		
	
		
		public static void main(String[] args) {
			int arr[] = {1,2,2,3,3,4,5,9,7,8,10};
//			duplicateElemets(arr);
//			removeDuplicates(arr);
//			missingElement(arr);
//			checkDuplicate(arr);
//			largestSmallestElement(arr);
//			targetesSum(arr, 19);
		}
}
