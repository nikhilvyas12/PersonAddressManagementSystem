package com.tsystem.mirroraddmult;
class Node
{
 int data;
 Node left = null, right = null;

 Node(int data) {
     this.data = data;
 }
}

public class BtreeAdMul
{
 public static void preorder(Node root)
 {
     if (root == null) {
         return;
     }

     System.out.print(root.data + " ");
     preorder(root.left);
     preorder(root.right);
 }

 // swap left subtree with right subtree
 public static void swap(Node root)
 {
     if (root == null) {
         return;
     }

     Node temp = root.left;
     root.left = root.right;
     root.right = temp;
 }

 // Function to convert a given binary tree into its mirror
 public static void convertToMirror(Node root)
 {
     if (root == null) {
         return;
     }

     convertToMirror(root.left);

     convertToMirror(root.right);

     swap(root);
 }

 public static void main(String[] args)
 {
     Node root = new Node(9);
     root.left = new Node(6);
     root.right = new Node(3);
     //root.left.left = new Node(2);
     //root.left.right = new Node(7);
     root.right.left = new Node(2);
     root.right.right = new Node(7);
     root.right.left.left = new Node(3);
     root.right.left.right = new Node(5);
     
     convertToMirror(root);
     preorder(root);
     System.out.println("\nTotal is --> "+findSum(root));
     System.out.println("\nMultiplication is --> "+findmul(root));
  //   System.out.println("\nSum of all nodes of binary tree: " + bt.calculateSum(root));
 }
// public Node root;  
//   
// public BtreeAdMul(){  
//   root = null;  
// }
 
// public int calculateSum(Node root){  
//     int sum, sumLeft, sumRight;  
//     sum = sumRight = sumLeft = 0;  
//       
//     if(root == null) {  
//         System.out.println("Tree is empty");  
//         return 0;  
//     }  
//     else {  
//         if(root.left != null)  
//             sumLeft = calculateSum(root.left);  
//           
//         if(root.right != null)  
//             sumRight = calculateSum(root.right);  
//           
//         sum = root.data + sumLeft + sumRight;   
//         return sum;  
//     }      
//   }  
 
 static void calcSum(Node root)
 {
     // Base Case
     if (root == null)
         return;
  
         if (root.left != null)
             res += root.left.data;
  
         if (root.right != null)
             res += root.right.data;
  
  
     calcSum(root.left);
     calcSum(root.right);
     
 }
 static int res;
 static int resmul;
 static int findSum(Node root)
 {
     // Initialize result
     res = 0;
  
     calcSum(root);
     return res;
 }
 static void calcMul(Node root)
 {
     // Base Case
     if (root == null)
         return;
  
         if (root.left == null)
             resmul *= root.data;
  
         else if (root.right == null)
             resmul *= root.data;
         calcMul(root.left);
         calcMul(root.right);
     
 }
 static int findmul(Node root)
 {
     // Initialize result
     resmul=1;
  
     calcMul(root);
     return resmul;
 }
}