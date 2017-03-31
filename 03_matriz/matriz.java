class Matriz{

  public static void main(String[] args){

      //int[][] matriz = new int [3][5];
      int [][] matriz ={
                       {2,4,6,8,10},
                       {1,3,5,7,9,},
                       {1,2,3,5,7,}
      };

      for(int i=0; i<matriz.length;i++){

          for(int j=0; j<matriz[0].length;j++){

              System.out.print(matriz[i][j]+"\t");
          }System.out.println();
      }
 }
}
