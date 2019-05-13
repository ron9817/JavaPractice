class Product{
	private String name;
	private String category;
	private String size;
	private int cost;
	private String colour;
	
	Product(String name, String category, String size, int cost, String colour){
	this.name=name;
	this.category=category;
	this.size=size;
	this.cost=cost;
	this.colour=colour;
	}
	
	public String toString(){
		return ("Name: "+this.name+" Category: "+this.category+" Size: "+this.size+" Cost: "+this.cost+" Colour: "+this.colour);
	}
}