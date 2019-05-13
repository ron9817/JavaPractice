//Tree traversal

class Node{
  int data;
  Node lc=null, rc=null;
}
class Tree{
  Node root =null;
 void insert(int value){
   Node nw= new Node();
   nw.data=value;
   if(root==null){
     root=nw;
     System.out.println("Insert at root");
   }else{
   Node temp= root, par=null;
   while(temp!=null){
     if(temp.data>value){
       par=temp;
       temp=temp.lc;
     }
     else{
       par=temp;
       temp=temp.rc;
     }
   }
   if(par.data>value){
     par.lc=nw;
     System.out.println("Insert at lc");
   }else{
     par.rc=nw;
     System.out.println("Insert at rc");
   }
  
   }
 }

  
  void preorder(Node n){
    if(n!=null){
      System.out.print(n.data+", ");
      preorder(n.lc);
      preorder(n.rc);
    }
  }

  void inorder(Node n){
    if(n!=null){
      inorder(n.lc);
      
      System.out.print(n.data+", ");
      
      inorder(n.rc);
    }
  }

  void postorder(Node n){
    if(n!=null){
      postorder(n.lc);
      postorder(n.rc);
      System.out.print(n.data+", ");
    }
  }

}

class Main{
 public static void main(String [] args){
   Tree k=new Tree();
   k.insert(5);//root
   k.insert(4);//lc
   k.insert(6);//rc
   k.insert(2);//lc
   k.insert(3);//rc
   k.insert(8);//rc
   k.insert(7);//lc

   System.out.println("PreOrder");
   k.preorder(k.root);
   System.out.println("\nInOrder");
   k.inorder(k.root);
   System.out.println("\nPostOrder");
   k.postorder(k.root);
 }
}
/*
             5
            4  6
          2     8
           3   7
*/

