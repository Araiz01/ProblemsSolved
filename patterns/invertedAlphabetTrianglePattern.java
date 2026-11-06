package Patterns;

public class invertedAlphabetTrianglePattern {
    public static void printInvertedAlphabetTrianglePattern1(int n){
        for(int i=0; i<n; i++){
            int letter = 65;

            for(int j=0; j<n-i; j++){
                System.out.printf(" %c ", (char)letter++);
            }
            System.out.println("");
        }
    }

    public static void printInvertedAlphabetTrianglePattern2(int n){
        for(int i=0; i<n; i++){

            for(int j=65; j<(65+n-i); j++){
                System.out.printf(" %c ", (char)j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printInvertedAlphabetTrianglePattern2(5);
    }
}
