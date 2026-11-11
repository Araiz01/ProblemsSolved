public class isPowerOfTwo {

    // Logic:
    // Firstly, this is not something I came up with
    // Learnt from lectures tht this is one way to do this
    // Any power of 2 will always be one 1 bit remaining 0's
    // If we do AND operator between the number and number-1 it should be 0, that indicates
    // it's a power of 2.

    public static String doIsPowerOfTwo1(int num){
        if(num<=0) return "No";

        if((num&(num-1)) == 0) return "Yes";
        else return "No";
    }

    // Logic:
    // If any non power of 2 is AND operated against 1, we will get 1 more than once.
    // If any power of 2 is operated against 1, we will get 1 only once.


    public static String doIsPowerOfTwo2(int num){
        if(num<=0) return "No";

        int count = 0;
        while(num>0){
            if((num&1) == 1) count++;   // If 1 is found, then inc count
            num = num>>1;               // Divide num by 2
        }

        return (count==1) ? "Yes" : "No";
    }
}
