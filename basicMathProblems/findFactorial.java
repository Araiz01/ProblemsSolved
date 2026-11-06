package BasicMathProblems;

public class findFactorial {
    public static long doFindFactorial(int num){
        if(num<0) throw new IllegalArgumentException("Factorial cannot be negative!");

        long factorial = 1;
        for(int i=num; i>=2; i--){
            factorial = Math.multiplyExact(factorial, i); // Gives alert if output exceeds datatype range
        }

        return factorial;
    }

    public static void main(String[] args) {
        System.out.printf("%d", doFindFactorial(-10));
    }
}
