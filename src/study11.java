
public class study11 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,8};
		int compare=1;
		int i = arr.length-1;
		int temp=compare;
		
		for(;;) {
			temp-=arr[i];
			if(temp<0) {
				temp+=arr[i];
				i--;
			}
			else if(temp==0) {
				compare++;
				temp=compare;
				i=arr.length-1;
			}
			else if(temp>0) {
				i--;
			}
			if(i<0)
				break;
		}
		System.out.println(compare);
	}

}
