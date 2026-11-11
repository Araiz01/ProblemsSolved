public class reverseNumber {

    // Logic:
    // We find the last digit by modulus
    // Followed by allocating it in the decimal number format i.e.
    // 1000's 100's 10's 0's

    public static int doReverseNumber(int num){
        if(num == 0) return num;

        boolean isNegative = false;
        if(num<0){
            num*=-1;
            isNegative = true;
        }

        int reverseNumber = 0;

        while(num>0){
            int rem = num%10;
            reverseNumber = (reverseNumber*10) + rem;

            num/=10;
        }

        return (!isNegative) ? reverseNumber : -reverseNumber;
    }

    public static void main(String[] args) {
        System.out.printf("%d", doReverseNumber(1234));
    }
}
