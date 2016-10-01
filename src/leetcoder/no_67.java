package leetcoder;

public class no_67 {
	 public static String addBinary(String a, String b) {
         int n1 = a.length();
         int n2 = b.length();
         int n = a.length()-1;
         
         if (n1<n2) {
        	 n=n2-1;
        	 String temp = "";
        	 while (n1<n2) {
        		 temp += "0";
        		 n1++;
        	 }
        	 a = temp +a;
         }
         
         if (n2<n1) {
        	 String temp = "";
        	 while (n2<n1) {
        		 temp += "0";
        		 n2++;
        	 }
        	 b = temp +b;
         }
		 
         char[] plusa = a.toCharArray();
         char[] plusb = b.toCharArray();
         int plus = 0;
         char[] solu = new char[n+1];
         
         while (n>=0){
        	 int temp = (Integer.valueOf(plusa[n])+Integer.valueOf(plusb[n])-48*2+plus)%2;
        	 solu[n] =(char)(temp+48);
        	 plus = (Integer.valueOf(plusa[n])+Integer.valueOf(plusb[n])-48*2+plus)/2;
        	 n--;
         }
         if (plus ==1) {return "1"+String.valueOf(solu);} else {return String.valueOf(solu);}
         
         
	    }
   
	 public static void main(String[] args) {
		 
		 String test = addBinary("1", "11");
		 System.out.println(test);
		
	}
}
