public class SearchinSortedmatrix {
    public static  boolean search(int matrix[][],int key){
          int col=matrix[0].length-1;
          int row=0;
          while(col>=0 && row<matrix.length){
            if(matrix[row][col]==key){
                return true;
            }
            else if(key< matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
          }
          System.out.println("key not found");
          return false;

    }


    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println(search(arr,155));

    }
}
