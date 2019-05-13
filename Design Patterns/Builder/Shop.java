class Shop{
	public static void main(String args[]){
		System.out.println(new ProductBuilder().setName("Blue checked jeans").setSize("XL").getProduct());
		System.out.println(new ProductBuilder().setCost(500).setName("Blue checked jeans").setSize("XL").getProduct());
	}
}