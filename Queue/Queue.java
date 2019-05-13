//queue
class Queue{
	int fe=-1;
	int re=-1;
	int [] Q=new int[20];
	void enqueue(int data){
		if(re<19){
			re++;
			Q[re]=data;
		}
	}
	int dequeue(){
		if(re!=-1){
			fe++;
			return Q[fe];
		}
		return -1;
	}
}

class Startt{
	public static void main(String args[]){
		Queue qqq= new Queue();
		qqq.enqueue(1);
		qqq.enqueue(2);
		System.out.println(qqq.dequeue());
		qqq.enqueue(3);
		qqq.enqueue(4);
		qqq.enqueue(5);
		System.out.println(qqq.dequeue());
		System.out.println(qqq.dequeue());
		System.out.println(qqq.dequeue());
		System.out.println(qqq.dequeue());
		qqq.enqueue(6);
		qqq.enqueue(7);
		System.out.println(qqq.dequeue());
	}
}