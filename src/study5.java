
public class study5 {

	public static void main(String[] args) {
		int[] arr = {1,2,4,0,3};
		//int[] arr1 = {1,4,5,0,3,2};
		find(arr);
	}
	public static void find(int[] arr) {
		int index = 0;
		int count=0;
		for(int i=0; i<=arr.length; i++) {
			index = arr[index];
			count++;
			if(index == 0) {
				count++;
				break;	
			}
		}
		System.out.println((count<arr.length?"False":"True"));
	}
	

}

