import java.lang.*;

class Queue {
  Node last;
  Node first;
  int size;
  public Queue(Node c){
    first = c;
  }

  public void push(int val){
    Node n = new Node(val);
    if (this.first ==null){
      System.out.println("PUSH FIRST res.value="+n.value);
      first = n;      
    }
    else{
      if (this.last ==null){
        System.out.println("PUSH LAST res.value="+n.value);
        first.next=n;
        last=n;
      }
      else{
       // Node temp = last;
        last.next = n;
        last=n;
        
        System.out.println("PUSH res.value="+last.value);
      }
      
    }
  }
  
    public int pop(){
      if (this.first ==null){
        System.out.println("nul");
        return 0;
      }
      else{
       Node res = first;
       first=first.next;
        //first = null;
        System.out.println("POP res.value="+res.value);
        return res.value;
      }
  }
  
  public String toString(){
    if(first == null)
      return "";
    StringBuilder str = new StringBuilder();
   // str.append(top.value);  
    while(last.next!=null){
      str.append(", ");
      last=last.next;
      str.append(last.value);
      
    }
    return str.toString();
  }
  
}