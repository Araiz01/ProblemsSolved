public class sumOfDigits {

    // Logic:
    // The modulus of any number by 10 gives the last digit
    // Upon dividing the number by 10, we get the remaining number except the last digit.

    public static int DoSumOfDigits(int num){
        int sum = 0;

        while(num>0){
            sum += num%10;
            num/=10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.printf("%d", DoSumOfDigits(1234));
    }
}
