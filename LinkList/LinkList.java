//linklist
class Node{
	int data;
	Node next;
}

class LinkList{
	int root= null;
	void insert(int value){
		Node n= new Node();
		if (root==null){
			n.next=null;
			n.data=value;
			root=n;
		}
		else{
			n.data=value;
			Node curr=root;
			while(curr != null){
				curr=curr.next;
			}
			curr.next=n;
			
		}
	}
	
	void delete(int value){
		if(root.data==value){
			root=root.next;
		}
		else{
			Node curr=root;
			Node prev = null;
			while (curr.data!=value){
				prev=curr;
				curr=curr.next;
			}
			prev.next=curr.next;
		}
	}
	
	void print(){
		Node curr=root;
		while(curr!=null){
			System.out.print(curr.data+"-->");
			curr=curr.next;			
		}
	}
}

