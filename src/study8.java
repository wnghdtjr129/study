
public class study8 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int changeCount = 10;
		int count = changeCount%arr.length; //이동할 횟수가 array길이보다 길 경우 체크
		int temp[] = new int[changeCount];
		for(int i=0;i<arr.length;i++) {
			if(count != 0) {
				temp[i] = arr[i];
				count--;
			}
			else
				arr[i-count] = arr[i];
		}
		
		for(int i=arr.length-count;i<arr.length;i++,count++) 
			arr[i]=temp[count];
		
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i]);
	}
}