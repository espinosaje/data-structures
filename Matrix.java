import java.lang.*;

class Matrix{

  public int h,w;
  int[][] values;
  
  public Matrix(int[][] values){
    this.values = values;
    h=values.length;
    w=values[0].length;
  }
  
  public void setValue(int val, int x, int y){
    values[x][y] = val;
  }
  
  public int getValue(int x, int y){
    return values[x][y];
  }
  
  public String rotate(){
    //0,j = 0,0 - 0,j-1 = j-1,0
    //0,0= i,0
    int[][] temp = new int[h][w];
    for (int i=0;i<h;i++){
         
      for (int j=0;j<w;j++){
        System.out.println("i:"+i);
        temp[i][w-j-1] = values[j][i];
      }
    }
    return new Matrix(temp).toString();
  }
  
  public String toString(){
    String res="";
    for (int i=0;i<h;i++){
         
      for (int j=0;j<w;j++){
       // System.out.print(values[i][j]+",");
        res+=values[i][j]+",";
      }
      System.out.println("");
      res+=System.lineSeparator();
    }
    return res;
  }
  
}