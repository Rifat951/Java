class TPM{
    
     public static void display(int[][] matrix){
        
        //display the matrix before transpose state
        
        System.out.println("Transpose State : ");
        //usage of for-each loop
        for (int[] row : matrix ){ //traverses each array
            for(int column : row){ //traverses each elements in the array
                System.out.print(column + " ");
            }
        System.out.println();
        }
        
        
    }
    
    
    public static void main(String[] args){
        
        int row =2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
        
        //display the current state of array
        display(matrix);
        
        int[][] tp = new int[column][row]; // here row changes to column and column changes to row
        for(int i = 0; i< row; i++){
            for(int j=0; j < column; j++){
                tp[j][i]=matrix[i][j];
            }
        }
        
        // need to do a bit of work here for ---- for-each loop
        /*for (int first_data : row){
            for(int second_data : column){
                tp[second_data][first_data]=matrix[first_data][second_data];
            }
        }*/
        
        display(tp);
    }
    

}
