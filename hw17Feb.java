package hw_oop;

import java.util.Scanner;

public class hw17Feb 
{
	
	public static void printDiagonalSums(int [][]arr, int n){
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += arr[i][i];
				
					}

					System.out.println("Sum of  Diagonal:" + sum);
	                }
	
	
	
//	public static class LowerTriangle
//	{
//	    int n = 4;
//	 
//	   
//	    boolean isLTMatrix(int arr[][])
//	    {
//	        for (int i = 0; i < n; i++)
//	            for (int j = i + 1; j < n; j++)
//	                if (arr[i][j] != 0)
//	                    return false;
//	 
//	        return true;
//	    }
//}
	 

	public static void main(String[] args) {
		
		//LowerTriangle ob = new LowerTriangle();
		Scanner s = new Scanner(System.in);
        int arr[][] = { { 1, 0, 0, 0 },
                        { 1, 4, 0, 0 },
                        { 4, 6, 2, 0 },
                        { 0, 4, 7, 6 } };
        
        printDiagonalSums(arr,4);
                         
        
//        if (ob.isLTMatrix(arr))
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//    }
		
        
        
        int i, j, zero = 0, count = 0; 
     	
     	
            for(i = 0; i < arr.length; i++)
            {
     	    for(j = 0; j < arr[0].length; j++) 
      	    {
                    if(arr[i][j] == 0)
        		{
            	    zero++; 
        		}
        	   	else
                	{
          	            count++;
        	    	}
       	   }
           }
           if(zero>count)
           {
               System.out.println("the matrix is sparse matrix");
           }
           else
           {
               System.out.println("the matrix is not a sparse matrix");
           }
        }

	}




