import java.util.*;
import java.lang.*;
//import java.io.*;

class Node{

public Node next;
int value;

public Node(int v){
  value = v;
}

public void addToTail(int value){
  Node tail = new Node(value);
  Node current=this;
  while(current.next != null){
    current = current.next;
  }
  current.next=tail;
}

}