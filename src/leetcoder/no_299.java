package leetcoder;

public class no_299 {
	 public String getHint(String secret, String guess) {
	     int a = 0;
	     int b = 0;
	     int[] as = new int[10]; 
	     int[] bs = new int[10];
		 for(int i= 0; i<secret.length() ; i++){
			 if (secret.charAt(i) == guess.charAt(i)) {a++;}
			 else {
				as[Integer.valueOf(secret.charAt(i))-'0'] ++;
				bs[Integer.valueOf(guess.charAt(i))-'0'] ++;
			 }
		 }
		 
		 for (int i =0; i<10 ;i++) {
			 if (as[i] > 0 && bs[i] >0) {
				 b +=Math.min(as[i],bs[i]); 
			 }
		 }
		 
		 String result = "";
		 result += Integer.toString(a);
		 result += "A";
		 result += Integer.toString(b);
		 result += "B";
		 
		 return result;
	    }
	 
	 
	 public static void main(String[] args) {
		no_299 test = new no_299();
		System.out.println(test.getHint("1123", "0111"));
	}
}
