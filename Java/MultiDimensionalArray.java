class MultiDimensionalArray{
  public static void main(String a[])
{
  int[][]flats=new int[2][3];
flats[0][0]=32;
flats[0][1]=33;
flats[0][2]=34;
flats[1][0]=35;
flats[1][1]=36;
flats[1][2]=37;
for(int i=0;i<flats.length;i++)
{
for(int j=0;j<flats[i].length;j++)
{
System.out.print(flats[i][j]);
System.out.print(" ");
}
System.out.println();
}

}


}