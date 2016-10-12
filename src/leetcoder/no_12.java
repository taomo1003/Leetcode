package leetcoder;

import java.util.Stack;

public class no_12 {
	private final String[] Roman = {"I","V","X","L","C","D","M","Vbar"}; 
    public String intToRoman(int num) {
    	Stack<String> stack = new Stack<>();
        String result = "";
        int index = 0;
        while (num>0) {
        	stack.push(getString(index,num%10));
        	num = num /10;
        	index++;
        }
       
        while (!stack.isEmpty()) {
			result += stack.pop();
		}
        
        return result;
    }
    
    public String getString(int index, int n) {
    	switch (n) {
		case 0:
			return "";
		case 1:
			return Roman[index*2];
		case 2:
			return Roman[index*2]+Roman[index*2];
		case 3:
			return Roman[index*2]+Roman[index*2]+Roman[index*2];
		case 4:
			return Roman[index*2]+Roman[index*2+1];
		case 5:
			return Roman[index*2+1];
		case 6:
			return Roman[index*2+1]+Roman[index*2];
		case 7:
			return Roman[index*2+1]+Roman[index*2]+Roman[index*2];
		case 8:
			return Roman[index*2+1]+Roman[index*2]+Roman[index*2]+Roman[index*2];
		case 9:
			return Roman[index*2]+Roman[index*2+2];
		default:
			return "";
		}
	}
    
    public static void main(String[] args) {
		no_12 test = new no_12();
		System.out.println(test.intToRoman(4999));
	}
}


//String[] M = {"", "M", "MM", "MMM"};
//String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
