package holding;

import java.util.Stack;

public class Exercise15 {

	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		String inStr = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		char[] strArr = inStr.toCharArray();
		for(int i=0; i < strArr.length; i++){
			if('+' == strArr[i]){
				s.push(strArr[++i]);
			}
			else if('-' == strArr[i]){
				System.out.print(s.pop());
			}
		}
		System.out.println();
	}
	
}
