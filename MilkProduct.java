class MilkProduct{

			static double ref = 0.0;
		public static double getPrice(String milkProductName){

		if( milkProductName == "Whole Milk"){
				ref=30.0;
				return ref;
		}
		if( milkProductName == "Skim Milk"){
				ref=20.0;
				return ref;
		}
		if( milkProductName == "2% Milk"){
				ref=20.0;
				return ref;
		}
		if( milkProductName == "Condensed Milk"){
				ref=30.0;
				return ref;
		}
		if( milkProductName == "Evaporated Milk"){
				ref=40.0;
				return ref;
		}
		if( milkProductName == "Buttermilk"){
				ref=40.0;
				return ref;
		}
		if( milkProductName == "Heavy Cream"){
				ref=40.0;
				return ref;
		}
		if( milkProductName == "Half-and-Half"){
				ref=40.0;
				return ref;
		}
		if( milkProductName == "Lactose-Free Milk"){
				ref=40.0;
				return ref;
		}
		if( milkProductName == "Powdered Milk"){
				ref=30.0;
				return ref;
		}
		else{
		System.out.println(milkProductName + " not found ");
		return ref;
		}




}









}