package Patterns;

public class fancyPatternOne {
    public static void printFancyPatternOne(int N, char C){
        int n=N;
        for(int i=0; i<N/2; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%c", C);
            }
            System.out.printf(" ");
            n-=2;
        }

        n+=2;
        System.out.printf("%c ", C);

        for(int i=0; i<N/2; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%c", C);
            }
            System.out.printf(" ");
            n+=2;
        }
    }

    public static void main(String[] args) {
        printFancyPatternOne(9, 'X');
    }
}
