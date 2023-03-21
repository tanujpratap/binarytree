public class sum_of_nodes {
static class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
         
    }
}
public static int height(Node root){
    if(root==null){
        return 0;
    }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
    return Math.max(leftheight,rightheight)+1;
}
public static int count(Node root){
    if(root==null){
        return 0;
    }
        int leftcount=count(root.left);
        int rightcount=count(root.right);
    return leftcount+rightcount+1; 
}

public static int sum(Node root){
    if(root==null){
        return 0;
    }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
    return leftsum+rightsum+root.data; 
}
public static int diameter(Node root){//tc=o(n^2)
    if(root ==null){
        return 0;
    }
    int ld=diameter(root.left);
    int rd=diameter(root.right);
   int lh=height(root.left);
   int rh=height(root.right);
   int selfdiam=lh+rh+1;
   return Math.max(selfdiam,Math.max(ld,rd));
}
static class info{
    int diam;
    int height;

public info(int diam,int height){
this.diam=diam;
this.height=height;
}
}
    public static info diameter2(Node root){
        if(root==null){
          return  new info(0, 0);
        }
info leftinfo=diameter2(root.left);
info rightinfo=diameter2(root.right);
int  diam=Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.height+rightinfo.height+1);
int height=Math.max(leftinfo.height,rightinfo.height)+1;
return new info(diam,height);
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
       root.right.right=new Node(7); 
       root.right.left=new Node(6);
       System.out.println(height(root));
       System.out.println(count(root));
       System.out.println(sum(root));
      // System.out.println(diameter(root));
       System.out.println(diameter2(root).diam);
    }
    
}
