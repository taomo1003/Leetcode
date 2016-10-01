package leetcoder;

public class no_278 {
	public boolean isBadVersion(int version){
		return false;
	}
	public int firstBadVersion(int n) {
        int begin = 1;
        int end = n;
        while (end >= begin){
        	if (begin == end) 
        		return begin;
            if (isBadVersion((begin+(end-begin)/2))) {
                end = begin+(end-begin)/2;
            } else {
               begin = begin+(end-begin)/2+1;
            }
        }
        return begin+(end-begin)/2 ;
    }
}



//public int firstBadVersion(int n) {
//    int low  = 1;
//    int high = n;
//    int mid = 1;
//    
//    while(low <= high){
//        if(low == high)
//            return low;
//        mid = (low + (high - low)/2);
//        if(isBadVersion(mid)){
//            high = mid;
//        }
//        else{
//            low =  mid + 1;
//        }
//    }
//    return mid ;
//}