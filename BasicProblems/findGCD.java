public class findGCD {
    public static int doFindGCD1(int a, int b){
        if(a==0) return b;
        if(b==0) return a;
        while(a!=b){
            if(a>b) a = a-b;
            else b = b-a;
        }
        return a;
    }

//    public static int doFindGCD2(int a, int b){
//        if(a==0) return b;
//        if(b==0) return a;
//        while(a!=b){
//            if(a>b) a = a%b;
//            else b = b%a;
//        }
//        return a;
//    }
}
