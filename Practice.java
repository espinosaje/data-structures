import java.lang.*;
import java.util.ArrayList;

class Practice {
    public static void main(String[] args) {
 
      Practice obj = new Practice();
     // int[] ar = {5,2,4,4,3};
      obj.testMatrix();
      
        //System.out.println("find :"+obj.findPair(ar,8)); // Display the string.
    }
    
    ///// ******* Test Methods ******* /////
    ///// ******* Test Methods ******* /////
    ///// ******* Test Methods ******* /////
    public void testList(){
      Node n1 = new Node(9);      
      n1.addToTail(5);
      n1.addToTail(4);
      n1.addToTail(5);
      n1.addToTail(5);
      n1.addToTail(9);
      n1.addToTail(2);
      n1.addToTail(1);      
      LinkedList list = new LinkedList(n1);
    } 
      
    public void testStack(){
      Node n2 = new Node(33);
      Stack pila = new Stack(n2);
      pila.push(55);
      pila.push(11);
      pila.push(66);
      pila.push(22);
      pila.push(77);
      pila.push(88);
      
      pila.pop();pila.pop(); pila.getMin();
      
      pila.pop(); pila.getMin();
    }
    
    public void testMultiStack(){
      Node n1 = new Node(33);
      Stack pila1 = new Stack(n1);
      Node n2 = new Node(10);
      Stack pila2 = new Stack(n2);
      
      ArrayList<Stack> msList = new ArrayList<Stack>();
      msList.add(pila1);
      msList.add(pila2);
      
      MultipleStack ms = new MultipleStack(msList);
  
      ms.push(55);
      ms.push(11);
      ms.push(66);
      ms.push(22);
      
      ms.pop();ms.pop(); //ms.getMin();
      
      ms.push(55);
      ms.push(11);
      ms.push(66);
      ms.push(22);
      ms.popAt(0);
      ms.push(55);
      ms.push(11);
      ms.push(66);
      ms.push(22);
      
      ms.pop(); ms.pop();ms.pop();ms.pop();ms.pop();
      
      ms.pop(); ms.pop();ms.pop();ms.pop();ms.pop();
    }
   
    public void hanoi(){      
      Node n1 = new Node(4);
      Stack a = new Stack(n1);
      Stack b = new Stack();
      Stack c = new Stack();
      
      a.push(3);
      a.push(2);
      //a.push(1);
      
      int noOfDisks = a.size;
      
      moveDisks(noOfDisks, a, b, c);
      System.out.println("result:"+c);
    }
    
    public void moveDisks(int n, Stack src, Stack aux, Stack des){
      if (n == 0) return;
      
      moveDisks(n-1,src,des,aux);
      des.push(src.pop());
      System.out.println("src:"+src.getSize()+", aux:"+aux.getSize()+", des:"+des.getSize());
      moveDisks(n-1,aux,src,des);
      
    }
    
    //return 2 numbers in an array that matches the sum... exmple: ([5,2,4,4],8) = 4,4
    public int[] findPair(int[] arr, int sum){
      int[] res = new int[2];
      int i=0,j=0,current, wanted;
      int size = arr.length;
      while (i<size){
        res[0]=arr[i];
        wanted = sum-res[0];
        while (j<size){
          System.out.println("i:"+i+",j:"+j+",curr:"+res[0]+",want:"+wanted+",j:"+arr[j]);
          if(wanted == arr[j] && i!=j){
            res[1]=wanted;
            System.out.println("res:"+res[0]+","+res[1]);
            return res;
          }
          j++;
        }
        i++;
        j=0;
       // System.out.println("size:"+size);
      }
      System.out.println("not found:");
      return null;
    }

    public void testMatrix(){
      int[][] v={{1,2,3},{3,4,5},{5,6,7}};
      Matrix m = new Matrix(v);
      System.out.println(""+m);
      System.out.println(""+m.rotate());
    }
}