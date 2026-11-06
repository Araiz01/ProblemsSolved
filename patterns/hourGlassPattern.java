package Patterns;

public class hourGlassPattern {
    public static void printHourGlassPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.printf("   ");
            }
            for(int j=0; j<2*(n-i); j++){
                System.out.printf(" * ");
            }
            System.out.println("");
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.printf("   ");
            }
            for(int j=0; j<2*(i+1); j++){
                System.out.printf(" * ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printHourGlassPattern(3);
    }
}
