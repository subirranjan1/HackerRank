import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases=in.nextInt();
        while(testCases>0){
            String str=in.next();
            boolean bool=isParenthesisMatch(str);
        	if(bool==true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
           testCases--;
        }
    }
    
    public static boolean isParenthesisMatch(String str) {
       if(str.isEmpty())
    	   return true;
    	
    	Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            if(current=='{'||current=='['||current=='('||current=='<'){
            	stack.push(current);
            }

            if(current=='}'||current==']'||current==')'||current=='>'){
            	if(stack.isEmpty()){
                    return false;
                }
                char last=stack.peek();
                if(current=='}' && last=='{' || current==']' && last=='[' ||current==')' && last=='(' ||current=='>' && last=='<'){
                    stack.pop();
                }
                else{
                    return false;
                } 		
            }
        }
        return stack.isEmpty();
    }

}
