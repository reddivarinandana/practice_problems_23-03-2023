class Main {
    public static void main(String[] args) {
         int matrix[][] = { { 1,2,3 },
                      { 4,5,6 },
                      { 7,8,9 } };
                      int m,n;
  for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0){
                    System.out.print(matrix[i][j] + " ");
                }else if (i == m - 1){
                    System.out.print(matrix[i][j] + " ");
                }else if (j == 0){
                    System.out.print(matrix[i][j] + " ");
                }else if (j == n - 1){
                    System.out.print(matrix[i][j] + " ");
                }else{
                    System.out.print("  ");
            }
            System.out.println("");
            }
  }
    }
}
        