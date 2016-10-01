package leetcoder;

public class no_165 {
    public static int compareVersion(String version1, String version2) {
       int pt1=0;
       int pt2=0;
       
       while ( pt1<(version1.length()) && pt2<(version2.length())) {
    	   int pt3 = pt1;
    	   int pt4 = pt2;
    	   while (pt1<(version1.length()) && version1.charAt(pt1)!= '.')
    	   {pt1 ++;}
    	   while (pt2<(version2.length()) && version2.charAt(pt2)!= '.')
    	   {pt2 ++;}
    	   int v1 = (pt1>(version1.length())) ? -1:Integer.valueOf(version1.substring(pt3, pt1));
    	   int v2 = (pt2>(version2.length())) ? -1:Integer.valueOf(version2.substring(pt4, pt2));
    	   if (v1>v2) return 1;
    	   if (v1<v2) return -1;
    	   pt1++;
    	   pt2++;
       }
       while ( pt1<(version1.length())) {
    	   int pt3 = pt1;
    	   while (pt1<(version1.length()) && version1.charAt(pt1)!= '.')
    	   {pt1 ++;}
    	   int v1 = (pt1>(version1.length())) ? -1:Integer.valueOf(version1.substring(pt3, pt1));
    	   if (v1>0) return 1;
    	   pt1++;
       }
       while ( pt2<(version2.length())) {
    	   int pt4 = pt2;
    	   while (pt2<(version2.length()) && version2.charAt(pt2)!= '.')
    	   {pt2 ++;}
    	   int v2 = (pt2>(version2.length())) ? -1:Integer.valueOf(version2.substring(pt4, pt2));
    	   if (v2>0) return -1;
    	   pt2++;
       }
       
       return 0;
    }
   
    public static void main(String[] args) {
    	System.out.println(compareVersion("0.00.00.00","0"));
	}
}





//String[] s1 = version1.split("\\.");
//String[] s2 = version2.split("\\.");
//
//int i=0;
//while(s1.length>i || s2.length>i){
//	int v1=0, v2=0;
//	if(s1.length>i) v1=Integer.valueOf(s1[i]);
//	if(s2.length>i) v2=Integer.valueOf(s2[i]);
//	if(v1>v2) return 1;
//	if(v1<v2) return -1;
//	i++;
//}
//
//return 0;


//another good one
//while (i1 < l1 && version1.charAt(i1)!='.'){
//	v1 = 10*v1 + (version1.charAt(i1) - '0') ;
//	i1++;
//}
