class ArrayEx4{
   public static void main(String ar[])
{

   int[][]matrix1=new int[2][3];
   int[][]matrix2=new int[2][3];
   int[][]sum=new int[2][3];
   matrix1[0][0]=2;matrix1[0][1]=3;matrix1[0][2]=4;matrix1[1][0]=2;matrix1[1][1]=3;matrix1[1][2]=1;
   matrix2[0][0]=1;matrix2[0][1]=4;matrix2[0][2]=5;matrix2[1][0]=2;matrix2[1][1]=3;matrix2[1][2]=1;
   for(int i=0;i<matrix1.length;i++)
{
 for(int j=0;j<matrix1[i].length;j++)
{
    sum[i][j]=matrix1[i][j]+matrix2[i][j];
}
}
 
  for(int i=0;i<matrix1.length;i++)
{
 for(int j=0;j<matrix1[i].length;j++)
{
    System.out.print(sum[i][j]);
    System.out.print(" ");

}
   System.out.println();
}

}
}