package Patterns;

public class hollowRightAngleTriangle {
    public static void printHollowRightAngleTriangle1(int n){

        // Logic was to print the first, second and last rows with all stars
        // For the remaining rows:
        // Print first and last star as usual, and for the middle space logic is
        // There will always be total-stars-2 spaces, say 3 stars in 3rd row
        // So spaces = 3-2 = 1 space
        // Simply, convert this to i=0 format making it i-1

        for(int i=0; i<n; i++){
            if(i==0 || i==1 || i==n-1){
                for(int j=0; j<=i; j++){
                    System.out.printf(" * ");
                }
            }
            else{
                System.out.printf(" * ");
                for(int j=0; j<i-1; j++){
                    System.out.printf("   ");
                }
                System.out.printf(" * ");
            }

            System.out.println("");
        }
    }

    public static void printHollowRightAngleTriangle2(int n){

        // Logic was same just that noticed spaces occur at positions where:
        // 1. j=0 i.e. first star
        // 2. j=i i.e. last star
        // 3. i=n-1 i.e. last line
        // Hence only print stars there and remaining spaces.

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i || i==n-1){
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
        printHollowRightAngleTriangle2(5);
    }
}
