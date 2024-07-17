class Dominos{
		static double ref = 0.0;
			public static double getprice(String SancesName){

			if(SancesName == "Pizza"){
			ref = 100.0;
			return ref;
			}
			if(SancesName == "Burgers"){
			ref =150.0 ;
			return ref;
			}
			if(SancesName == "Tacos"){
			ref = 80.0;
			return ref;
			}
			if(SancesName == "Sushi"){
			ref =90.0 ;
			return ref;
			}
			if(SancesName == " Dumplings"){
			ref = 120.0;
			return ref;
			}
			if(SancesName == "Samosas"){
			ref = 130.0;
			return ref;
			}
			if(SancesName == "Quesadillas"){
			ref =200.0 ;
			return ref;
			}
			if(SancesName == "Naan Pizza"){
			ref =170.0 ;
			return ref;
			}
			if(SancesName == "Momos"){
			ref = 18.0;
			return ref;
			}
			if(SancesName == "Shawarma"){
			ref =120.0 ;
			return ref;
			}
			if(SancesName == "Arepas"){
			ref = 142.0 ;
			return ref;
			}
			if(SancesName == " Empanadas"){
			ref = 50.0 ;
			return ref;
			}
			if(SancesName == " Crepes"){
			ref = 120.0;
			return ref;
			}
			if(SancesName == "Waffles"){
			ref = 240.0 ;
			return ref;
			}
			if(SancesName == "ish Tacos"){
			ref =120.0 ;
			return ref;
			}
			if(SancesName == "Veggie Burgers"){
			ref =45.0 ;
			return ref;
			}
			if(SancesName == "Mac and Cheese"){
			ref = 40.0;
			return ref;
			}
			if(SancesName == "Mac and Cheese"){
			ref = 50.6;
			return ref;
			}
			if(SancesName == "Beef Noodles"){
			ref = 30.0 ;
			return ref;
			}
			if(SancesName == "Vegetable Curry"){
			ref = 140.0;
			return ref;
			}
			else{
			System.out.println(SancesName + " not food");
			
			return ref;
			}



}




}