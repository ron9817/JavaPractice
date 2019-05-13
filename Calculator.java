class calculator{
	private int op1,op2;
	calculator(int op1, int op2){
		this.op1=op1;
		this.op2=op2;
	}
	int add(){
		return this.op1+this.op2;
	}
	int sub(){
		return this.op1-this.op2;
	}
	int mult(){
		return this.op1*this.op2;
	}
	int divide(){
		return this.op1/this.op2;
	}
	
}

class S{
	public static void main(String args[]){
		calculator c=new calculator(2,3);
		System.out.println("ADD"+c.add());
		System.out.println("SUB"+c.sub());
		System.out.println("MULT"+c.mult());
		System.out.println("DIV"+c.divide());
	}
}