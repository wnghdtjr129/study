class arrayQueue{
		int freq[];
		char ch[];
		int sum;
		private int size;
		private int stringSize;
		
		arrayQueue(int size, int stringSize){
			this.size=size;
			this.stringSize=stringSize;
			this.sum=0;
			freq=new int[size];
			ch=new char[size];
		}
		
		public void add(int[] count) {
			int index=0;
			for(char c='a'; c<'z';c++, index++) {
				freq[index]=count[index];
				ch[index]=c;
			}
		}
		
		//big[0]=alphabet count, big[1]=index
		private int[] getBig() {
			int[] big=new int[2];
			big[0]=0;
			for(int i=0; i<freq.length;i++) {
				if(freq[i]>big[0]) {
					big[0]=freq[i];
					big[1]=i;
				}
				else
					sum+=freq[i];
			}
			return big;
		}
		
		public String getString() {
			int[] big = getBig();
			int index = (big[1]==0)?1:0;
			String result = "";
			
			if(big[0] == sum || big[0] == sum+1) {
				for(int i=0;i<stringSize;i++) {
					if(i%2==0 && freq[big[1]]>0) {
						result+=ch[big[1]];
						freq[big[1]]--;
					}
					else if(i%2==1){
						result+=ch[index];
						freq[index]--;
						if(freq[index]==0)
							index++;
					}	
				}
			}
			else if(big[0]<sum) {
				for(int i=0;i<stringSize;i++) {
					if(i%2==1 && freq[big[1]]>0) {
						result+=ch[big[1]];
						freq[big[1]]--;
					}
					else if(i%2==0){
						result+=ch[index];
						freq[index]--;
						if(freq[index]==0)
							index++;
						System.out.println(i);
					}	
				}
			}
			else
				result="\"\"";
			return result;
		}
}

public class study12 {	
	public static void main(String[] args) {
		String english = "aaaabbcdddd";
		int[] count = new int[26];
		arrayQueue q = new arrayQueue(count.length, english.length());
		
		for (int i = 0; i < english.length(); i++) 
            count[english.charAt(i) - 'a']++;
		
		q.add(count);
		System.out.println("output : " + q.getString());
		
	}
}
