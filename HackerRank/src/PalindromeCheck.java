
public class PalindromeCheck {
	public static void main(String args[]){
		String str="hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh";
		System.out.println(checkPalindrome(str));
		
	}
	
	public static boolean checkPalindrome(String str){
		
		if(str.isEmpty()){
			return false;
		}

		int n=str.length();
		//int j=n-1;
		for(int i=0;i<(n/2);i++){
			if(str.charAt(i)!=str.charAt(n-i-1)){
				return false;
			}
		}
		return true;
	}

}
