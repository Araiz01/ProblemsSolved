package BasicMathProblems;

public class isPalindrome {
    public static String doIsPalindrome(int num){
        if(num ==0 || num/10 == 0) return "Yes";
        else{
            int temp = num;
            int rev = 0;
            while(temp>0){
                int div = temp%10;
                rev = rev*10 + div;
                temp/=10;
            }

            return (num==rev) ? "Yes" : "No";
        }
    }
}
