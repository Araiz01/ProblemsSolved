public class factorial {
    public static long doFactorial(int num){
        if(num<0) throw new IllegalArgumentException("Can't find factorial of numbers < 0");

        long fact = 1;
        while(num>=1){
            fact = Math.multiplyExact(fact, num--); // Gives alert if output exceeds datatype range
        }

        return fact;
    }
}
