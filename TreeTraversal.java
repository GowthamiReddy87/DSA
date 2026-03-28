class Node
{
int data;
Node left,right;
Node(int data)
{
this.data=data;
left=right=null;
}
}
public class TreeTraversal
{
public static int height(Node root) {
if(root == null) return 0;
int left = height(root.left);
int right = height(root.right);
return 1 + Math.max(left, right);
}
public static void main(String[] args)
{
Node root = new Node(10); 
root.left = new Node(20); 
root.left.right=new Node(30);
System.out.println(height(root));
}
}