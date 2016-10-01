package leetcoder;

public class no_6 {
	   public static String convert(String s, int numRows) {
		      if(numRows <= 1) return s;  
		      String result  = "";  
		      if(s.length() ==0) return result;  
		      for(int i =0; i< numRows; i++)  
		      {  
		        for(int j =0, index =i; index < s.length();   
		            j++, index = (2*numRows-2)*j +i)  
		        {  
		          result += s.charAt(index);  //red element
		          if(i ==0 || i == numRows-1)   //green element
		          {            
		            continue;  
		          }  
		          if(index+(numRows- i-1)*2 < s.length())  
		          {  
		            result +=  s.charAt(index+(numRows- i-1)*2);  
		          }  
		        }  
		      }  
		      return result;  
		    } 
	
	 
	 
	public static void main(String[] args) {
		System.out.println(convert("Adw", 2));
		
	} 
}
