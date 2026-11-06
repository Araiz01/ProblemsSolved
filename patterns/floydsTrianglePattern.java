package Patterns;

public class floydsTrianglePattern {
    public static void printFloydsTrianglePattern(int n){
        int inc = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.printf(" %d ", inc++);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printFloydsTrianglePattern(5);
    }
}
