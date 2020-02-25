import java.util.Scanner;

public class MatAdd
{
   public static void main(String arg[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter number of rows : ");
      int row = sc.nextInt();
      System.out.println("Please enter number of columns : ");
      int col = sc.nextInt();

      int x[][] = new int[row][col];
      int y[][] = new int[row][col];

      System.out.println("Please enter first matrix - ");
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < col; j++)
         {
            x[i][j] = sc.nextInt();
         }
      }

      System.out.println("Please enter second matrix - ");
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < col; j++)
         {
            y[i][j] = sc.nextInt();
         }
      }
      int z[][] = new int[row][col];
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < col; j++)
         {
            z[i][j] = x[i][j] + y[i][j];
	    
         }
      }

      System.out.println("The addition of two matrices is - ");     
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < col; j++)
         {
            System.out.print(z[i][j] + " ");
         }
         System.out.println();
      }
      int w[][] = new int[row][col];
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < col; j++)
         {
            w[i][j] = x[i][j] - y[i][j];
	    
         }
      }

      System.out.println("The subraction of two matrices is - ");     
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < col; j++)
         {
            System.out.print(w[i][j] + " ");
         }
         System.out.println();
      }
      int t[][] = new int[row][col];
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < col; j++)
         {
            for(int k = 0; k < row; k++)
	    {
	         t[i][j] = t[i][j] + x[i][k] * y[k][j];
	    }
         }
      }

      System.out.println("The multipys of two matrices is - ");     
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < col; j++)
         {
		System.out.print(t[i][j] + " ");
	 }
         System.out.println();
      }
      sc.close();

   }
}
