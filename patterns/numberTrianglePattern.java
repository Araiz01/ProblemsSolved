package Patterns;

public class numberTrianglePattern {
    public static void printNumberTrianglePattern(int n){
        int inc = 1;
        for(int i=0; i<n; i++){

            for(int j=0; j<=i; j++){
                System.out.printf(" %d ", inc);
            }
            inc++;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printNumberTrianglePattern(5);
    }
}
