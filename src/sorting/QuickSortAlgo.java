package sorting;

import java.util.Arrays;

public class QuickSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,2,1,2,6,9};
		quickSort(arr, 0, arr.length-1);
		Arrays.stream(arr).forEach(x -> System.out.println(x));

	}
	
	public static void quickSort(int arr[], int left , int right) {
		
		if(left >= right) {
			return;
		}
	
			int pivot = arr[(left+right)/2];
			int index = indexAfterSort(arr, left, right, pivot);
			quickSort(arr, left, index-1);
			quickSort(arr, index , right);
			
		
	}
		
		public static int indexAfterSort(int[] arr, int left, int right, int pivot) {
			
			while(left <= right) {
				while(arr[left] < pivot) {
					left++;
				}
				while(arr[right] > pivot) {
					right--;
				}
				if(left<=right) {
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left++;
					right--;
				}
			}
			return left;
			
		}
		
		

}
