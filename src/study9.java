
public class study9 {

	public static void main(String[] args) {
		int[] arr = {5,10,15};
		
		System.out.print(getGcd(arr));
	}
	public static int getGcd(int[] arr) {
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min = arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
			arr[i] = arr[i]%min;
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) 	
				count++;
		}
		
		if(count==arr.length)
			return min;
		else
			return 1;
	}

}
