package BasicMathProblems;

public class reverseNumber {
    public static int doReverseNumber(int num){
        if(num ==0) return 0;

        boolean isPositive = num>0;
        if(!isPositive) num*=-1;


        int rev = 0;
        while(num>0){
            int div = num%10;
            rev = rev*10 + div;
            num/=10;
        }

        return isPositive ? rev : -rev;

    }

    public static void main(String[] args) {
        System.out.printf("%d", doReverseNumber(Integer.MIN_VALUE));
    }
}
