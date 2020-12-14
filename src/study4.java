
public class study4 {

	public static void main(String[] args) {
		//int[][] array1 = {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
		int[][] array = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
		int arrAmount = array.length*array[0].length;
		int frequency = 0;
		int count=0;
		
		try {
			while(arrAmount>count) {
				int columnCount = array[0].length-1-frequency;
				int rowCount = array.length-1-frequency;
				
				for(int i=frequency; i<columnCount;i++) {
					System.out.print(array[frequency][i]+" ");
					count++;
				}
				if(arrAmount != count) {
					for(int i=frequency; i<rowCount;i++) {
						System.out.print(array[i][rowCount]+" ");
						count++;
					}
					for(int i=columnCount; i>frequency;i--) {
						System.out.print(array[columnCount][i]+" ");
						count++;
					}
					for(int i=rowCount; i>frequency;i--) {
						System.out.print(array[i][frequency]+" ");
						count++;
					}
				}
				if(arrAmount-1==count) {
					System.out.print(array[rowCount/2+1][columnCount/2+1]);
					count++;
				}
				frequency++;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("³¡");
		}
	}

}
