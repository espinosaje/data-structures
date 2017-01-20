import java.lang.*;

class Stack {
  Node top;
  int min;
  int size;
  
  public Stack(Node c){
    size=0;
    if (c != null){
      top = c;
      min=c.value;
      size++;
    }
  }
  
  public Stack(){
    size=0;
    top=null;
  }

  public void push(int val){
    Node n = new Node(val);
    if (this.top ==null){
      top = n;
      min = top.value;
    }
    else{
      n.next = top;
      top = n;
      if(top.value<min)
        min = top.value;
    }
    size++;
  }
  
  public int pop(){
    if(top != null){
      int res = top.value;
      top=top.next;
      --size;
      return res;
    }
    else{
      return 0;
    }
  }
  
  public int getSize(){
      return size;
  }
    
  public int getMin(){
      return min;
  }
  
  public String toString(){
    if(top == null)
      return "";
    StringBuilder str = new StringBuilder();
    str.append(top.value);  
    while(top.next!=null){
      str.append(", ");
      top=top.next;
      str.append(top.value);
      
    }
    return str.toString();
  }
  
}