package leetcoder;

public class no_58 {
	 public static int lengthOfLastWord(String s) {
	        int i = s.length()-1;
	        int count = 1;
	        boolean wordexist = false;
	        
	        while (i>=0 && !wordexist ){
	            if (s.charAt(i) == ' ') {i--;} else {wordexist=true; break;}          
	        }
	        
	        while (i>0){
	            if (s.charAt(i-1) == ' ') {break;} else {count++;i--;}          
	        }
	        
	        if (wordexist) {return count;} else {return 0;}
	    }
	 
	 public static void main(String[] args){
		 System.out.println(lengthOfLastWord("avfvf d "));
	 }
}
