class Swiggy{
	static double ref = 0.0;
	public static double getprice(String FoodName){

			if(FoodName == "Chicken Wings"){
			ref = 150.0 ;
			return ref;
			}
			if(FoodName == "Falafel"){
			ref = 160.0;
			return ref;
			}
			if(FoodName == "Ramen"){
			ref = 120.0;
			return ref;
			}
			if(FoodName == "Fried Chicken"){
			ref =13.0 ;
			return ref;
			}
			if(FoodName == " Fish & Chips"){
			ref =20.0 ;
			return ref;
			}
			if(FoodName == "Steak"){
			ref = 120.0;
			return ref;
			}
			if(FoodName == "Naan Pizza"){
			ref = 30.0;
			return ref;
			}
			if(FoodName == "Spring Rolls"){
			ref = 40.0;
			return ref;
			}
			if(FoodName == "Chicken Tikka Masala"){
			ref =150.0 ;
			return ref;
			}
			if(FoodName == "Biryani"){
			ref =130.0 ;
			return ref;
			}
			if(FoodName == "Kebabs"){
			ref =80.0 ;
			return ref;
			}
			if(FoodName == "Fajitas"){
			ref = 70.0;
			return ref;
			}
			if(FoodName == "Pad Thai"){
			ref = 40.0 ;
			return ref;
			}
			if(FoodName == " Tiramisu"){
			ref = 50.0;
			return ref;
			}
			if(FoodName == "Bibimbap"){
			ref = 60.0;
			return ref;
			}
			if(FoodName == "Kimchi Fried Rice"){
			ref = 50.0;
			return ref;
			}
			if(FoodName == "Chicken Parmesan"){
			ref = 60.0;
			return ref;
			}
			if(FoodName == "Meatball Subs"){
			ref =60.0 ;
			return ref;
			}
			if(FoodName == "Falafel Wrap"){
			ref = 67.0;
			return ref;
			}
			if(FoodName == "Chicken Fajita Wrap"){
			ref = 18.0;
			return ref;
			}
			else{
			System.out.println(FoodName + " not food");
			
			return ref;
			}



}




}