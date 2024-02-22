import java.util.Scanner;

public class MatrixProduct{
    public static void main(String[]args){
        //Below is a program that will allow the user to input two matrices and output the product of the matrices
        //Instantiating Scanner object

        Scanner input = new Scanner(System.in);

        //Initializing variables
        int i,j,k,num;
        int sum=0;
        int[][] a= new int[50][50];
        int [][] b = new int[50][50];
        int[][] c= new int [50][50];

        // Intro text
        System.out.println("Please enter the number of elements to be obtained in your matrices");
        num= input.nextInt();

        //First matrix

        System.out.println("Now please enter the first matrix of "+(num*num)+" values");
        //First loop to accept the matrix
        for(i=0;i<num;i++){
            for(j=0;j<num;j++){
                a[i][j]=input.nextInt();
            }

        }
        System.out.println("Your first matrix is");
        for(i=0;i<num;i++){
            for(j=0;j<num;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }

        //Second matrix

        System.out.println("Please enter your second matrix of "+(num*num)+ " values");
        
        //Second loop for the second matrix
        for(i=0;i<num;i++){
            for(j=0;j<num;j++){
                b[i][j]=input.nextInt();
            }

        }
        System.out.println("Your second matrix is");
        for(i=0;i<num;i++){
            for(j=0;j<num;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();

        }
        //The result of the product of the two matrices
        System.out.println("The multiplication of the first and the second array is given below ");

	for(i=0;i<num;i++)
	{
		for(j=0;j<num;j++)
		{
			sum=0;
			for(k=0;k<num;k++)
			{
			sum=sum+ a[i][k]*b[k][j];
				
			}
			c[i][j]= sum;
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
        
    }
}
}