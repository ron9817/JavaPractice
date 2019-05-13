/*
Builder Design Pattern
It is a creational design pattern
create phone analogy-->we dont want to set all parameters and not in order

here we use a builder class to build our object eg- cocala bottle build in assembly line
input is the same object and output isthe same object

*/

class phone{
	private String os;
	private int ram;
	private String processor;
	//and so on
	phone(String os; int ram; String processor){
		this.os=os;
		this.ram=ram;
		this.processor=processor;
	}
	String toString(){.....//will call when object is printed}
}

class Shop{
	public static void main(String args[]){
		Phone p=new Phone(//now u need to mention all parameters in object n also need to mention all parameters u cannot leave blank any parameter)
	}
}

//correct approach
class phoneBuilder{
	phoneBuilder setOS(){
		this.os;
		return this;		
	} 
	//llly for all
	phone getPhone(){
		return new Phone(os.......);
	}
}

class Shop{
	public static void main(String args[]){
		Phone p=new phoneBuilder().setOS("A").setRam(2).getPhone();
		System.out.print(p);
	}
}