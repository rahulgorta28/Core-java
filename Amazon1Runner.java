class Amazon1Runner{

	public static void main(String[] args){
	
	System.out.println("Main method started");
	
  boolean   isProductNameAdded	= Amazon1.addProductName("Echo Dot (4th Gen)");
			isProductNameAdded	= Amazon1.addProductName("Fire TV Stick 4K");
			isProductNameAdded	= Amazon1.addProductName("Kindle Paperwhite");
			isProductNameAdded	= Amazon1.addProductName("Amazon Basics AA Batteries");
			isProductNameAdded	= Amazon1.addProductName("Ring Video Doorbell");
			isProductNameAdded	= Amazon1.addProductName("Fire HD 10 Tablet");
			isProductNameAdded	= Amazon1.addProductName("Echo Show 8");
			isProductNameAdded	= Amazon1.addProductName("Amazon Smart Plug");
			isProductNameAdded	= Amazon1.addProductName("Fire 7 Kids Edition Tablet");
			isProductNameAdded	= Amazon1.addProductName("AmazonBasics High-Speed HDMI Cable");
  
			
			if(isProductNameAdded){
  
			Amazon1.printProductNames();
			
			boolean isupdated	= Amazon1.updateProductName("Echo Show 8" , "Speaker");
	 if(isupdated)
		 Amazon1.printProductNames();
					boolean  isdeleted = Amazon1.deleteProductName("Amazon Smart Plug");
				if(isdeleted)
					Amazon1.printProductNames();
  }
	
	
	}


}