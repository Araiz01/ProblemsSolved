package Patterns;

public class numberPyramidPattern {
    public static void printNumberPyramidPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.printf("   ");
            }

            int count=1;
            for(int j=0; j<=i; j++){
                System.out.printf(" %d ", count++);
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printNumberPyramidPattern(4);
    }
}
