package leetcoder;

public class no_7 {
    public static int reverse(int x) {

        boolean neg =false;
        String stack = new String();
        if (x < 0) {neg = true; x = -x;}  // better solution: int sign =  x < 0 ? -1 : 1 ;
        while (x>0)
        {stack += x % 10;
            x = (x- x % 10)/10;}
        try{
        if (neg) {return -Integer.valueOf(stack);}
        return Integer.valueOf(stack);
        } catch (Exception e) {
			// TODO: handle exception
        	return 0;
		}
    }
    
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		
	}
}
