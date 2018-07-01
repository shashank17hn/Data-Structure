package sorting;

import java.util.Arrays;

public class MergeSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,2,1,2,6,9};
		mergeSort(arr, new int[arr.length], 0, arr.length-1);
		Arrays.stream(arr).forEach(x -> System.out.println(x));

	}

	public static void mergeSort(int[] arr , int[] temp , int leftStart , int rightEnd) {
		
		if(leftStart>= rightEnd) {
			return;
		}
		else {
			int mid = (leftStart+ rightEnd)/2;
			mergeSort(arr, temp, leftStart, mid);
			mergeSort(arr, temp, mid+1, rightEnd);
			mergeHalves(arr, temp, leftStart, rightEnd);
		}
		
	}
	
	 public static void mergeHalves(int[] arr , int[] temp , int leftStart , int rightEnd) {
		
		 int leftEnd = (leftStart + rightEnd)/2;
		 int rightStart = leftEnd +1;
		 int size = rightEnd - leftStart +1;
	
		 
		 int left = leftStart;
		 int right = rightStart;
		 int index = leftStart;
		 
		 while((left <= leftEnd) && (right <= rightEnd)) {
			 if(arr[left] <= arr[right]) {
				 temp[index] = arr[left];
				 left++;
			 }
			 else {
				 temp[index] = arr[right];
				 right++;
			 }
			 index++;
		 }
		 System.arraycopy(arr, leftStart, temp, index, leftEnd-left+1);
		 System.arraycopy(arr, rightStart, temp, index, rightEnd-right+1);
		 System.arraycopy(temp,leftStart ,arr , leftStart, size);
	 }
	 
	 
}
