import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class TreePractice {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	
	// Find the height of the tree (longest branch)
	public static int height(Node root) {
        int maxl = 0;
        int maxr = 0;
        
        
        return max(root, maxl, maxr);
      	// Write your code here.
    }
    
	// auxiliar method to height
    public static int max(Node root, int ml, int mr){
        if (root == null || (root.left == null && root.right == null)){
          return 0;
        }
    
       ml = 1+max(root.left, ml, mr);
       mr = 1+max(root.right, ml, mr);
       
        if (ml > mr)
            return ml;
        else
            return mr;
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}