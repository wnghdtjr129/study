
public class study8 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int changeCount = 2;//(int)(Math.random()*10);//���� Ƚ�� ������
		int count = changeCount%arr.length; //�̵��� Ƚ���� array���̺��� �� ��� üũ
		int tempCount=count;
		int temp[] = new int[arr.length];
		int number = 10;
		
		for(int i=0;i<arr.length;i++) {
			if(count != 0) {
				temp[i] = arr[i];
				count--;
			}
			else
				arr[i-tempCount] = arr[i];
		}
		
		for(int i=arr.length-tempCount;i<arr.length;i++,count++) 
			arr[i]=temp[count];
		
		//for(int i=0; i<arr.length;i++)
			//System.out.print(arr[i]);
		
		System.out.print(changeCount+" : ");
		System.out.println(findPosition(arr,number));
	}
	
	public static int findPosition(int[] arr, int number) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number)
				return i;
		}
		return -1;
	}
}