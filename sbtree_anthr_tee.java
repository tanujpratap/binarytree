public class sbtree_anthr_tee {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
this.data=data;
this.left=null;
this.right=null;
        }
    }
    public static boolean isidentical(Node node ,Node subroot){
        if(node==null&&subroot==null){
            return true;
        }
        else if(node ==null||subroot==null||node.data!=subroot.data){
            return false;
        }
        if(!isidentical(node.left, subroot.left)){
            return false;
        }
        if(!isidentical(node.right, subroot.right)){
            return false;
        }
return true;
    }
    public static boolean issubtree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
if(isidentical(root, subroot)){
    return true;
}
        }
        boolean leftans=issubtree(root.left, subroot);
        boolean rightans=issubtree(root.right, subroot);
        return leftans||rightans;
    }
    public static void main(String[] args) {
          /*
         1
        / \
       2   3
      /\   /\
      4 5  6 7
         
         
         
         
         */ 
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new  Node(6);
        root.right.right=new Node(7);

        /*
         2
        / \
        4  5 
         
         */
        Node subroot=new Node(2);
        subroot.left=new Node(4);
      //  subroot.right=new Node(5);
    System.out.println(issubtree(root, subroot));
        }
    
}
