package BasicMathProblems;

public class findLCM {
    public static int doFindLCM(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int val = 0;

        for(int i=1; i<=max; i++){
             int comp = min*i;

             if(comp % max == 0){
                 val = comp;
                 break;
             }
        }

        return val;
    }
}
