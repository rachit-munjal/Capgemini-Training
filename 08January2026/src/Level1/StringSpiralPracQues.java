package Level1;
import java.util.*;
/* Spiral matrix to String */
public class StringSpiralPracQues {
    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows");
//        int rows = sc.nextInt();
//        System.out.println("Enter the number of columns");
//        int columns = sc.nextInt();
        char[][] matrix = {
                {'a', 'b', 'c'},
                {'h', 'i', 'd'},
                {'g', 'f', 'e'}
        };

//        System.out.println("Enter the matrix row-wise:");
//        for (int i = 0; i < rows; i++) {
//            String line = sc.next();
//            for (int j = 0; j < columns; j++) {
//                matrix[i][j] = line.charAt(j);
//            }
//        }

        int top = 0;
        int left = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;

        StringBuilder str = new StringBuilder();
        while(top <= bottom && left <= right){
            for(int col = left;col<=right;col++){
                str.append(matrix[top][col]);
            }
            top++;

            for(int row = top;row <= bottom;row++){
                str.append(matrix[row][right]);
            }
            right--;

            if(top <= bottom){
                for(int col = right;col>=left;col--){
                    str.append(matrix[bottom][col]);
                }
                bottom--;
            }

            if(left <= right){
                for(int row = bottom;row>=top;row--){
                    str.append(matrix[row][left]);
                }
                left++;
            }
        }
        System.out.println(str.toString());
    }
}
