package Patterns;

public class invertedRightAngleTriangle {
    public static void printinvertedRightAngleTriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<(n-i); j++){
                System.out.printf(" * ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printinvertedRightAngleTriangle(5);
    }
}
