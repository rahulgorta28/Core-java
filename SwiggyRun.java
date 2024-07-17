class SwiggyRun{
	static String name = "Bibimbap";
	public static void main(String[] Foodname){
		System.out.println("main is started");
		double price = Swiggy.getprice(name);
		System.out.println(name + " get price is: " + price);
		System.out.println("main is ended");
	

}

}