//HASHING 
//Hashing using mod 10
//This program can be used to store a key and search for it(no delete)
class Hashing{
	int [] storage= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	void insert(int data){
		int hashV=data%10;
		if(this.storage[hashV]==-1){
			this.storage[hashV]=data;
		}else{
			hashV=++hashV%10;
			this.insert(data,hashV);
		}
		for(int i=0;i<10;i++){
			System.out.print(storage[i]+" : ");
		}
		System.out.println();
	}
	void insert(int data, int hashV){
		if(this.storage[hashV]==-1){
			this.storage[hashV]=data;
		}else{
			hashV=++hashV%10;
			this.insert(data,hashV);
		}
		for(int i=0;i<10;i++){
			System.out.print(storage[i]+" : ");
		}
		System.out.println();
	}
	
	boolean search(int data){
		int hashV=data%10;
		if(this.storage[hashV]==data){
			return true;
		}else if(this.storage[hashV]==-1){
			return false;
		}else{
			hashV=++hashV%10;
			return this.search(data, hashV);
		}
		
	}
	boolean search(int data, int hashV){
		if(this.storage[hashV]==data){
			return true;
		}else if(this.storage[hashV]==-1 || hashV==data%10){
			return false;
		}else{
			hashV=++hashV%10;
			return this.search(data, hashV);
		}
		
	}
}
class TestHash{
	public static void main(String args[]){
		Hashing h=new Hashing();
		h.insert(111);
		h.insert(104);
		h.insert(128);
		h.insert(512);
		h.insert(235);
		h.insert(701);
		h.insert(923);
		h.insert(910);
		System.out.println("Search 104: "+h.search(104));
		System.out.println("Search 701: "+h.search(701));
		System.out.println("Search 923: "+h.search(923));
		System.out.println("Search 924: "+h.search(924));
	}
}


/* Previous wrong code

class Hashing{
	int [] storage= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	
	void insert(int data){
		int hashV=data%10;
		if(this.storage[hashV]==-1){
			this.storage[hashV]=data;
		}else{
			hashV=this.storage[hashV]%10;
			this.insert(data,hashV);
		}
		for(int i=0;i<10;i++){
			System.out.print(storage[i]);
		}
		System.out.println();
	}
	void insert(int data, int hashV){
		if(this.storage[hashV]==-1){
			this.storage[hashV]=data;
		}else{
			hashV=this.storage[hashV]%10;
			this.insert(data,hashV);
		}
		for(int i=0;i<10;i++){
			System.out.print(storage[i]);
		}
		System.out.println();
	}
	
	boolean search(int data){
		int hashV=data%10;
		if(this.storage[hashV]==data){
			return true;
		}else if(this.storage[hashV]==-1){
			return false;
		}else{
			hashV=this.storage[hashV]%10;
			return this.search(data);
		}
		
	}
	boolean search(int data, int hashV){
		if(this.storage[hashV]==data){
			return true;
		}else if(this.storage[hashV]==-1){
			return false;
		}else{
			hashV=this.storage[hashV]%10;
			return this.search(data, hashV);
		}
		
	}
}

*/