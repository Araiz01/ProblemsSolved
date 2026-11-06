package Patterns;

public class hollowPyramidPattern {
    public static void printHollowPyramidPattern(int n){
         for(int i=0; i<n; i++){
             for(int j=0; j<n-i-1; j++){
                 System.out.printf("   ");
             }
             for(int j=0; j<(2*i + 1); j++){
                 if(j==0 || j==2*i || i==n-1){
                     System.out.printf(" * ");
                 }
                 else{
                     System.out.printf("   ");
                 }
             }
             System.out.println("");
         }
    }

    public static void main(String[] args) {
        printHollowPyramidPattern(5);
    }
}
