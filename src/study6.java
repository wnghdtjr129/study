//O(nlogn)Á¤·Ä
public class study6 {

	public static int[] arr;
	public static int[] temp;
	public static void main(String[] args) {
		arr = new int[]{9,3,7,2,6,8,4,1,0,10};
		temp = new int[arr.length];
		mergeSort(0,arr.length-1);
		
		for(int i=0; i<arr.length;++i)
			System.out.print(arr[i]);
	}
	
	public static void mergeSort(int start, int end) {
		if(start<end) {
			int middle = (start+end)/2;
		
			mergeSort(start,middle);
			mergeSort(middle+1,end);
			
			int index = start;
			int start1 = start,start2 = middle+1;
			for(;start1<=middle && start2<=end;++index) {
				if(arr[start1]<arr[start2]) {
					temp[index] = arr[start1];
					start1++;
				}
				else {
					temp[index] = arr[start2];
					start2++;
				}
			}
			for(;start1<=middle;++start1,++index) 
				temp[index] = arr[start1];
			for(;start2<=end;++start2,++index) 
				temp[index] = arr[start2];
			for(index = start; index<=end; ++index)
				arr[index] = temp[index];
			
		}
	}

}
