class SangeethaMobiles{
static double ref = 0.0;
		public static double getPrice(String mobileBrand){
		if(mobileBrand == "Vivo T3x"){
			ref = 16.499;
			return ref;
			}
			if(mobileBrand == "Poco M6 Pro 5G"){
			ref = 9.999;
			return ref;
			}
			if(mobileBrand == "Motorola Moto G34 5G"){
			ref = 11.705;
			return ref;
			}
			if(mobileBrand == "Xiaomi Redmi 13 5"){
			ref = 13.999;
			return ref;
			}
			if(mobileBrand == "Xiaomi Redmi 13C 5G"){
			ref = 14.999;
			return ref;
			}
			if(mobileBrand == "iQOO Z9x"){
			ref=10.999;
			return ref;
			}
			if(mobileBrand == "Realme"){
			ref = 10.999;
			return ref;
			}
			if(mobileBrand == "Lava"){
			ref = 11.987;
			return ref;
			}
			if(mobileBrand == "Samsung"){
			ref = 20.000;
			return ref;
			}
			if(mobileBrand == "croma"){
			ref = 11.000;
			return ref;
			}
			if(mobileBrand == "smartPhone"){
			ref = 13.000;
			return ref;
			}
			if(mobileBrand == "oppoa53"){
			ref = 14.457;
			return ref;
			}
			if(mobileBrand == "oppo"){
			ref = 15.000;
			return ref;
			}
			if(mobileBrand == "vivo"){
			ref = 14.000;
			return ref;
			}
			if(mobileBrand == "Tecno"){
			ref = 18.000 ;
			return ref;
			}
			if(mobileBrand == "poco"){
			ref = 17.000;
			return ref;
			}
			
		else{
		System.out.println(mobileBrand + " not found ");
		return ref;
		}


}



}