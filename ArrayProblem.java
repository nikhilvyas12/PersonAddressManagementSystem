package com.tsystem.arrayprob;

import java.util.Arrays;

class ArrayProblem{

static int[] moveElementToRight(int []array, int X)
{
 int i = 0;

 int j = array.length - 1;
 
 while (i < j)
 {
     while (i < j && array[j] == X)

         j--;

     if (array[i] == X)

         swap(array, i, j);

     i++;
 }

 return array;
}

static int[] swap(int []arr, int i, int j)
{
 int temp = arr[i];
 arr[i] = arr[j];
 arr[j] = temp;
 return arr;
}

public static void main(String[] args)
{
 int []arr = {10,3,8,9,6,9,4,6,7,2,2};
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