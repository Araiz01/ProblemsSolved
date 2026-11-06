package Patterns;

public class rhombusPattern {
    public static void printRhombusPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.printf("   ");
            }
            for(int j=0; j<n; j++){
                System.out.printf(" * ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printRhombusPattern(4);
    }
}
