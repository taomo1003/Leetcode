package leetcoder;

public class no_374 {
	 public int guess(int num){
		 if (num>1702766719) return -1;
		 if (num<1702766719) return 1;
		 return 0;
	 }
	 public int guessNumber(int n) {
	     int l = 0;
	     int r = n;
	     int temp = guess(l+(r-l)/2);
	     while (temp!=0){
	    	if(temp>0) {
	    	l = l+(r-l)/2 +1;
	    	}  
	    	if(temp<0){
	    	r = l+(r-l)/2;	
	    	}
	    	temp = guess(l+(r-l)/2);
	     }
	    
	     return l+(r-l)/2;
	 }
	 
	 public static void main(String[] args) {
		no_374 test = new no_374();
		System.out.println(test.guessNumber(2126753390));
	}
}
