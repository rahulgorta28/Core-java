class InsurancePackage{
	
				static double ref = 0.0;
				public static double getPrice(String insranceName){
				
						if(insranceName == "hdf life insrance"){             
                                  ref = 6000.0;
								return ref;
						
						}			
						
						if(insranceName == "max life"){							
									ref = 7000.0;
								return ref;
						
						}
						
						if(insranceName == "icc life insrance"){ 
								   ref = 4000.0;								
								return ref;
									
									
									}
						if(insranceName == "kotak lif insrance"){           
										ref = 5000.0;
									return ref;
									
									}
						
						
						
						
							else{
                              System.out.println( insranceName +" not found ");								
								
							}
						
						
						
						
						return 0.0;
						}
				
	



}