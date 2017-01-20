import java.lang.*;
//import java.lang.StringBuilder;

class LinkedList {
  
  private Node head;
  
  public LinkedList(Node h){
    head = h;
  }
  
   public int listToNumber(){
     Node h=this.head;
     if (h == null)
       return 0;
     
     if (h.next == null){
       return h.value;
     }
     
     StringBuilder str = new StringBuilder();
     
     str.append( listToNumber(h.next) ).append(h.value+""); //+ listToNumber(++index);
     
     return Integer.parseInt(str.toString());
   }
   
      public int listToNumber(Node h){
     if (h == null)
       return 0;
     
     if (h.next == null){
       return h.value;
     }
     
     StringBuilder str = new StringBuilder();
     
     str.append( listToNumber(h.next) ).append(h.value+""); //+ listToNumber(++index);
     
     return Integer.parseInt(str.toString());
   }
   
   //used in removeDuplicates   
   public boolean isValueFound(int[] arr, int v){
     boolean res = false;
     for (int i = 0;i<arr.length;i++){
       if (arr[i]==v)
         res = true;
     }
     return res;
   }

   public Node removeDuplicates(Node param){
     Node n = param;
     int[] t = new int[10];
     int count = 0;
     t[count] = n.value;

     while(n.next!=null){
       ++count;
       
       if (isValueFound(t,n.next.value)){
         System.out.println("found: "+n.next.value);
         if(n.next.next == null){          
           n.next = null;
         }
         else{
           n.next=n.next.next;
           
         }
       }
       else{
         System.out.println("Not found: "+n.next.value);
         t[count]=n.value;
         n=n.next;
       } 
     }
     return param;
   }
}