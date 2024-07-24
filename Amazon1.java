class Amazon1{
	
	static String ProductNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addProductName(String ProductName){
	
	boolean isProductNameAdded = false;
	
		if(index < ProductNames.length){
		 if(ProductName!= null){
			ProductNames[index++] = ProductName;
			
		}else
			System.out.println("The Product Name is invalid");
		}else
			System.out.println("Sorry Product name is full:");
		return isProductNameAdded = true;
}
		 public static void printProductNames(){
		 for(String ProductName:ProductNames){
		
		System.out.println("The Product Names are:" + ProductName);
		
		}
		
	
		 }
	
	}



