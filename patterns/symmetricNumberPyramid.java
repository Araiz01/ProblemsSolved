package Patterns;

public class symmetricNumberPyramid {
    public static void printSymmetricNumberPyramid(int n){
        for(int i=0; i<n; i++){
            int count=1;
            for(int j=0; j<=i; j++){
                System.out.printf(" %d ", count++);
            }
            for(int j=0; j<n-i-1; j++){
                System.out.printf("   ");
            }

            count--;

            for(int j=0; j<n-i-1; j++){
                System.out.printf("   ");
            }
            for(int j=0; j<=i; j++){
                System.out.printf(" %d ", count--);
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printSymmetricNumberPyramid(4);
    }
}
