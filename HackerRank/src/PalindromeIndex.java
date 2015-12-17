import java.util.*;
import java.io.*;

public class PalindromeIndex {
	public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int testCases=in.nextInt();
        while (testCases>0){
        	String str=in.next();
        	int index = pallindromeIndex(str, 0, str.length());
            System.out.println(index);
        }		
	}
		
	public static int isPallindrome(String string){
        for(int i = 0; i< string.length()/2 ; i++){
            if(string.charAt(i) != string.charAt(string.length() - i -1)){
                return 0;
            }
        }
        return 1;
    }
    public static int pallindromeIndex(String string, int start, int end){
        if(start >= end-1){
            return -1;
        }else{
            if(string.charAt(start) == string.charAt(end-1)){
                return pallindromeIndex(string, start + 1, end - 1);
            }else{
                String temp = string.substring(start , end -1 );
                if(isPallindrome(temp) == 1){
                    return end - 1;
                }else{
                    return start;
                }
            }
        }
       
    }
}
