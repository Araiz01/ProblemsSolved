package Patterns;

public class hollowDiamondPattern {
    public static void printHollowDiamondPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.printf("   ");
            }
            for(int j=0; j<2*i+1; j++){
                if(j==0 || j==2*i){
                    System.out.printf(" * ");
                }
                else{
                    System.out.printf("   ");
                }
            }
            System.out.println("");
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<=i; j++){
                System.out.printf("   ");
            }
            for(int j=0; j<2*(n-i)-3; j++){
                if(j==0 || j==2*(n-i)-4){
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
        printHollowDiamondPattern(3);
    }
}
