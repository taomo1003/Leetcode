package leetcoder;

public class no_69 {
    public static double mySqrt(int x) {
        double up = x*1.0;
        double bottom = 0.0;
        double temp = (up+bottom)/2;
        while (Math.abs((temp*temp-x))>0.001){
        	if ((temp*temp)>x) { up = temp; } else {bottom = temp;}
            temp = (up+bottom)/2;
        }
        return (int) temp;
    }
    
    public static void main(String[] args) {
		System.out.println(mySqrt(9));
	}
    
    
}

//From zhuo
//public static double mySqrt(int x) {
//    double temp = 1.0;
//    while (Math.abs((temp*temp-x))>0.001) temp = (temp + x/temp)/2;
//    return (int) temp;
//}



