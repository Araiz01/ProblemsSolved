package BasicMathProblems;

public class sumOfDigits {
    public static int doSumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.printf("%d", doSumOfDigits(91872));
    }
}
