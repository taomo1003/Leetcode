package leetcoder;

public class no_50 {
	double myPow(double x, int n) {
	    if (x == 0) return 0;
	    if (n < 0) return recursive(1/x, -n);
	    return recursive(x, n);
	}

	double recursive(double x, int n) {
	    if (n == 1) return x;
	    if (n == 0) return 1;
	    if (n%2 == 0) {
	        double temp = recursive(x, n/2);
	        return temp*temp;
	    }
	    else {
	        double temp = recursive(x, n/2);
	        return temp*temp*x;
	    }
	}
    
    public static void main(String[] args) {
		no_50 test = new no_50();
		System.out.println(test.myPow(1.00001,123456));
		System.out.println(Math.pow(1.00001,123456));
	}
}



//double myPow1(double x, int n) {
//    if (x == 0) return 0;
//    if (n < 0) return recursive(1/x, -n);
//    return recursive(x, n);
//}
//
//double recursive(double x, int n) {
//    if (n == 1) return x;
//    if (n == 0) return 1;
//    if (n%2 == 0) {
//        double temp = recursive(x, n/2);
//        return temp*temp;
//    }
//    else {
//        double temp = recursive(x, n/2);
//        return temp*temp*x;
//    }
//}