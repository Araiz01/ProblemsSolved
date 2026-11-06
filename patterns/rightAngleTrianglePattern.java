package Patterns;

public class rightAngleTrianglePattern {
    public static void printRightAngleTrianglePattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printRightAngleTrianglePattern(5);
    }
}
