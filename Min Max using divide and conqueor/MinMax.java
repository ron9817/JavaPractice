//MinMax
class MinMax{
	int [] getMinMax(int [] A, int l, int h){
		//System.out.println("A");
		//for(int i=l; i<=h; i++){
		//	System.out.println(A[i]);
		//}
		//System.out.println("l: "+l+"h: "+h);
		if(l==h){
			return new int[] {A[l], A[h]};
		}else if(h-l==1){
			if(A[l]>A[h])
				return new int [] {A[h], A[l]};
			else
				return new int [] {A[l], A[h]};
		}else{
			int min, max;
			int mid= (l+h)/2;
			int [] left=new int[2];
			int [] right=new int[2];
			left=this.getMinMax(A,l,mid);
			right=this.getMinMax(A,mid+1,h);
			if(left[0]<right[0])
				min=left[0];
			else
				min = right[0];
			if(left[1]>right[1])
				max=left[1];
			else
				max=right[1];
			//System.out.println("For l , h: "+l+" "+h+" "+min+"<--Min Max-->"+max);
			return new int[] {min, max};
		}
	}
}

class Starrt{
	public static void main(String args[]){
		int [] outpput=new MinMax().getMinMax(new int[]{5,4,6,3,0,2,8,9,1,10},0,9);
		System.out.println(outpput[0]+"<--Min Max-->"+outpput[1]);
		outpput=new MinMax().getMinMax(new int[]{15,4,6,33,10,20,8,9,154,100},0,9);
		System.out.println(outpput[0]+"<--Min Max-->"+outpput[1]);
	}
}