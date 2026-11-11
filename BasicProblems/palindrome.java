public class palindrome {

    // Logic:
    // Find the reverse of a number and compare it with the original number.

    public static String doPalindrome(int num){
        if(num == 0 || (num/10 == 0)) return "Yes";
        int temp = num;

        int reverseNumber = 0;

        while(temp>0){
            int rem = temp%10;
            reverseNumber = (reverseNumber*10) + rem;

            temp/=10;
        }

        return (reverseNumber==num) ? "Yes" : "No";

    }
}
