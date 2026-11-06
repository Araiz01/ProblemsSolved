package BasicMathProblems;

public class isPowerOfTwo {
    public static String doIsPowerOfTwo1(int num){ // O(1)
        if(num <= 0) return "No";

        int val = num&(num-1);
        if(val == 0) return "Yes";
        else return "No";
    }

    /*
     Concept for #1 method:
     ----------------------

     Apparently, in any number that can be written as 2^x has the property:
     Only 1 bit will be 1 at a time and remaining 0. For Eg:
     1 = 0000 0001
     2 = 0000 0010
     4 = 0000 0100
     8 = 0000 1000
     And so on. Now this was not any concept I reached by my own RI
     The concept is if you AND operate the number with number-1 then we should get 0 for 2^x
     Example: 8: 0000 1000
              7: 0000 0111
     8&7 = 0 Hence proving
     But if we take 7
     7: 0000 0111
     6: 0000 0110 => 7&6 = 0000 0110 => 6 != 0 Hence proving not power of 2
     */


    public static String doIsPowerOfTwo2(int num){ // O(logn)
        if(num <= 0) return "No";

        int count = 0;
        while(num > 0){
            if((num&1) == 1) count++;
            num = num >> 1;
        }

        return (count==1) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        System.out.printf("%s", doIsPowerOfTwo1(20));
    }

}
