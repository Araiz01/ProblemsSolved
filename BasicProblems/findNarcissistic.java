public class findNarcissistic {
    public static int count(int num){
        int count = 0;

        while(num>0){
            num/=10;
            count++;
        }

        return count;
    }
    public static String doFindNarcissistic(int num){
        if(num<0) return "No";
        if(num/10 == 0) return "Yes";

        int sum = 0;
        int temp = num;
        int count = count(num);

        while(temp>0){
            int rem  =temp%10;
            temp/=10;
            sum += (int) Math.pow(rem, count);
        }

        return (sum == num) ?  "Yes" :  "No";
    }
}
