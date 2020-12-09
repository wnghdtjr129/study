public class study1 {

	public static void main(String[] args) {
		int input = 12 ;
		int[] arr = {0,0,1};
		int result = arr[0];
		
		while(arr[2]<input) {
			if(arr[2]%2 == 0) { 
				result += arr[2];
				System.out.println(arr[2]);
			}
			arr[0] = arr[1];
			arr[1] = arr[2];
			arr[2] = arr[0] + arr[1];
		}
			
		System.out.print(result);
	}

}

