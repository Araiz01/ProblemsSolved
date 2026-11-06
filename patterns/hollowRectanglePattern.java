package Patterns;

public class hollowRectanglePattern {
    public static void printHollowRectanglePattern(int row, int col){
        for(int i=0; i<row; i++){
            if(i==0 || i==row-1){
                for(int j=0; j<col; j++){
                    System.out.print(" * ");
                }
            }
            else{
                for(int j=0; j<col; j++){
                    if(j==0 || j==col-1) System.out.print(" * ");
                    else System.out.print("   ");
                }
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printHollowRectanglePattern(5, 8);
    }
}
