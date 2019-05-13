class ProductBuilder{
	private String name;
	private String category;
	private String size;
	private int cost;
	private String colour;
	
	ProductBuilder setName(String x){
		this.name=x;
		return this;
	}
	ProductBuilder setCategory(String x){
		this.category=x;
		return this;
	}
	ProductBuilder setSize(String x){
		this.size=x;
		return this;
	}
	ProductBuilder setCost(int x){
		this.cost=x;
		return this;
	}
	ProductBuilder setColour(String x){
		this.colour=x;
		return this;
	}
	Product getProduct(){
		return new Product(this.name,this.category,this.size,this.cost,this.colour);
	}
}