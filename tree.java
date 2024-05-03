import java.util.LinkedList;
    import java.util.Queue;
public class tree {
    
    
    class Node{
     int key;
     Node left, right;
     
     public Node(int item)
     {
     key=item;
     left=right=null;
     }
    }
    
    class Binary{
     
     Node root;
     
     void LevelOrder()
     {
     Queue<Node>queue=new LinkedList<Node>();
     
     queue.add(root);
     
     while(!queue.isEmpty())
     {
     Node tempnode=queue.poll();
     
     System.out.println(tempnode.key);
     
   
    if(tempnode.left!=null)
     {
     queue.add(tempnode.left);
     }
     
     if(tempnode.right!=null)
     {
     queue.add(tempnode.right);
     }
     }
     }
     
     
     public static void main(String args[])
     {
     Binary tree=new Binary();
     tree.root=new Node(10);
     tree.root.left=new Node(20);
     
     tree.root.right=new Node(30);
     tree.root.left.left=new Node(40);
     tree.root.left.right=new Node(5);
    
}
}
}
// int [] student;
// student = new int[5]; 

// student = {1,2,3,4,5};

// student[3] = 7

// int temp;
//  student [3] = 