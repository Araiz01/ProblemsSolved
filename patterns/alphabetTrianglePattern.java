package Patterns;

public class alphabetTrianglePattern {
    public static void printAlphabetTrianglePattern(int n){
        for(int i=0; i<n; i++){
            char ch = 'A';
            for(int j=0; j<=i; j++){
                System.out.printf(" %c ", ch++);
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printAlphabetTrianglePattern(5);
    }
}
