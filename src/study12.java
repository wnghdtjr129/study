// Java program to rearrange characters in a string 
// so that no two adjacent characters are same. 

 
public class study12 {
	public static void main(String[] args) {
		String english = "aaabbc";
		char[] temp = new char[english.length()];
		int[] count = new int[26]; 
		
		for (int i = 0; i < english.length(); i++) 
            count[english.charAt(i) - 'a']++; 
		
		for(int i=0; i<english.length();i++) 
			temp[i] = english.charAt(i);
	}
}
