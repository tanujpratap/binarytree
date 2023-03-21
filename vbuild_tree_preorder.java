
import java.util.*;

public class vbuild_tree_preorder{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
this.data=data;
this.left=null;
this.right=null;
        }
    }
    static class binarytree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
 if(nodes[idx]==-1){
    return null;
 }
 Node newnode=new Node(nodes[idx]);
 newnode.left=buildtree(nodes);
 newnode.right=buildtree(nodes);
 return newnode;
        }
    
    public static void preorder(Node root){
        if(root==null){
            return; 
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    } 
    public static void inorder(Node root){
        if(root ==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root ==null){
            return;
        }
        postorder(root.left);
       
        postorder(root.right);
        System.out.println(root.data+" ");
    }
    //level order traversal
    public static void levelorder(Node root){
        if(root==null){
            return ;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currnode=q.remove();
            if(currnode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.println(currnode.data+" ");
                if(currnode.left!=null){
                    q.add(currnode.left);
                }
                if(currnode.right!=null){
                    q.add(currnode.right);
                }
            }
        }
    }
}
    public static void main(String[] args) {
      int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};  
      binarytree tree=new binarytree();
     Node root= tree.buildtree(nodes);
    // System.out.println(root.data);
  //  tree.preorder(root);
  //  tree.inorder(root); 
  //  tree.postorder(root);
  tree.levelorder(root);
    }
}