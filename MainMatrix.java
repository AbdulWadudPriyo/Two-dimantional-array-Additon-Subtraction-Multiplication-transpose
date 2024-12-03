public class MainMatrix {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int[][] array1=new int[4][3];
System.out.println(&quot;The first Matrix is:&quot;);

for(int i=0; i&lt;4; i++){
for(int j=0; j&lt;3; j++){
array1[i][j]=sc.nextInt();
}
}
System.out.println(&quot;The second Matrix is:&quot;);
int[][] array2=new int[3][3];

for(int i=0; i&lt;3; i++){
for(int j=0; j&lt;3; j++){
array2[i][j]=sc.nextInt();
}
}

System.out.println(&quot;The third Matrix is:&quot;);
int[][] array3= new int[3][3];
for(int i=0; i&lt;3; i++){
for(int j=0; j&lt;3; j++){
array3[i][j]=sc.nextInt();
}
}

System.out.println(&quot;The fourth Matrix is:&quot;);
int[][] array4= new int[3][3];
for(int i=0; i&lt;3; i++){

for(int j=0; j&lt;3; j++){
array4[i][j]=sc.nextInt();
}
}

MatrixOperationmatrixoperation=new
MatrixOperation(array1,array2,array3,array4);
System.out.println(&quot;The value of addition:&quot;);
matrixoperation.additon();
matrixoperation.printAddition();
System.out.println(&quot;\nThe value of subtraction:&quot;);
matrixoperation.subtraction();
matrixoperation.printSubtraction();
System.out.println(&quot;The multiplication is:&quot;);
matrixoperation.multiplication();
matrixoperation.printMultiplication();
System.out.println(&quot;The transpose Matrix is:&quot;);
matrixoperation.transpose();
matrixoperation.printTranspose();
}
}