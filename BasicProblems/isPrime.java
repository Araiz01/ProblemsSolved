public class isPrime {

    // Logic:
    // Check if number is less than one or divisible by 2 except 2 itself, if yes then can't be prime.
    // Since evens and less than 1's and evens are out of picture, we will check only until
    // the root of odd numbers and only check odd numbers

    public static String doIsPrime(int num){
        if(num<=1 || num%2 == 0 && num != 2) return "No";
        int sqOfNum = (int)Math.sqrt(num);

        for(int i=3; i<=sqOfNum; i+=2){
            if(num%i == 0) return "No";
        }

        return "Yes";
    }
}
