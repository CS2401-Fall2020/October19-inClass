
public class driver {
  public static void main(String[] args) {
    BinaryTreeNode a = new BinaryTreeNode('q');
    a.left = new BinaryTreeNode('b');
    a.right = new BinaryTreeNode('c');
    a.left.left = new BinaryTreeNode('d');
    a.left.right = new BinaryTreeNode('e');
    a.left.left.left = new BinaryTreeNode('f');
    a.left.left.right = new BinaryTreeNode('g');
    a.print();
    
    for(char c = 'a'; c <= 'h'; c++) {
      System.out.println("Found " + c + ": " + a.search(c));
    }
    
    a.myNewPrint();
  }
}
