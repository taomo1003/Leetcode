package leetcoder;

public class no_258 {
    public int addDigits(int num) {
        int result = num%10;
        num = num / 10;
        while(num>0)
        {
           if ((result + num%10)>=10) {result = (result + num%10)%10+1; } else result += num%10;
           num = num/10;
        }
        
        return result;
    }
}
