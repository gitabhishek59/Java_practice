class ArrayEx1{
public static void main(String a[])

{ 
  double sum=0.0;
  float[]marks={98.7f,89.6f,78.0f,45.78f,89.67f};
  for(int i=0;i<marks.length;i++){
   sum=sum+marks[i];
}
System.out.println(sum);
}

}