package com.tsystem.arrayprob;

import java.util.Arrays;

class ArrayProblem{

    public static int[] moveElementToRight(int[] A , int X)
    {
        int k = 0;
 
        for (int i: A)
        {
            if (i != X) {
                A[k++] = i;
            }
        }
 
        // move all elements to the end of the array (remaining indices)
        for (int i = k; i < A.length; i++) {
            A[i] = X;
        }
		return A;	
    }
	
	
public static void main(String[] args)
{
 int []arr = {10,3,8,9,2,6,9,4,2,6,7};
 int X = 2;
 int Z =3;
 int []sortarr = moveElementToRight(arr, X);

 for(int i = 0; i < arr.length; i++)
 {
    
 if(sortarr[i] % Z ==0)
 {
 System.out.println("Index is :- "+i +" "+" value is :- "+sortarr[i]);
 }
 }
 
 
 Arrays.stream(sortarr).forEach(e->System.out.print(e + " "));
}
}