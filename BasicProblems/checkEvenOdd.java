public class checkEvenOdd {
    public static String doCheckEvenOdd1(int num){
        if(num%2 == 0) return "Even";
        else return "Odd";
    }

    // Logic:
    // Any even number will never have 1 in its right most bit
    // Example: 10: 0000 1010
    // Example: 6:  0000 0110
    // If this number is operated against 1 using AND logic, all bits should return 0.

    public static String doCheckEvenOdd2(int num){
        if((num&1) == 0) return "Even";
        else return "Odd";
    }
}
