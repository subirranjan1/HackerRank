import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        int N=in.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N-1;i++){
        	A[i]=in.nextInt();
        }
        
        boolean flag=checkAiExists(A);
        System.out.println(flag);
    }
    
    public static boolean checkAiExists(int[] A){
    	
    	return true;
    }
}