import java.lang.*;
import java.util.ArrayList;

//pending: try to make the number of stacks dynamic
class MultipleStack{
  ArrayList<Stack> stacks;
  int currentStack, numberOfStacks;
  public final static  int STACK_LIMIT = 5;
  
  public MultipleStack (ArrayList<Stack> stacks){
    this.stacks = stacks;
    numberOfStacks = stacks.size();
    currentStack = 0;
  }
 
  public void push(int val){
    if (stacks.get(currentStack).getSize() == STACK_LIMIT){
      if (currentStack == numberOfStacks-1){
         System.out.println("PUSH all stacks over limit");
        return;
      }
      ++currentStack;
    }
    stacks.get(currentStack).push(val);
    System.out.println("PUSH currentStack="+currentStack+ ", value="+val+", size:"+stacks.get(currentStack).getSize());
  }
  
    public int pop(){
      if (currentStack<0 || currentStack>stacks.size())
        return 0;
      Stack top = stacks.get(currentStack);
      int res = top.pop();
      if (top.size == 0 && currentStack > 0){
        --currentStack;
      }
      System.out.println("POP currentStack="+currentStack+ ", size:"+stacks.get(currentStack).getSize());
      return res;
  }
    
    public int popAt(int stack){
      int res = 0;
      if (stack < 0 || stack >= numberOfStacks)
        return res;
      Stack top = stacks.get(stack);
      
      if (top != null){
        res = top.pop();
      }
        
      return res;
    }
}