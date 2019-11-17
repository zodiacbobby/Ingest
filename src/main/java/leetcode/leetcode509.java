package leetcode;

public class leetcode509 {
    public int fib(int n) {
        if(n<=0){
            return 0;
        }
        int pprev = 0;
        int prev = 1;
        while (n >1){
            int temp = pprev+ prev;
            pprev = prev;
            prev = temp;
            n--;
        }
        return prev;
    }
}
