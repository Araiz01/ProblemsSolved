package BasicMathProblems;

public class smallestDigit {
    public static int doSmallestDigit(int n){
        if(n/10 <= 0) return n;
        if(n<0) return 0;
        int min = Integer.MAX_VALUE;

        while(n>0){
            int val = n%10;
            if(val < min){
                min = val;
            }

            n/=10;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.printf("%d", doSmallestDigit(1));
    }
}
