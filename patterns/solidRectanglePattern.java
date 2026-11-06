package Patterns;

public class solidRectanglePattern {
    public static void printSolidRectanglePattern(int rows, int columns){
        if(rows == columns) System.out.println("Not a valid rectangle");
        else{
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    System.out.print(" * ");
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        printSolidRectanglePattern(3, 7);
    }
}
