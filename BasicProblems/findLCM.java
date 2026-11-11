public class findLCM {

    /*
    * Logic:
    * First find the minimum and maximum of the two numbers,
    * Then run a loop to get table of the min num until the max num
    * In the loop mod each multiple of min by max if 0 then that's your LCM
    *
    * The reason why I've gone till max-1 is cause if LCM is not found its going to be
    * the product of the two nums.
    * */

    public static int doFindLCM(int a, int b){
        if(a==0 || b==0) return 0;

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for(int i=1; i<max; i++){
            int num = min*i;
            if(num%max == 0) return num;
        }

        return a*b;
    }
}
