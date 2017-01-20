import java.util.*;
import java.lang.*;
//import java.io.*;

class HelloWorldApp {
    public static void main(String[] args) {
      Node n1 = new Node(66);
      //Node n2 = new Node(33);
      n1.addToTail(5);
      n1.addToTail(4);
        System.out.println("test 1:"+n1.value+", last:"+n1.next.next.value); // Display the string.
    }
}