//priority q
//max element will get out first
class PriorityQueue{
	int f=0;
	int r=-1;
	int [] Q= new int[10];
	void enqueue(int data){
		r++;
		if(r<10){
			int t;
			int pos=f;
			for(int i=f; i<r; i++){
				if(data<Q[i]){
					pos=i+1;
				}else{
					break;
				}
			}
			for(int i=pos; i<r; i++){
				t=Q[i];
				Q[i]=data;
				data=t;
			}
			Q[r]=data;
		}
		for (int i=f;i<=r;i++)
			System.out.print(Q[i]+", ");
		System.out.println("\ndata: "+data);
	}
}

class StarttP{
	public static void main(String args[]){
		PriorityQueue q=new PriorityQueue();
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(1);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(4);
		q.enqueue(7);
	}
}