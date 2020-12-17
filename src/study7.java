
public class study7 {

	public static void main(String[] args) {
		int[] arr={-1,0,1,4,5,6,8,9};
		
		int check = 10;
		int start = 0, last = arr.length-1;
		int index = (last+start)/2;
		int startValue = arr[index];
		int count=0;
		for(;;) {
			if(startValue == check) {
				count++;
				System.out.println(count+" : true");
				break;
			}
			if(start == last) {
				count++;
				System.out.println(count+" : false");
				break;
				
			}
			if(startValue < check) {
				start = index+1;
				index = (last+start)/2;
				startValue = arr[index];
				count++;
				
			}
			else if(startValue > check){
				if(index != 0)
					last = index-1;
				else
					last=0;
				index = (last+start)/2;
				startValue = arr[index];
				count++;
				
			}			
		}	 
	}

}
