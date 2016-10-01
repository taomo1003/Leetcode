package leetcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class no_17 {
	private List<String> result = new ArrayList<>();
	
	public List<String> letterCombinations(String digits) {	
		if (digits.length()==0) return result;
		solve("",0,digits.toCharArray());
		return result;
	}
	
	public void solve(String curr, int i, char[] digits) {
		if(i == digits.length) {result.add(curr); return;}
		Iterator<Character> temp = getIt(digits[i]);
		while (temp.hasNext()){
			solve(curr+temp.next(), i+1, digits);
		}
	}
	
	public Iterator<Character> getIt(char I) {
		List<Character> list = new ArrayList<>();
		switch (I) {
		case '2':
			list.add('a');list.add('b');list.add('c');
			break;
		case '3':
			list.add('d');list.add('e');list.add('f');
			break;
		case '4':
			list.add('g');list.add('h');list.add('i');
			break;
		case '5':
			list.add('j');list.add('k');list.add('l');
			break;
		case '6':
			list.add('m');list.add('n');list.add('o');
			break;
		case '7':
			list.add('p');list.add('q');list.add('r');list.add('s');
			break;
		case '8':
			list.add('t');list.add('u');list.add('v');
			break;
		case '9':
			list.add('w');list.add('x');list.add('y');list.add('z');
			break;
		default:
			break;
		}
		return list.iterator();
	}
	
	public static void main(String[] args) {
		no_17 test = new no_17();
		System.out.println(test.letterCombinations(""));
		
	}
}
