package Patterns;

public class invertedSolidPyramidPattern {
    public static void printInvertedSolidPyramidPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.printf("   ");
            }
            for(int j=0; j<(2*(n-i) - 1); j++){  // 2(n-i)-1 is simplified from 2n - 2i - 1 I'm no genius XD
                System.out.printf(" * ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printInvertedSolidPyramidPattern(5);
    }
}
