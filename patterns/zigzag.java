package Patterns;

public class zigzag {
    public static void printZigZagPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.printf("   ");
            }
            for(int j=0; j<2*(n-i); j++){
                if(j==0 || j==2*(n-i)-1){
                    System.out.printf(" * ");
                }
                else{
                    System.out.printf("   ");
                }
            }
            System.out.println("");
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.printf("   ");
            }
            for(int j=0; j<2*(i+1); j++){
                if(j==0 || j==2*i+1){
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
        printZigZagPattern(3);
    }
}
