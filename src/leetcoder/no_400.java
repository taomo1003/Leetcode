package leetcoder;

public class no_400 {

    public int findNthDigit(int n) {
     //9-1+1
     //99-10+1
     //999-100+1
     ///9999-1000+1
     
     int num = 1;
     long num1 = 9;
     int num2 = 1;
     while((n-(num1-num2+1)*num)>0){
     n = (int) (n-(num1-num2+1)*num);
     num ++;
     num1 = num1*10+9;
     num2 = num2*10;
   }
     
     int k =1;
     while((n-num)>0){
    	 n=n-num;
    	 k++;
    	 }
     
     int loc = num2+k-1; 
     String loc1 = Integer.toString(loc);
     return loc1.charAt(n-1)-'0';
     }
     
     public static void main(String[] args) {
		no_400 test = new no_400();
		System.out.println(test.findNthDigit(2147483647));
	}
     
}
