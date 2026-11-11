public class smallestDigit {

    // Logic:
    // Here, I'm letting a min variable hold the largest possible integer value
    // Logic of this is that any single digit integer to be compared with it will be smaller
    // In each while loop, we will compare that value with min, if any value is lesser it is automatically
    // stored in 'min'

    public static int doSmallestDigit(int num){
        int min = Integer.MAX_VALUE;

        while(num>0){
            int rem = num%10;
            if(rem < min){
                min = rem;
            }

            num/=10;
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.printf("%d", doSmallestDigit(9746343));
    }
}
