package BasicMathProblems;

public class checkEvenOdd {
    public static String doCheckEvenOdd(int n){
        if((n&1) == 0) return "Even";
        else return "Odd";
    }

    public static void main(String[] args) {
        System.out.printf("%s", doCheckEvenOdd(182));
    }
}



// Let's say n=2
// 2   => 0000 0010
// 1   => 0000 0001
// 2&1 => 0000 0000 => 0 Hence even since all evens behave like this

// Let's say n=3
// 3   => 0000 0011
// 1   => 0000 0001
// 3&1 => 0000 0001 => 1 Hence odd since all odds behave like this

