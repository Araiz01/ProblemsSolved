package Patterns;

public class solidDiamondPattern {
    public static void printSolidDiamondPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.printf("   ");
            }
            for(int j=0; j<(2*i+1); j++){
                System.out.printf(" * ");
            }
            System.out.println("");
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<=i; j++){
                System.out.printf("   ");
            }

            // To get odd decreasing stars we use 2n - 2i - 1
            // But since we are considering n=n-1 for bottom half, replace n with n-1
            // Upon simplifying we get to 2n - 2i - 3

            for(int j=0; j<2*(n-i)-3; j++){
                System.out.printf(" * ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printSolidDiamondPattern(5);
    }
}
