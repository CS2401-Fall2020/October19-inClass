
public class BinaryTreeNode {
  char value; 
  BinaryTreeNode left; 
  BinaryTreeNode right;
  
  BinaryTreeNode(char inValue){
    value = inValue;
  }
  
  boolean search(char searchValue) {
    //System.out.println("Searching " + value + " for " + searchValue);
    if(value == searchValue) return true;
    else if( left == null && right == null) return false;
    
    //else return next.search(searchValue);
    if(right == null) return left.search(searchValue);
    if(left == null) return right.search(searchValue);
    
    // neither one is null
    if(left.search(searchValue)) return true;
    return right.search(searchValue);
    
  }
  
  void myNewPrint() {
    myNewPrint(0);
  }
  
  void myNewPrint(int level){
    for(int i=0; i<level; i++) {
      System.out.print(" ");
    }
    System.out.println(value);
    
    //base case..... 
    if(left!=null) left.myNewPrint(level+1);
    if(right!=null) right.myNewPrint(level+1);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + value);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
  
}
