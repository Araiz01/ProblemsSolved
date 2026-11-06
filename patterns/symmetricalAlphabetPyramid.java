package Patterns;

public class symmetricalAlphabetPyramid {
    public static void printSymmetricalAlphabetPyramid(int n){
        for(int i=0; i<n; i++){
            char ch = 'A';
            for(int j=0; j<n-i-1; j++){
                System.out.printf("   ");
            }
            for(int j=0; j<=i; j++){
                System.out.printf(" %c ", ch++);
            }

            ch-=2;

            for(int j=0; j<i; j++){
                System.out.printf(" %c ", ch--);
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printSymmetricalAlphabetPyramid(5);
    }
}
