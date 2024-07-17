class AirtelPlansPaid{
	
			static String name = "84days";
		public static void main(String[] monthlyPackages){
		System.out.println("main method started");
		
		double price =  AirtelPlans.getprice(name);
		System.out.println(name + " price is: " + price);
		
		System.out.println("main method ended");
		
		
		
		}


}