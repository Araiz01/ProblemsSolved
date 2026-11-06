package Patterns;

public class reverseAlphabetTriangle {
    public static void printReverseAlphabetTriangle(int n){
        for(int i=0; i<n; i++){
            char ch = (char)((65+n-1)-i);
            for(int j=0; j<=i; j++){
                System.out.printf(" %c ", ch++);
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printReverseAlphabetTriangle(2);
    }
}
