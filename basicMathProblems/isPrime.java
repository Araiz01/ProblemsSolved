package BasicMathProblems;

public class isPrime {
    public static String doIsPrime(int num){
        if(num<=1) return "No";                       // All nums under or 1 are either way not prime
        if(num%2 == 0 && num != 2) return "No";       // Check evens that are not 2 are not prime
        int sq = (int) Math.sqrt(num);                // We will search only till sqrt since least num where div is

        for(int i=3; i<=sq; i+=2){                    // Since evens are checked out will only check odd multiples
            if((num%i) == 0){                         // If divisible return not prime
                return "No";
            }
        }

        return "Yes";                                 // If nothing returned as of now passed all tests and is prime
    }

    public static void main(String[] args) {
        System.out.printf("%s", doIsPrime(7));
    }
}
