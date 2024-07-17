class FlightInfo{
		static double ref = 0.0;
		public static double getprice(String destinationName){
		
				if(destinationName == "new york"){
				ref = 50.000;
				return ref;
		}
		
		
				if(destinationName == "India"){
				ref = 40.000;
				return ref;
		}
		
				if(destinationName == "Australia"){
				ref = 50.000;
				return ref;
		}
		
				if(destinationName == "South Africa"){
				ref = 40.000;
				return ref;
		}
		
				if(destinationName == "newzeland"){
				ref = 70.000;
				return ref;
		}
		
				if(destinationName == "Germany"){
				ref=50.000;
				return ref;
		}
		
				if(destinationName == "Italy"){
				ref=25.000;
				return ref;
		}
		
				if(destinationName == "Spain"){
				ref=25.000;
				return ref;
		}
		
				if(destinationName == "Russia"){
				ref=30.000;
				return ref;
		}
		
				if(destinationName == "england"){
				ref=50.000;
				return ref;
		}
		
				if(destinationName == "west Indies"){
				ref=25.000;
				return ref;
		}
		
				if(destinationName == "usa"){
				ref=30.000;
				return ref;
		}
		
				if(destinationName == "Egypt"){
				ref=25.000;
				return ref;
		}
		
				if(destinationName == "South Korea"){
				ref=30.000;
				return ref;
		}
		
				if(destinationName == "Nigeria"){
				ref=20.000;
				return ref;
		}
		
				if(destinationName == "Saudi Arabia"){
				ref=27.000;
				return ref;
		}
		
				if(destinationName == "zimbabwe"){
				ref=20.000;
				return ref;
		}
		
				if(destinationName == "nepal"){
				ref=20.000;
				return ref;
		}
		
				if(destinationName == "srilanka"){
				ref=30.000;
				return ref;
		}
		
				if(destinationName == "bangladesh"){
				ref=40.000;
				return ref;
		}
		
		
		else {
		System.out.println(destinationName + " not found ");
		return ref;
		
		}
		
		
		}




}